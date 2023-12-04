package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class File extends Before_After {


    @Test
    public void test01(){
       // 1. Tests packagenin altina bir class oluşturun : C05_UploadFile
       // 2. https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

       // 3. chooseFile butonuna basalim
       WebElement chooseFileElementi =  driver.findElement(By.id("file-upload"));

       ReusableMethods.bekle(2);

       // 4. Yuklemek istediginiz dosyayi secelim.
        String dinamikDosyaYolu = System.getProperty("user.home")+
                "\\Downloads\\logo.png";
        chooseFileElementi.sendKeys(dinamikDosyaYolu);

       // 5. Upload butonuna basalim.
          driver.findElement(By.id("file-submit")).click();


       // 6. “File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileUpLoadElementi = driver.findElement(By.tagName("h3"));
        String expectedYazi = "File Uploaded!";
        String actualYazi = fileUpLoadElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        ReusableMethods.bekle(3);




    }
}
