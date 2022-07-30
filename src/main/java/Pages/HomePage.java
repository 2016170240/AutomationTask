package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    // open login Auth page
    public AuthPage authPAge(){
        clickLink("Sign in");
        return new AuthPage(driver);
    }
    public CreateAccountPage createAccountPage(){
        clickLink("Sign in");
        return new CreateAccountPage(driver);
    }
    // Get Element by text of the link
    private void clickLink(String linkText){
      driver.findElement(By.linkText(linkText)).click();
 }

}
