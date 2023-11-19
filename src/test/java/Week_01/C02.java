package Week_01;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {


// Automation Exercise Category Testi

// 1- Bir test class’i olusturun ilgili ayarlari yapin

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


// 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

// 3- Category bolumundeki elementleri locate edin

        List<WebElement> categoryElementleriList = driver.findElements(By.xpath("//div[@class='panel panel-default']"));


// 4- Category bolumunde 3 element oldugunu test edin

        int expectedCategorySayisi = 3;
        int actualCategorySayisi = categoryElementleriList.size();

        if (expectedCategorySayisi==actualCategorySayisi){
            System.out.println("Category testi PASSED");
        }else {
            System.out.println("Category testi FAILED");
            System.out.println("Category sayısı : " + categoryElementleriList.size());
        }
// 5- Category isimlerini yazdirin

        List<String> stringListesi = new ArrayList<>();
        for (WebElement each:categoryElementleriList
             ) {
            stringListesi.add(each.getText());
        }
        System.out.println(stringListesi);

// 6- Sayfayi kapatin

        ReusableMethods.bekle(5);
        driver.quit();







    }
}
