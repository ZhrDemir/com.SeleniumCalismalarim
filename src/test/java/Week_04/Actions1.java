package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions1 extends Before_After {
    @Test
    public void test01(){

       // 1- Yeni bir class olusturalim: MouseActions1

       // 2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

       // 3- Cizili alan uzerinde sag click yapin
        Actions actions = new Actions(driver);
        WebElement cizgiliAlanElementi = driver.findElement(By.id("hot-spot"));
        actions.contextClick(cizgiliAlanElementi).perform();

       // 4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String expectedAlertYazi = "You selected a context menu";
        String actualAlertYazi = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazi,actualAlertYazi);

        ReusableMethods.bekle(3);

       // 5- Tamam diyerek alert’i kapatalim

        driver.switchTo().alert().accept();

       // 6- Elemental Selenium linkine tiklayalim

        driver.findElement(By.linkText("Elemental Selenium")).click();

       // 7- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim

        ReusableMethods.bekle(5);
        String expectedH1Yazi= "Make sure your code lands";
        String actualH1Yazi = driver.findElement(By.xpath("//h1[text()='Make sure your code lands']")).getText();
        Assert.assertEquals(expectedH1Yazi,actualH1Yazi);


        ReusableMethods.bekle(30);

    }
}
