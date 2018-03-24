package com.company.Driver;

import com.company.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DriverFactory {
    static WebDriver driver;
    public static WebDriver getDriver(){
        String property = System.getProperty("driver");
        if ("firefox".equals(property)){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if ("ie".equals(property)){
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        }else{
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get(Constants.BASE_URL);
        driver.manage().window().maximize();
        return driver;
    }
}
