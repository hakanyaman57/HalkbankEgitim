package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
  
  @Test
public  void testGoogleAcilis() {
  ChromeOptions options = new ChromeOptions();
options.addArguments("--headless=new"); 
options.addArguments("--no-sandbox"); 
options.addArguments("--disable-dev-shm-usage"); 

WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    System.out.println("Sayfa Başlığı: " + driver.getTitle());
    driver.quit();
  }

}
