package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ExplicitWaitTest extends BaseTest {

    @Test
    public void explicitWaitTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        driver.findElement(By.id("reveal")).click();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //  WebElement revealedInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
        WebElement revealedInput = driver.findElement(By.id("revealed"));
        Assert.assertTrue(revealedInput.isDisplayed(), "Input box should be visible after clicking the button");
    }
}
