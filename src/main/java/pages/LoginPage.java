package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private final By userInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By submitButton = By.cssSelector("input.button");
    private final By welcomeMessage = By.cssSelector("#leftPanel .smallText");

    public LoginPage(WebDriver driver) {
        super(driver);
        System.out.println("LoginPage constructor çalıştı");
    }

    private void enterUserName(String username) {
        WebElement usernameElement = driver.findElement(userInput);
        usernameElement.clear();
        usernameElement.sendKeys(username);
    }

    private void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    private void clickLoginButton() {
        driver.findElement(submitButton).click();
    }

    public void openLoginPage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void login(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        clickLoginButton();
    }

    public String getWelcomeMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
        return message.getText().trim();
    }
}
