package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParabankLoginTest {
     public WebDriver driver;

    @BeforeTest 
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); 
        options.addArguments("--no-sandbox"); 
        //options.addArguments("--disable-dev-shm-usage"); 
        driver = new ChromeDriver(options);
    }

     @Test 
    public void ExerciseWebDriver() throws Exception {
        driver.get ("https://parabank.parasoft.com/");
        Thread.sleep(3000);
        WebElement userInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("input.button"));

        System.out.println("Title: "+ driver.getTitle());
        userInput.sendKeys("john");
        passwordInput.sendKeys("demo");
        submitButton.click();
        Thread.sleep(2000);
        
    }

    @AfterTest 
    public void tearDown() {
        driver.quit();
    }
}
