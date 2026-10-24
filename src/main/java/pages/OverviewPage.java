package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {

    private final By welcomeMessage = By.cssSelector("#leftPanel .smallText");

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage() {
        return waitForVisibility(welcomeMessage).getText().trim();
    }
}
