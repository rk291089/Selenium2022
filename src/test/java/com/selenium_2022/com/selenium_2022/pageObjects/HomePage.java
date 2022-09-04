package com.selenium_2022.com.selenium_2022.pageObjects;
import org.openqa.selenium.By;

import com.selenium_2022.com.selenium_2022.testCases.BaseClass;


public class HomePage extends BaseClass{

    private String pageName = "//h1[contains(text(),'Practice Page')]";
    private String titleName;
    private String radioButton = "//legend[contains(text(),'Radio Button Example')]";
    private String radioButton1="//input[@value='radio1']";
    private String dropDown="//*[@id='dropdown-class-example']";
    By dropDownElement = By.xpath(dropDown);
    private String checkBox="//*[@id='checkBoxOption1']";
    private String newWindow="//*[@id='openwindow']";
    private String newsletter="//*[@id='homepage']/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]";
    private String nameInAlertText="//*[@id='name']";
    private String clickAlert="//*[@id='alertbtn']";
    private String switchTab="//*[@id='opentab']";
    private String table ="//*[@id='product']";
    private String tableRow="//div[@class='left-align']//*[@id='product'][@id='product']/tbody/tr";
    private String tableCol="//div[@class='left-align']//*[@id='product'][@id='product']/tbody/tr/th";
    private String tableFixedRow="//div[@class='tableFixHead']//*[@id='product']/tbody/tr";
    private String tableFixedCol="//div[@class='tableFixHead']//*[@id='product']/tbody/tr/td";
    private String dropDownValue="Option3";
    private String dropDownType= "visibleText";

    CommonUtilities commonObj= new CommonUtilities();
    NewWindow nw= new NewWindow();

    public void getTitle(){
       String title= driver.getTitle();
        System.out.println(title);
    }

    public void selectRadioButton(){
    commonObj.handleRadioButton(radioButton1);
    }

    public void selectDropDown() {
        commonObj.handleDropdown(dropDownElement,dropDownType,dropDownValue);
    }

    public void selectCheckbox(){
        commonObj.handleCheckbox(checkBox);
    }

    public void openNewWindow(){
        commonObj.handleWindow(driver,newWindow);
        nw.getTitle();
        driver.findElement(By.xpath(newsletter)).click();
        nw.clickLogin();
        nw.login();
        nw.closeWindow();
        commonObj.switchToParentWindow(driver);
    }

public void alertExample(){
        driver.findElement(By.xpath(nameInAlertText)).sendKeys("RK29");
        driver.findElement(By.xpath(clickAlert)).click();
        commonObj.handleAlert();

        //commonObj.handleAlert();
}

public  void switchTab(){
    driver.findElement(By.xpath(switchTab)).click();
    commonObj.handleTab();
    System.out.println(driver.getTitle());
    commonObj.terminateBrowser();
    commonObj.switchToParentWindow(driver);
}

public void table(){
       commonObj.handleTable(tableRow, tableCol);
}

public  void tableFixedHeader(){

}

}
