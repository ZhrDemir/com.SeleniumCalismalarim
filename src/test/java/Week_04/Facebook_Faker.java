package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Faker extends Before_After {
    @Test
    public void test01(){


       // 1. "https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");

       // 2. “create new account” butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

       // 3. “firstName” giris kutusuna bir isim yazin
        // 4. “surname” giris kutusuna bir soyisim yazin
        // 5. “email” giris kutusuna bir email yazin
        // 6. “email” onay kutusuna emaili tekrar yazin
        // 7. Bir sifre girin

        Actions actions = new Actions(driver);
        Faker faker = new Faker();
        WebElement firstNameElementi = driver.findElement(By.name("firstname"));
        String email =  faker.internet().password();

        actions.click(firstNameElementi)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("25")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_LEFT)
                .perform();


       // 8. Tarih icin gun secin
       // 9. Tarih icin ay secin
       // 10. Tarih icin yil secin
       // 11. Cinsiyeti secin
       // 12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.

        ReusableMethods.bekle(3);
        WebElement kadinClickElementi = driver.findElement(By.xpath("//input[@id='u_e_4_gw']"));
        Assert.assertTrue(kadinClickElementi.isSelected());

        WebElement erkekClickElementi = driver.findElement(By.id("u_e_5_9s"));
        Assert.assertFalse(erkekClickElementi.isSelected());

        WebElement digerClickElementi = driver.findElement(By.id("u_e_6_Gd"));
        Assert.assertFalse(digerClickElementi.isSelected());

       // 13. Sayfayi kapatin
        driver.close();

        ReusableMethods.bekle(5);

















    }
}
