package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {

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
    public void ExerciseWebDriver() throws InterruptedException {
       
        driver.get ("https://www.google.com");
        System.out.println("Title: "+ driver.getTitle());
        Thread.sleep(2000);
        
    }

        @Test 
    public void ExerciseWebDriver2() throws InterruptedException {
       
        driver.get ("https://www.google.com");
        Thread.sleep(2000);
        System.out.println("Url: "+ driver.getCurrentUrl());
        WebElement inputArea= driver.findElement(By.name("q"));
        inputArea.sendKeys("Otomobiller");
        Thread.sleep(2000);
        
    }

    @AfterTest 
    public void tearDown() {
        driver.quit();
    }

}