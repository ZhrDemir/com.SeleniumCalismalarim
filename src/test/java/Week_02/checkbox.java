package Week_02;

import Utilities.Before_After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkbox extends Before_After {

    @Test
    public void test01() {


        // Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin.
        // https://the-internet.herokuapp.com/checkboxes

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        // c. Checkbox1 seçili değilse onay kutusunu tıklayın
        Assert.assertTrue(checkbox1.isSelected());
        checkbox1.click();

        // d. Checkbox2 seçili değilse onay kutusunu tıklayın
       //checkbox2.click();

        // e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin
        Assert.assertTrue(checkbox2.isSelected());
        Assert.assertTrue(checkbox1.isSelected());
    }
}
