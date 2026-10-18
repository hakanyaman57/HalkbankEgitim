package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParabankCustomerCareTest {
       public WebDriver driver;

    @BeforeMethod 
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
        //WebElement contacElement= driver.findElement(By.cssSelector("ul.button a[href='contact.htm']"));
        //contacElement.click();

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

    @Test 
    public void secondTest() {
        WebElement userInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.cssSelector("input.button"));

        System.out.println("Title: "+ driver.getTitle());
        userInput.sendKeys("john");
        passwordInput.sendKeys("demo");
        submitButton.click();

    }


    @AfterMethod 
    public void tearDown() {
        driver.quit();
    }
}
