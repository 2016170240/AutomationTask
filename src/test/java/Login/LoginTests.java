package Login;

import Base.BaseTest;
import Pages.AuthPage;
import Pages.MyProfile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {
    private WebDriver driver;
    // validation of valid data and login successfully
    // this test will run second
    @Test(priority = 2)
    public void testSuccessfullLogin(){
        AuthPage authPage= homePage.authPAge();
        authPage.setLoginEmail("dddd@rrr.com");
        authPage.setLoginPassword("123456");
        MyProfile myProfile= authPage.LoginBtn();
        assertTrue(myProfile.getPageTitle().contains("My account - My Store"),"alert text is incorrect");
    }
    // validation of invalid email
    // this test will run first
    @Test(priority = 1)
    public void invalidEmailLogin(){
        AuthPage authPage= homePage.authPAge();
        authPage.setLoginEmail("ddd000d@rrr.com");
        authPage.setLoginPassword("123456");
        MyProfile myProfile= authPage.LoginBtn();
    }
}