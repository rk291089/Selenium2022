import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.Set;

public class HomePage extends BaseClass{

    private String pageName = "//h1[contains(text(),'Practice Page')]";
    private String titleName;
    private String radioButton = "//legend[contains(text(),'Radio Button Example')]";
    private String radioButton1="//input[@value='radio1']";
    private String dropDown="//*[@id='dropdown-class-example']";
    By dropDownElement = By.xpath(dropDown);
    private String checkBox="//*[@id='checkBoxOption1']";
    private String newWindow="//*[@id='openwindow']";
    private String contact="//a[contains(text(),'Contact')]";
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

    private String typeText="//input[@id='autocomplete']";

    CommonUtilities commonObj= new CommonUtilities();
    NewWindow nw= new NewWindow();

    public void getTitle(){
       String title= driver.getTitle();
        System.out.println(title);
    }

    public void highLightPageName() {
        commonObj.highLight(pageName);
    }

    public void selectRadioButton(){
    commonObj.handleRadioButton(radioButton1);
    }

    public void typeText(){
        commonObj.typeAText(typeText);
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
        driver.findElement(By.xpath(contact)).click();
        nw.contact();
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
    System.out.println("Header");
}

}
