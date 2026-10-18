package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;


public class BaseTestExample extends BaseTest {

@Test    
public void parabankTest() {
    
    driver.get ("https://parabank.parasoft.com/");
    //WebElement contacElement= driver.findElement(By.cssSelector("ul.button a[href='contact.htm']"));
    //contacElement.click();
    System.out.println("Sayfa: " + driver.getTitle());
    driver.findElement(By.cssSelector("ul.button a[href='contact.htm']")).click();

    WebElement namElement = driver.findElement(By.id("name"));
    WebElement emailElement = driver.findElement(By.id("email"));
    WebElement phoneElement = driver.findElement(By.id("phone"));
    WebElement messagElement = driver.findElement(By.id("message"));
    WebElement sendToCustomerButton = driver.findElement(By.cssSelector("form#contactForm input.button"));

    namElement.sendKeys("Hakan");
    emailElement.sendKeys("hakan@abc.com");
    phoneElement.sendKeys("55533332211");
    messagElement.sendKeys("test");
    sendToCustomerButton.click();

}

}
