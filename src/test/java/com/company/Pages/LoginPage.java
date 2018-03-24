package com.company.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;


public class LoginPage extends BasePage{
	@FindBy(name = "login")
	private WebElement inputlogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//p/input[@type='submit']")
	private WebElement btnLogin;

	@FindBy(xpath = "//select[@name='domn']")
	private WebElement domn;


//	Robot robot = null;
//	try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
//	for (char c:"Ket".toCharArray()){
//		robot.keyPress(c);
//		robot.keyRelease(c);
//	}




    public void login(String name, String password){
    	log.info("set input name - "+name);
        inputlogin.sendKeys(name);
        log.info("set input name - "+name);
        inputPassword.sendKeys(password);
        log.info("set input name - "+password);
        Select select = new Select(domn);
        btnLogin.click();
    }
}
