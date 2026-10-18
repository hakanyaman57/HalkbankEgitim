package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class CheckBoxRadioButtonTest extends BaseTest {
    
    @Test
    public void CheckBoxTest() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement checkBoxElement = driver.findElement(By.id("my-check-1"));
        WebElement checkBoxElement2 = driver.findElement(By.id("my-check-2"));

        boolean isEnabled = checkBoxElement.isEnabled();
        boolean isChecked = checkBoxElement.isSelected();
        if (!isChecked) {
            checkBoxElement.click();
        }
        checkBoxElement2.click();

    
        

    }
}
