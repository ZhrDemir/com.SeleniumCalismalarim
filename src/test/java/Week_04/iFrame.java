package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrame extends Before_After {
    @Test
    public void test1(){

      // 1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin

        driver.get("http://webdriveruniversity.com/IFrame/index.html");

      // 2. “Our Products” butonuna basin

        WebElement iFrameElementi = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrameElementi);
        WebElement ourButonuElementi = driver.findElement(By.xpath("//a[text()='Our Products']"));
        ourButonuElementi.click();
        driver.switchTo().defaultContent();

        // 3. “Cameras product”i tiklayin
        WebElement iFrameElementi2 = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrameElementi2);
        WebElement cameraElementi = driver.findElement(By.id("cameras"));
        cameraElementi.click();
        driver.switchTo().parentFrame();
         ReusableMethods.bekle(4);
      // 4. Popup mesajini yazdirin
        WebElement iFrameElem3= driver.findElement(By.tagName("iframe"));
        System.out.println(driver.switchTo().frame(iFrameElem3));

        WebElement popupKutusu = driver.findElement(By.className("modal-body"));
        System.out.println(popupKutusu.getText());

        // 5. “close” butonuna basin
       driver.findElement(By.xpath("//button[text()='Close']")).click();
        driver.switchTo().defaultContent();

      // 6. "WebdriverUniversity.com (IFrame)" linkini tiklayin

        driver.findElement(By.xpath("(//a[@*='nav-title'])[1]")).click();



      // 7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin

        String expectedUrl = "http://webdriveruniversity.com/index.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


        ReusableMethods.bekle(3);








    }
}
