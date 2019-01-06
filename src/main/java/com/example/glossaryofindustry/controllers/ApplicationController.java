package com.example.glossaryofindustry.controllers;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.glossaryofindustry.container.WebRequestForm;
import com.example.glossaryofindustry.container.WebResponseResult;
import com.example.glossaryofindustry.controllers.receiver.WebReceiver;
import com.example.glossaryofindustry.domains.Users;
import com.example.glossaryofindustry.mappers.UsersMapper;

@Controller
public class ApplicationController {

    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/")
    public String index(Model model) {
        List<Users> users = usersMapper.all();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/{className}/{methodName}")
    @ResponseBody
    public String terminology(Model model, @PathVariable String className, @PathVariable String methodName)
            throws Exception {
        WebResponseResult result;
        // リクエストフォームを初期化する
        String strRequestForm = className + "RequestForm";
        Class requestClss = Class.forName(strRequestForm);
        WebRequestForm requestForm = (WebRequestForm) requestClss.newInstance();
        // レシーバーを初期化する
        Class receiverClass = Class.forName(className);
        WebReceiver receiver = (WebReceiver) receiverClass.newInstance();
        // メソッドを実行する
        Method method = receiver.getClass().getMethod(methodName, new Class[] { WebRequestForm.class });
        result = (WebResponseResult) method.invoke(receiver, requestForm);
        model.addAttribute("form", result.getResponseForm());
        model.addAttribute("info", result.getInfoMessageList());
        model.addAttribute("err", result.getErrMessageList());
        return result.getClassName();
    }

}
