package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;

public class DropdownTest extends BaseTest {
    @Test 
    public void dropdownTest() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement dropDownElement = driver.findElement(By.name("my-select"));
        Select selection = new Select(dropDownElement);
        selection.selectByIndex(1);
        selection.selectByValue("2");
        selection.selectByVisibleText("Three");
        

    }
}
