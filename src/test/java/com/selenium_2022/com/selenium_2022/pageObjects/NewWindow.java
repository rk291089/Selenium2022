package com.selenium_2022.com.selenium_2022.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium_2022.com.selenium_2022.testCases.BaseClass;

public class NewWindow extends BaseClass{
    private String login = "//i[@class='fa fa-lock fa-lg']";
    private String userId="//*[@id='user_email']";
    private String password="//*[@id='user_password']";
    CommonUtilities comm = new CommonUtilities();

    public void clickLogin(){
       WebElement element= driver.findElement(By.xpath(login));
        comm.clickOnWebElement(element,10);
    }

    public void getTitle(){
        System.out.println(driver.getTitle());
    }

    public void login(){
        driver.findElement(By.xpath(userId)).sendKeys("Biscuit");
        driver.findElement(By.xpath(password)).sendKeys("haha");
    }

    public void closeWindow(){
        driver.close();
    }
}
