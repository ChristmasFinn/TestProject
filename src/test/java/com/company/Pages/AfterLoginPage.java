package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginPage extends BasePage {
	@FindBy(xpath = "//li/span[@class='sn_menu_title']")
	private WebElement userEmail;


	@FindBy(xpath = "//li//a[@href=/compose/1631816779/]")
	protected WebElement btnCreateLetter;



	public String getUserEmail() {
	    return userEmail.getText();
    }

}
