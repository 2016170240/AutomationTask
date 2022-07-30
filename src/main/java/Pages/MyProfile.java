package Pages;

import org.openqa.selenium.WebDriver;

public class MyProfile {
    WebDriver driver;
    public MyProfile(WebDriver driver){
        this.driver=driver;
    }
    public String getPageTitle(){
       return driver.getTitle();
    }
}
