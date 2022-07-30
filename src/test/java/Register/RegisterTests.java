package Register;

import Base.BaseTest;
import Pages.AuthPage;
import Pages.CreateAccountPage;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @Test
    public void testSuccefullRegister(){
        AuthPage authPage= homePage.authPAge();
        authPage.setEmail("dddd@rrr.com");
        CreateAccountPage createAccountPage= authPage.RegisterBtn();
    }
}
