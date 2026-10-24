package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test 
    public void validUserLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("john", "demo");

        String actualMessage = loginPage.getWelcomeMessage();
        Assert.assertEquals(
                actualMessage,
                "Welcome John Smith",
                "Unexpected welcome message after login - actual message: "+ actualMessage );
    }
}
