package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(name = "login")
	private WebElement inputlogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//p/input[@type='submit']")
	private WebElement btnLogin;

    public void login(String name, String password){
        inputlogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }
}
