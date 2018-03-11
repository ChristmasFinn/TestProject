package com.company.Tests;

import com.company.Pages.BasePage;
import com.company.Users.User;
import com.company.Users.UserFactory;

import org.testng.annotations.AfterSuite;

public class BaseTest extends BasePage {

    protected User validUser= UserFactory.getValidUser();
    protected static App app=new App();

    @AfterSuite
    public void tearDownSuite() throws Exception {
        app.common.stopApp();
    }
}
