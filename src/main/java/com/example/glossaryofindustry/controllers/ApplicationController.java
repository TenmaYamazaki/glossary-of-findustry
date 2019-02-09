package com.example.glossaryofindustry.controllers;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.glossaryofindustry.container.SessionBean;
import com.example.glossaryofindustry.container.WebRequestForm;
import com.example.glossaryofindustry.container.WebResponseResult;
import com.example.glossaryofindustry.container.responseform.LoginResponseForm;
import com.example.glossaryofindustry.controllers.receiver.WebReceiver;

@Controller
public class ApplicationController {

    @Autowired
    SessionBean session;
    @Autowired
    private Map<String, WebReceiver> receiverMap;

    private WebReceiver receiver;

    @ModelAttribute
    public WebRequestForm generateRequestForm(@PathVariable String className) throws Exception {
        // receiverを初期化する
        if (!className.equals("logout")) {

            receiver = receiverMap.get(className + "Receiver");
            // requestFormを初期化する
            String requestFormName = className.substring(0, 1).toUpperCase() + className.substring(1);
            String strRequestForm = "com.example.glossaryofindustry.container.requestform." + requestFormName
                    + "RequestForm";
            Class<?> requestClss = Class.forName(strRequestForm);
            WebRequestForm requestForm = (WebRequestForm) requestClss.newInstance();
            return requestForm;
        }
        return null;
    }

    @GetMapping("/{className}")
    public String index(@PathVariable String className, Model model) throws Exception {
        if (className.equals("logout")) {
            session.setUserName("");
            LoginResponseForm responseForm = new LoginResponseForm();
            responseForm.setUserName(session.getUserName());
            model.addAttribute("form", responseForm);
            return "login/loginIndex";
        }
        if (!className.equals("login")) {
            if (session.getUserName() == null || session.getUserName().equals("")) {
                LoginResponseForm responseForm = new LoginResponseForm();
                responseForm.setUserName(session.getUserName());
                model.addAttribute("form", responseForm);
                model.addAttribute("info", new ArrayList<>());
                model.addAttribute("err", new ArrayList<>());
                return "login/loginIndex";
            }
        }
        Method method = receiver.getClass().getMethod("init");
        WebResponseResult<?> result = (WebResponseResult<?>) method.invoke(receiver);
        result.getResponseForm().setUserName(session.getUserName());
        model.addAttribute("form", result.getResponseForm());
        model.addAttribute("info", result.getInfoMessageList());
        model.addAttribute("err", result.getErrMessageList());
        return className + "/" + result.getTemplateName();
    }

    @PostMapping("/{className}/{methodName}")
    public String terminology(@ModelAttribute WebRequestForm requestForm, @PathVariable String className,
            @PathVariable String methodName, Model model) throws Exception {
        if (!className.equals("login")) {
            if (session.getUserName() == null || session.getUserName().equals("")) {
                LoginResponseForm responseForm = new LoginResponseForm();
                responseForm.setUserName(session.getUserName());
                model.addAttribute("form", responseForm);
                model.addAttribute("info", new ArrayList<>());
                model.addAttribute("err", new ArrayList<>());
                return "login/loginIndex";
            }
        }
        // methodを実行する
        Method method = receiver.getClass().getMethod(methodName, new Class[] { requestForm.getClass() });
        WebResponseResult<?> result = (WebResponseResult<?>) method.invoke(receiver, requestForm);
        result.getResponseForm().setUserName(session.getUserName());
        model.addAttribute("form", result.getResponseForm());
        model.addAttribute("info", result.getInfoMessageList());
        model.addAttribute("err", result.getErrMessageList());
        return className + "/" + result.getTemplateName();
    }

}
