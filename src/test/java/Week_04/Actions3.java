package Week_04;

import Utilities.Before_After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions3 extends Before_After {
    @Test
    public void test1(){

     // - https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

     // 2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin

        WebElement accountYaziElementi= driver.findElement(By.xpath("//span[text()='Account & Lists']"));

     // mouse’u bu menunun ustune getirin

        Actions actions = new Actions(driver);
        actions.moveToElement(accountYaziElementi).perform();


     // 3- “Create a list” butonuna basin
WebElement createYaziElemeneti= driver.findElement(By.xpath("//span[text()='Create a List']"));
createYaziElemeneti.click();

     // 4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
String expectedYazi = "Your Lists";
String actualYazi = driver.findElement(By.xpath("//div[@role='heading']")).getText();
        Assert.assertEquals(expectedYazi,actualYazi);





    }
}
