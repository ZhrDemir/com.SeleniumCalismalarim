package Week_04;

import Utilities.Before_After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard extends Before_After {
    @Test
    public void test01(){

      // 1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com ");

      // 2- Cookies kabul edin
      // 3- Yeni hesap olustur butonuna basalim
        driver.findElement(By.linkText("Yeni hesap oluştur")).click();

      // 4- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim

        WebElement adKutuElementi= driver.findElement(By.xpath("//*[@name='firstname']"));
        Actions actions= new Actions(driver);
        actions.click(adKutuElementi)
                .sendKeys("z")
                .sendKeys(Keys.TAB)
                .sendKeys("d")
                .sendKeys(Keys.TAB)
                .sendKeys("z@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("z@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("z123456.")
                .sendKeys(Keys.TAB)
                .perform();



      // 5- Kaydol tusuna basalim
        driver.findElement(By.name("websubmit")).click();









    }
}
