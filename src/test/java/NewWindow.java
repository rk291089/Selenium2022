import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewWindow extends BaseClass{
    private String name = "//input[@name='name']";
    private String email="//input[@name='email']";
    private String subject="//input[@name='subject']";
    private String phone="//input[@name='phone']";
    private String messege="//textarea[@name='messege']";
    private String send="//button[@class='main-btn']";

    CommonUtilities comm = new CommonUtilities();


    public void getTitle(){
        System.out.println(driver.getTitle());
    }

    public void contact(){
        driver.findElement(By.xpath(name)).sendKeys("Biscuit");
        driver.findElement(By.xpath(email)).sendKeys("rktest@gmail.com");
        driver.findElement(By.xpath(subject)).sendKeys("Selenium");
        driver.findElement(By.xpath(phone)).sendKeys("9988776655");
        driver.findElement(By.xpath(messege)).sendKeys("Hello World");
        driver.findElement(By.xpath(send)).click();



    }

    public void closeWindow(){
        driver.close();
    }
}
