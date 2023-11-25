package Week_03;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.Set;

public class KontrolsuzWindowslar extends Before_After {

    @Test
    public void test01(){

        //https://the-internet.herokuapp.com/iframe url'ine git
        driver.get("https://the-internet.herokuapp.com/iframe");

        String ilkWHandle = driver.getWindowHandle();


        //sayfa baslığının Internet içerdiğini test et
        String expectedTitle = "Internet";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //Elemantel Selenium linkini tıkla,
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

        //Yeni acılan tab ın Title nın Selenium içerdiğini test edin

        Set<String> whdSeti = driver.getWindowHandles();

        System.out.println("ilk sayfa hnd : " + ilkWHandle);
        System.out.println("window handles seti : "+ whdSeti);

        String ikinciSayfaWhd = "";

        for (String each:whdSeti
             ) {
            if (!each.equals(ilkWHandle)) {
                ikinciSayfaWhd = each;
            }
        }
            driver.switchTo().window(ikinciSayfaWhd);

            System.out.println("ikinci handle : " +ikinciSayfaWhd);


            expectedTitle = "Selenium";
            actualTitle = driver.getTitle();

            Assert.assertTrue(actualTitle.contains(expectedTitle));

                //ilk sayfaya dönüp url in internet içerdiğini test edin
            driver.switchTo().window(ilkWHandle);

            String expectedUrl = "internet";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertTrue(actualUrl.contains(expectedUrl));

            ReusableMethods.bekle(2);
        }


    }







