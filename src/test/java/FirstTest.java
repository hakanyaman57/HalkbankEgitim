import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
  
  @Test
public  void testGoogleAcilis() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    System.out.println("Sayfa Başlığı: " + driver.getTitle());
    driver.quit();
  }

}
