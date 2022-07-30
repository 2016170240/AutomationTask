package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AuthPage {
    private WebDriver driver;
    public AuthPage(WebDriver driver){
        this.driver=driver;
    }
    //////////////////////////////////////////////////////
    /*For Register data*/
    // Set Email of the new user
    public void setEmail(String email){
        driver.findElement(By.cssSelector("#email_create")).sendKeys(email);
    }
    public CreateAccountPage RegisterBtn(){
        driver.findElement(By.cssSelector(".submit #SubmitCreate")).click();
        return new CreateAccountPage(driver);
    }

    ////////////////////////////////////////////////////
    /*For Login data*/
    public void setLoginEmail(String email){
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }
    public void setLoginPassword(String password){
        driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
    }
    public MyProfile LoginBtn(){
        driver.findElement(By.cssSelector("#SubmitLogin")).click();
        return new MyProfile(driver);
    }

}
