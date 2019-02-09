package com.example.glossaryofindustry.controllers.receiver;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.glossaryofindustry.container.SessionBean;
import com.example.glossaryofindustry.container.WebResponseResult;
import com.example.glossaryofindustry.container.requestform.LoginRequestForm;
import com.example.glossaryofindustry.container.responseform.LoginResponseForm;
import com.example.glossaryofindustry.container.searchcondition.UsersSearchCondition;
import com.example.glossaryofindustry.service.UserService;

@Component
public class LoginReceiver implements WebReceiver {

    @Autowired
    HttpSession session;
    @Autowired
    SessionBean sessionBean;

    @Autowired
    UserService userService;

    public WebResponseResult<LoginResponseForm> init() {
        WebResponseResult<LoginResponseForm> result = new WebResponseResult<>();
        LoginResponseForm responseForm = new LoginResponseForm();

        result.setTemplateName("loginIndex");
        result.setResponseForm(responseForm);
        return result;
    }

    public WebResponseResult<LoginResponseForm> signup(LoginRequestForm requestForm) {
        WebResponseResult<LoginResponseForm> result = new WebResponseResult<>();
        LoginResponseForm responseForm = new LoginResponseForm();

        result.setTemplateName("loginSignUp");
        result.setResponseForm(responseForm);
        return result;
    }

    public WebResponseResult<LoginResponseForm> register(LoginRequestForm requestForm) {
        WebResponseResult<LoginResponseForm> result = new WebResponseResult<>();
        LoginResponseForm responseForm = new LoginResponseForm();
        String userName = requestForm.getUserName();
        String pasword = requestForm.getPasword();

        if (requestForm.getUserName().equals("") || requestForm.getUserName() == null) {
            result.addErrMessage("ユーザー名を入力してください");
        }
        if (requestForm.getPasword().equals("") || requestForm.getPasword() == null) {
            result.addErrMessage("パターンを入力してください");
        }
        UsersSearchCondition searchCondition = new UsersSearchCondition();
        searchCondition.setUserName(userName);
        if (!userService.findBySearchCondition(searchCondition).isEmpty()) {
            result.addErrMessage("そのユーザー名はすでに使用されています");
        }
        if (!result.getErrMessageList().isEmpty()) {
            result.setTemplateName("loginSignUp");
            result.setResponseForm(responseForm);
            return result;
        }

        userService.createUser(userName, pasword);
        result.addInfoMessage("登録が完了しました");
        result.setTemplateName("loginIndex");
        result.setResponseForm(responseForm);
        return result;
    }

    public WebResponseResult<LoginResponseForm> compleate(LoginRequestForm requestForm) {
        WebResponseResult<LoginResponseForm> result = new WebResponseResult<>();
        LoginResponseForm responseForm = new LoginResponseForm();
        String userName = requestForm.getUserName();
        String pasword = requestForm.getPasword();

        if (requestForm.getUserName().equals("") || requestForm.getUserName() == null) {
            result.addErrMessage("ユーザー名を入力してください");
        }
        if (requestForm.getPasword().equals("") || requestForm.getPasword() == null) {
            result.addErrMessage("パターンを入力してください");
        }
        UsersSearchCondition searchCondition = new UsersSearchCondition();
        searchCondition.setUserName(userName);
        searchCondition.setPasword(pasword);
        if (userService.findBySearchCondition(searchCondition).isEmpty()) {
            result.addErrMessage("ユーザー名かパスワードが間違っています");
        }
        if (!result.getErrMessageList().isEmpty()) {
            result.setTemplateName("loginIndex");
            result.setResponseForm(responseForm);
            return result;
        }

        sessionBean.setUserName(userName);
        result.setResponseForm(responseForm);
        result.setTemplateName("index");
        return result;
    }

}
