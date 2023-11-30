package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_clickAndHold extends Before_After{
    @Test
    public void test01(){


       // 1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

       // 2. "Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
        WebElement MeFirstKutuElementi = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        actions.moveToElement(MeFirstKutuElementi).perform();

       // 3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();

       // 4. Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        // 5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

       // 6. "Click and hold" kutusuna basili tutun
         WebElement clickandHoldKutusuElementi = driver.findElement(By.id("click-box"));
         actions.clickAndHold(clickandHoldKutusuElementi).perform();

       // 7. "Click and hold" kutusunda cikan y
      actions.clickAndHold(clickandHoldKutusuElementi);


        // 8. "Double click me" butonunu cift tiklayin
         WebElement DoubleClickElementi = driver.findElement(By.tagName("h2"));
         actions.doubleClick(DoubleClickElementi).perform();

        ReusableMethods.bekle(3);




    }



}
