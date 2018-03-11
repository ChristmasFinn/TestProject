package com.company.Tests;

import org.testng.annotations.Test;

public class SendEmailTest extends BaseTest {
    @Test
    public void sendEmailTest() throws Exception {
        app.login.loginValidUser();
        app.afterLogin.newLetter();
    }
}
