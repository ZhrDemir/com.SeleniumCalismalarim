package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions2 extends Before_After {
    @Test
    public void test01(){


     //  Yeni bir class olusturalim: MouseActions2
     //  1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");

     //  2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim

        WebElement dragMeElementi = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropHere = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMeElementi,dropHere).perform();

        ReusableMethods.bekle(3);
     //  3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        String expectedYazi= "Dropped!";
        String actualYazi = dropHere.getText();

        Assert.assertEquals(expectedYazi,actualYazi);

        ReusableMethods.bekle(2);

    }
}
