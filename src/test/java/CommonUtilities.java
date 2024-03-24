import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommonUtilities extends BaseClass{

    String parentWindow;


    public void clickOnWebElement(WebElement element,long waitTimeInSeconds ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
        WebElement element1 =wait.until(ExpectedConditions.elementToBeClickable(element));
        element1.click();
    }

    public WebElement getElement(By locator){
       return driver.findElement(locator);
    }

    public void handleDropdown( By element,String type, String value) {
        Select selectElement = new Select(getElement(element) );
        switch (type){
            case "index":
                selectElement.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                selectElement.selectByValue(value);
                break;
            case "visibleText":
                selectElement.selectByVisibleText(value);
                break;
            default:
                System.out.println("Please send correct option");
                break;
        }
        selectElement.selectByVisibleText(value);
        }

    public void handleRadioButton(String whichButton){
    driver.findElement(By.xpath(whichButton)).click();
    }

    public void handleCheckbox(String check){
        driver.findElement(By.xpath(check)).click();
    }

    public void handleWindow(WebDriver driver, String button){
       parentWindow= driver.getWindowHandle();
        driver.findElement(By.xpath(button)).click();
        Set<String> allWindows=driver.getWindowHandles();
        for (String childWindow:allWindows) {
            if(!parentWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
        }
    }

    }

    public void switchToParentWindow(WebDriver driver){
        driver.switchTo().window(parentWindow);
    }

    public void handleTab(){
        Set<String> allTabs=driver.getWindowHandles();
        for (String childTab:allTabs) {
            if(!childTab.equals(parentWindow)){
                driver.switchTo().window(childTab);
            }
        }
    }

    public void handleAlert(){
    driver.switchTo().alert().accept();
    }

    public void handleTable(String row, String col){
      List<WebElement> rowElements = driver.findElements(By.xpath(row));
        System.out.println(rowElements.size());
       List<WebElement> colElements= driver.findElements(By.xpath(col));
        System.out.println(colElements.size());

        for (int i=1; i<=1;i++){
            for(int j=1; j<=colElements.size();j++){
               WebElement value=driver.findElement(By.xpath("//div[@class='left-align']//*[@id='product'][@id='product']/tbody/tr["+ i +"]/th["+ j +"]"));
                System.out.println(value.getText());
            }
        }

        for (int i=2; i<rowElements.size()+1;i++){
            for(int j=1; j<=colElements.size();j++){
                WebElement value=driver.findElement(By.xpath("//div[@class='left-align']//*[@id='product'][@id='product']/tbody/tr["+ i +"]/td["+ j +"]"));
                System.out.println(value.getText());
            }
        }

    }

    public void typeAText(String textArea){
        driver.findElement(By.xpath(textArea)).sendKeys("Hello world!");

    }

    public void highLight(String word){
        WebElement ele = driver.findElement(By.xpath(word));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",ele);
    }
}
