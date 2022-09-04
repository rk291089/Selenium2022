package com.selenium_2022.com.selenium_2022.testCases;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

   public static WebDriver driver = null;

 
    @BeforeClass
    public void intBrowser(){
    	
    	if(driver==null){

    	      //    ChromeOptions co = new ChromeOptions();
    	      //    co.setHeadless(true);
    	          WebDriverManager.chromedriver().setup();
    	     //     WebDriver driver = WebDriverManager.chromediver().capabilities(co).create(); 5.1.1
    	          driver = new ChromeDriver();
    	      }
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    
    @AfterClass
    public void terminateBrowser(){
        driver.close();
    }


   
}
