package Week_01;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativLocater {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      //  1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
      //  adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //  2 ) Berlin’i 3 farkli relative locator ile locate edin

        WebElement NYCLocater = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));
        WebElement BostonLocater = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement BerlinLocater = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(NYCLocater).toRightOf(BostonLocater));


      //  3 ) Relative locator’larin dogru calistigini test edin

        WebElement expectedLocater = BerlinLocater;
        WebElement actualLocater = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));

        if (actualLocater==expectedLocater){
            System.out.println("PASSED");
        }else System.out.println("FAIİLED");

        ReusableMethods.bekle(5);
        driver.quit();
    }
}
