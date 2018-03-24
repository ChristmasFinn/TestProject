package com.company.Pages;

import com.company.Common.Constants;
import com.company.Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BasePage {
    protected static WebDriver driver= DriverFactory.getDriver();
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());


    public BasePage() {

        PageFactory.initElements(driver,this);
    }
}
