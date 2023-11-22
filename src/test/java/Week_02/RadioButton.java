package Week_02;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Before_After {

    @Test
    public void RadioButton(){

      // Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
      //         a. Verilen web sayfasına gidin.
      //         https://facebook.com

        driver.get("https://facebook.com");
        ReusableMethods.bekle(2);

      // b. Cookies’i kabul edin


      // c. Create an account buton’una basin
        WebElement CreatButton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        CreatButton.click();


        // d. Radio button elementlerini locate edin ve size uygun olani secin

        WebElement kadınBox = driver.findElement(By.xpath("(//*[@class='_8esa'])[1]"));
        WebElement erkekBox = driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
        WebElement digerBox = driver.findElement(By.xpath("(//*[@class='_8esa'])[3]"));

        kadınBox.click();

        ReusableMethods.bekle(3);
      // e. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

        Assert.assertTrue(kadınBox.isSelected());
        Assert.assertFalse(erkekBox.isSelected());
        Assert.assertFalse(digerBox.isSelected());

    }






}
