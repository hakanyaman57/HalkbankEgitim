import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
  
  @Test
public  void testGoogleAcilis() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    System.out.println("Sayfa Başlığı: " + driver.getTitle());
    Thread.sleep(2000); // 2 saniye bekleme
    driver.quit();
  }
  
}
