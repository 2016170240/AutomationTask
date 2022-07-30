package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        homePage=new HomePage(driver);
    }
}
