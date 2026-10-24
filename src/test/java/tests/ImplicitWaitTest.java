package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ImplicitWaitTest extends BaseTest {

    @Test
    public void implicitWaitTest() {
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        driver.findElement(By.id("adder")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement revealedBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("box0")));
        Assert.assertTrue(revealedBox.isDisplayed(), "Input box should be visible after explicit wait!");
    }
}
