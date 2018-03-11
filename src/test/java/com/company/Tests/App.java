package com.company.Tests;

import com.company.Helpers.AfterLoginHelper;
import com.company.Helpers.CommonHelper;
import com.company.Helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public AfterLoginHelper afterLogin;
    public CommonHelper common;


    public App(){
        login = new LoginHelper();
        afterLogin = new AfterLoginHelper();
        common = new CommonHelper();
    }
}
