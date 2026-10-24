package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {

    private final By contactLink = By.cssSelector("ul.button a[href*='contact.htm']");
    private final By nameInput = By.id("name");
    private final By emailInput = By.id("email");
    private final By phoneInput = By.id("phone");
    private final By messageInput = By.id("message");
    private final By sendButton = By.cssSelector("form#contactForm input.button");
    private final By confirmationMessage = By.cssSelector("#rightPanel p");

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void openContactUsPage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        waitForClickability(contactLink).click();
        waitForVisibility(nameInput);
    }

    public void fillContactForm(String name, String email, String phone, String message) {
        enterText(nameInput, name);
        enterText(emailInput, email);
        enterText(phoneInput, phone);
        enterText(messageInput, message);
    }

    private void enterText(By locator, String value) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void submitContactForm() {
        waitForClickability(sendButton).click();
    }

    public String getConfirmationMessage() {
        return waitForVisibility(confirmationMessage).getText().trim();
    }
}
