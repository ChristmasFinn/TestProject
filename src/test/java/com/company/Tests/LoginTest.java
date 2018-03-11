package com.company.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test
    public void logintest() throws Exception {
        app.login.loginValidUser();

        Assert.assertEquals(app.afterLogin.getUserEmail(),validUser.getEmail());
    }


}
