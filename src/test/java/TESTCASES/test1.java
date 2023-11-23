package TESTCASES;

import Utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test1 {


       // Test Case 1: Register User
       // 1. Launch browser
       // 2. Navigate to url 'http://automationexercise.com'
       // 3. Verify that home page is visible successfully
       // 4. Click on 'Signup / Login' button
       // 5. Verify 'New User Signup!' is visible
       // 6. Enter name and email address
       // 7. Click 'Signup' button
       // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
       // 9. Fill details: Title, Name, Email, Password, Date of birth
       // 10. Select checkbox 'Sign up for our newsletter!'
       // 11. Select checkbox 'Receive special offers from our partners!'
       // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
       // 13. Click 'Create Account button'
       // 14. Verify that 'ACCOUNT CREATED!' is visible
       // 15. Click 'Continue' button
       // 16. Verify that 'Logged in as username' is visible
       // 17. Click 'Delete Account' button
       // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

      //  Test Senaryosu 1: Kullanıcıyı Kaydettirin
      //  1. Tarayıcıyı başlatın
      //  2. 'http://automationexercise.com' URL'sine gidin
       static WebDriver driver;

        @BeforeClass

    public static void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://automationexercise.com");
        }
        @AfterClass

    public static void teardown(){
            ReusableMethods.bekle(3);
            //driver.quit();
        }
     @Test
    public void test01(){
        //  3. Ana sayfanın başarıyla göründüğünü doğrulayın
           WebElement HomePage = driver.findElement(By.xpath("//div[@id='slider-carousel']"));
           Assert.assertTrue(HomePage.isDisplayed());


    }
    @Test
    public void test02(){
        //  4. 'Kayıt Ol / Giriş Yap' butonuna tıklayın
        //  5. 'Yeni Kullanıcı Kaydı!' seçeneğini doğrulayın görünür
        // (5. Verify 'New User Signup!' is visible)

        driver.findElement(By.linkText("Signup / Login")).click();
        WebElement UserSignup = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(UserSignup.isDisplayed());
    }
       @Test
    public void test03(){
           //  6. Adı ve e-posta adresini girin
           //  7. 'Kayıt Ol' butonuna tıklayın
           //  8. 'HESAP BİLGİLERİNİ GİRİN' seçeneğinin göründüğünü doğrulayın
           driver.findElement(By.xpath("//*[@*='signup-name']")).sendKeys("ZD"+ Keys.ENTER);
           driver.findElement(By.xpath("//*[@*='signup-email']")).sendKeys("zdem2021@gmail.com"+Keys.ENTER);


       }
     @Test
    public void test04(){
         //  9. Ayrıntıları girin: Unvan, İsim, E-posta, Şifre, Doğum Tarihi

         driver.findElement(By.id("id_gender2")).click();
         driver.findElement(By.id("password")).sendKeys("password");
         driver.findElement(By.id("days")).sendKeys("17");
         driver.findElement(By.id("months")).sendKeys("H");
         driver.findElement(By.id("years")).sendKeys("1978");

         //  10. 'Bültenimize kaydolun!' onay kutusunu seçin.
         //  11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
         driver.findElement(By.id("newsletter")).click();
         driver.findElement(By.id("optin")).click();

         //  12. Ayrıntıları doldurun: Ad, Soyadı, Şirket, Adres, Adres2, Ülke,
         //  Eyalet, Şehir, Posta Kodu, Cep Numarası

         driver.findElement(By.id("first_name")).sendKeys("Z");
         driver.findElement(By.id("last_name")).sendKeys("D");
         driver.findElement(By.id("address1")).sendKeys("M");
         driver.findElement(By.xpath("//input[@id='state']")).sendKeys("G");
         driver.findElement(By.xpath("//input[@id='city']")).sendKeys("I");
         driver.findElement(By.id("zipcode")).sendKeys("34212");
         driver.findElement(By.id("mobile_number")).sendKeys("5060000000");

         //  13. 'Hesap Oluştur düğmesi'ne tıklayın
         driver.findElement(By.xpath("//*[@*='submit']")).sendKeys(Keys.SPACE);

         //  14. 'HESAP OLUŞTURULDU!' ifadesini doğrulayın. görünür
         WebElement expectedACCOUNT = driver.findElement(By.xpath("//*[@*='title text-center']"));
         Assert.assertTrue(expectedACCOUNT.isDisplayed());
     }

     @Test
    public void test05() {

            //  15. 'Devam' düğmesine tıklayın
         driver.findElement(By.linkText("Continue")).click();


         //  16. 'Kullanıcı adı olarak oturum açıldı' seçeneğinin görünür olduğunu doğrulayın
         WebElement LoginIn = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
         Assert.assertTrue(LoginIn.isDisplayed());

         //  17. 'Hesabı Sil' butonuna tıklayın
         driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();

         //  18. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür ve 'Devam' düğmesine tıklayın
         WebElement delete = driver.findElement(By.xpath("//*[@*='title text-center']"));
         Assert.assertTrue(delete.isDisplayed());

         driver.findElement(By.xpath("//*[@*='continue-button']")).click();

         // (16. Verify that 'Logged in as username' is visible
         // 17. Click 'Delete Account' button
         // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button)


     }
    }

