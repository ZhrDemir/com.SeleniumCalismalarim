package Week_02;


import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import Utilities.Before_After;



public class Ddm_test extends Before_After {

            // Bir class oluşturun: DropDown
            //● https://the-internet.herokuapp.com/dropdown adresine gidin.
            //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
            //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
            //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
            //4.Tüm dropdown değerleri(value) yazdırın
            //5. Dropdown’un boyutunun 4 olduğunu test edin

            @Test
            public void herOkuApp(){

                driver.get("https://the-internet.herokuapp.com/dropdown");

                WebElement secenekler = driver.findElement(By.id("dropdown"));
                Select select = new Select(secenekler);
                select.selectByIndex(1);
                System.out.println(select.getFirstSelectedOption().getText());

                ReusableMethods.bekle(1);

                select.selectByValue("2");
                System.out.println(select.getFirstSelectedOption().getText());
                ReusableMethods.bekle(1);
                select.selectByVisibleText("Option 1");
                System.out.println(select.getFirstSelectedOption().getText());

                List<WebElement> tumSecenekleriYazdir = select.getOptions();
                System.out.println(ReusableMethods.stringListeDonustur(tumSecenekleriYazdir));

                Assert.assertEquals(4,tumSecenekleriYazdir.size());


                ReusableMethods.bekle(1);







            }
        }




