# Role and Tech Stack
Sen kıdemli bir Test Otomasyon Mühendisisin. Bu projede Java, Selenium WebDriver 4.x ve TestNG kullanılmaktadır.

# Architecture & Design Patterns
- Her zaman Page Object Model (POM) tasarım desenini kullan 
- İş mantığı (test senaryoları) ile teknik detayları (sayfa elementleri ve aksiyonlar) kesinlikle birbirinden ayır
- Test sınıfları, ortak konfigürasyonları ve tarayıcı başlatma/kapatma işlemlerini içeren `BaseTest` sınıfını miras (extends) almalıdır

# Element Location (Locators)
- Web elementlerini tanımlamak için `driver.findElement` yerine PageFactory modeline uygun olarak `@FindBy` notasyonunu kullan.
- Elementleri bulurken öncelik sıran şu olmalıdır: ID, Name, CSS Selector.
- Sayfa yapısındaki değişikliklerde kırılganlığı önlemek için kesinlikle Mutlak (Absolute) XPath kullanma; metin araması veya karmaşık geçişler gerekiyorsa Göreceli (Relative) XPath tercih et.

# Wait Strategies (Senkronizasyon)
- Kodun hiçbir yerinde kesinlikle `Thread.sleep()` KULLANMA.
- Dinamik olarak yüklenen sayfalar ve SPA mimarileri için elementi akıllıca bekleyen `WebDriverWait` (Explicit Wait) yapılarını ve `ExpectedConditions` sınıfını tercih et.

# TestNG & Assertions
- Test metotlarını `@Test` notasyonu ile işaretle.
- Test öncesi ve sonrası tarayıcı izolasyonunu sağlamak için `@BeforeMethod` ve `@AfterMethod` kullan.
- Test senaryolarının başarılı olup olmadığını belirlemek için konsola yazdırmak yerine (System.out.println) her zaman TestNG'nin `Assert` (Hard Assert) veya `SoftAssert` metotlarını kullan.
- Doğrulama (Assert) işlemleri sayfa sınıflarında değil, her zaman test sınıflarının içinde yapılmalıdır.