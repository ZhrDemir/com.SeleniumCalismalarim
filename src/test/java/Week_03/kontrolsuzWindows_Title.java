package Week_03;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class kontrolsuzWindows_Title extends Before_After {
    @Test
    public void test01(){

//   Tests package’inda yeni bir class olusturun: WindowHandle2
// ● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
         String handle1= driver.getWindowHandle();

// ● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String expectedText = "Opening a new window";
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(expectedText,actualText);

// ● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        expectedText = "The Internet";
        actualText = driver.getTitle();
        Assert.assertEquals(expectedText,actualText);

// ● Click Here butonuna basın.
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

// ● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
//   dogrulayin.
        Set<String> whdSeti = driver.getWindowHandles();
        String handle2 = "";
        for (String each:whdSeti
             ) {
            if (!each.equals(handle1)){
                handle2 = each;
            }
        }
      expectedText = "New Window";
      actualText = driver.switchTo().window(handle2).getTitle();
      Assert.assertEquals(expectedText,actualText);

// ● Sayfadaki textin “New Window” olduğunu doğrulayın.
      expectedText = "New Window";
      actualText = driver.findElement(By.xpath("//h3")).getText();
      Assert.assertEquals(expectedText,actualText);

// ● Bir önceki pencereye geri döndükten sonra sayfa başlığının The Internet
//   olduğunu doğrulayın.
        driver.switchTo().window(handle1);
        expectedText = "The Internet";
        actualText = driver.getTitle();
        Assert.assertEquals(expectedText,actualText);



        ReusableMethods.bekle(3);

    }
}
