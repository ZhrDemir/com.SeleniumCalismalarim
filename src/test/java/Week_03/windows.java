package Week_03;

import Utilities.Before_After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class windows extends Before_After {

    @Test
    public void test01(){


// ● Yeni bir class olusturun: WindowHandle
// ● Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

// ● Sayfa’nin window handle degerini String bir degiskene atayin
        String ilkSfWHD = driver.getWindowHandle();

// ● Sayfa title’nin “Amazon” icerdigini test edin
        String expectedTitleIcerik = "Amazon";
        String actualTitleIcerik = driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

// ● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB).get("https://wisequarter.com");
         String ikinciWHD = driver.getWindowHandle();

// ● Sayfa title’nin “wisequarter” icerdigini test edin
       expectedTitleIcerik = "Wise Quarter";
       actualTitleIcerik = driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

// ● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://walmart.com");

// ● Sayfa title’nin “Walmart” icerdigini test edin

        expectedTitleIcerik = "Walmart";
        actualTitleIcerik = driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

// ● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

        driver.switchTo().window(ilkSfWHD).get("https://amazon.com");
        expectedTitleIcerik = "Amazon";
        actualTitleIcerik = driver.getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));




    }
}
