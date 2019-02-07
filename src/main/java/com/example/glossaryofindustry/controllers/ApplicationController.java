package com.example.glossaryofindustry.controllers;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.glossaryofindustry.container.WebRequestForm;
import com.example.glossaryofindustry.container.WebResponseResult;
import com.example.glossaryofindustry.controllers.receiver.WebReceiver;

@Controller
public class ApplicationController {

    @Autowired
    private Map<String, WebReceiver> receiverMap;

    private WebReceiver receiver;

    @ModelAttribute
    public WebRequestForm generateRequestForm(@PathVariable String className) throws Exception {
        // receiverを初期化する
        receiver = receiverMap.get(className + "Receiver");
        // requestFormを初期化する
        String requestFormName = className.substring(0, 1).toUpperCase() + className.substring(1);
        String strRequestForm = "com.example.glossaryofindustry.container.requestform." + requestFormName
                + "RequestForm";
        Class<?> requestClss = Class.forName(strRequestForm);
        WebRequestForm requestForm = (WebRequestForm) requestClss.newInstance();
        return requestForm;
    }

    @GetMapping("/{className}")
    public String index(@PathVariable String className, Model model) throws Exception {
        Method method = receiver.getClass().getMethod("init");
        WebResponseResult<?> result = (WebResponseResult<?>) method.invoke(receiver);
        model.addAttribute("form", result.getResponseForm());
        return result.getTemplateName();
    }

    @PostMapping("/{className}/{methodName}")
    public String terminology(@ModelAttribute WebRequestForm requestForm, @PathVariable String className,
            @PathVariable String methodName, Model model) throws Exception {
        // methodを実行する
        Method method = receiver.getClass().getMethod(methodName, new Class[] { requestForm.getClass() });
        WebResponseResult<?> result = (WebResponseResult<?>) method.invoke(receiver, requestForm);
        model.addAttribute("form", result.getResponseForm());
        model.addAttribute("info", result.getInfoMessageList());
        model.addAttribute("err", result.getErrMessageList());
        return result.getTemplateName();
    }

}
