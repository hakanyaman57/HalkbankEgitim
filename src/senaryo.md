    Senaryo: Müşteri İletişim Formu Gönderimi (Contact Us)

    Ana sayfada yer alan "contact.htm" bağlantısına tıklayarak iletişim sayfasına gidin.

    İsim (name) alanına test verisi (örneğin "Hakan") girin.

    E-posta (email), telefon (phone) ve mesaj (message) alanlarını geçerli test verileriyle doldurun.

    "Send to Customer Care" butonuna tıklayarak formu gönderin.

    Formun gönderildikten sonra sayfanın yüklendiğini bekleyip onay mesajını doğrulayın.


Mimari ve Rol Belirleme (Sistem Promptu):

"Sen kıdemli bir Test Otomasyon Mühendisisin. Java, Selenium ve TestNG kullanarak 'parabank.parasoft.com' için Page Object Model (POM) standartlarında kod üreteceksin. İş mantığı ile teknik detayları kesinlikle birbirinden ayırmalısın."

Sayfa Sınıfı (Page Class) Üretme Promptu:

"Parabank Login sayfası için bir Page sınıfı oluştur. Web elementlerini @FindBy KULLANMADAN, sadece 'By' nesneleri (Locator) olarak tanımla. Elementleri bulurken her metot çağrısında driver.findElement() kullan. TestNG Assertion komutlarını bu sınıfa KESİNLİKLE Ekleme."

Test Sınıfı Üretme ve Bekleme (Wait) Düzeltme Promptu:

"Parabank Contact Us (İletişim) senaryosu için bir TestNG test sınıfı oluştur. Bu sınıf 'BaseTest' sınıfını miras almalıdır (extends BaseTest). Senaryo adımlarında Thread.sleep() ASLA kullanma; elementlerin yüklenmesini beklemek için BasePage'den gelen Explicit Wait (WebDriverWait) yapısını kullan. Senaryonun başarısını TestNG Hard Assert kullanarak doğrula."