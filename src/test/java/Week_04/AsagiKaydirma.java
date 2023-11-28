package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AsagiKaydirma extends Before_After {
    @Test
    public void test01(){

        // 2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        ReusableMethods.bekle(4);

        // 3- video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        WebElement h1Elementi = driver.findElement(By.tagName("h1"));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        // 4- videoyu izlemek icin Play tusuna basin

        ReusableMethods.bekle(5);

        WebElement iframeElementi = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframeElementi);

        driver.findElement(By.xpath("//*[@title='Oynat']")).click();

        // 5- videoyu calistirdiginizi test edin

        ReusableMethods.bekle(1);
        WebElement expected = driver.findElement(By.xpath("//a[@title='YouTube'da izle']"));
        Assert.assertTrue(expected.isDisplayed());

        ReusableMethods.bekle(5);



    }
}
