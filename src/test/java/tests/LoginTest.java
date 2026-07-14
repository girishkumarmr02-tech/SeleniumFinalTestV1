package tests;

import com.girish.pages.LoginPage;
import com.girish.utils.ConfigReader;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {
    @Test
    public void validLogin(){
        LoginPage login=new LoginPage(driver);
        login.enterUsername(ConfigReader.getProperty("username"));
        login.enterPassword(ConfigReader.getProperty("password"));
        login.clickLogin();
    }
}