package Week_05;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class N11 extends Before_After {
    @Test
    public void N11(){

      // Senaryo Başlangıcı ve Sayfa Erişimi:
      // Senaryo "n11.com" anasayfasında başlar.
      // Tarayıcıyı aç ve "https://www.n11.com/" adresine git.
        driver.get("https://www.n11.com");

      // Üye Olma Sayfasına Geçiş:
      // Anasayfada "Üye Ol" veya "Giriş Yap" butonuna tıkla.
        driver.findElement(By.xpath("(//a[@title='Üye Ol'])[1]")).click();

      // "Üye Ol" seçeneğine tıkla, yeni üye kaydı için sayfaya geçiş yap.
        driver.findElement(By.xpath("//div[@class='btnPrimary agreement-button']")).click();

      // Kişisel Bilgilerin Girilmesi:
        Actions actions = new Actions(driver);
        Faker faker = new Faker();

      // Ad ve soyad bilgilerini ilgili alanlara gir.
        WebElement firstnameKutusu = driver.findElement(By.id("firstName"));

        actions.click(firstnameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("066769377")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password(6,11))
                .sendKeys(Keys.TAB)
                .perform();




      //         E-posta adresini ilgili alana gir.
      // Şifreyi belirle ve şifre tekrarını ilgili alanlara gir.
      // Üyelik Bilgilerinin Tamamlanması:
      // Cinsiyet seçeneğini uygun şekilde işaretle.
      //          Doğum tarihini ilgili alana gir.
      //  Telefon numarasını ilgili alana gir.
      //          Üyelik Sözleşmesi ve İzinler:
      //  Üyelik sözleşmesini ve gizlilik politikasını oku (isteğe bağlı).
      //  Gerekliyse iletişim ve pazarlama izinlerini işaretle veya işaretsiz bırak.
      //          Üyelik İşleminin Onaylanması:
      //  "Üye Ol" veya "Kaydol" gibi bir onay butonuna tıkla.
      //          Üyelik Onayı ve Giriş Yapma:
      //  Üyelik işlemi başarılıysa, "Üyelik tamamlandı" mesajını doğrula.
      //  E-posta adresine gönderilen doğrulama bağlantısını kontrol et (isteğe bağlı).
      //  Giriş Yapma (Opsiyonel):
      //  Üyelik işlemi tamamlandıktan sonra "Giriş Yap" butonuna tıkla.
      //  Kullanıcı adı (e-posta) ve şifre ile oturum aç.
      //          Çıkış ve Temizlik (Opsiyonel):
      //  Senaryo tamamlandıktan sonra oturumu kapat veya sayfayı kapat.


        ReusableMethods.bekle(5);

    }
}
