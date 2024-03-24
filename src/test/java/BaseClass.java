import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

   public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        BaseClass obj = new BaseClass();
        obj.intBrowser();
        HomePage hp= new HomePage();
        hp.getTitle();
        hp.highLightPageName();
        hp.selectRadioButton();
        hp.typeText();
        hp.selectDropDown();
        hp.selectCheckbox();
        hp.openNewWindow();
        hp.switchTab();
        hp.alertExample();
        hp.table();
        hp.tableFixedHeader();
        hp.terminateBrowser();

    }

    BaseClass(){
      if(driver==null){

      //    ChromeOptions co = new ChromeOptions();
      //    co.setHeadless(true);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
      }
    }

    public void intBrowser(){
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    System.out.println(driver);
    }

    public void terminateBrowser(){
        driver.close();
    }
}
