package Week_05;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import Week_04.File;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_Screenshot extends Before_After {
    @Test
    public void screenshot(){

      // Yeni bir class olusturun : amazonNutellaSearch
      // 1- amazon anasayfaya gidin
        driver.get("https://testotomasyonu.com");

      // 2- amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

      // 3- shoes icin arama yapin
        driver.findElement(By.id("global-search")).sendKeys("shoes"+ Keys.ENTER);

      // 4- sonucun shoes icerdigini test edin ve ilk urunun goruntusunu alin
        WebElement ilkshoesElementi = driver.findElement(By.xpath("(//a[@class='prod-img'])[1]"));

       ReusableMethods.istenenWebelementScreenshot(ilkshoesElementi);



        ReusableMethods.bekle(5);
    }
}
