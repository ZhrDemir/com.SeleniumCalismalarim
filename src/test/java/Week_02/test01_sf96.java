package Week_02;

import Utilities.BeforeClass_AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test01_sf96 extends BeforeClass_AfterClass {

//     1) Bir class oluşturun: YoutubeAssertions
//     2) https://www.youtube.com adresine gidin

//     3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin

    @Test
    public void titleTest(){
        // ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        driver.get("https://www.youtube.com");
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Test
    public void imageTest(){
        // ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
       // driver.get("https://www.youtube.com");
        WebElement imageResmi = driver.findElement(By.xpath("(//div[@class='style-scope ytd-topbar-logo-renderer'])[1]"));
        Assert.assertTrue(imageResmi.isDisplayed());

    }
    @Test
    public void searchBox(){
        // ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //driver.get("https://www.youtube.com");
        WebElement searcBox = driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searcBox.isEnabled());
    }
    @Test
    public void wrongTitleTest(){
        // ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
      //  driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);
    }




}
