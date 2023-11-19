package Week_01;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1.testotomasyonu.com a git
        driver.get("https://www.testotomasyonu.com");

        //2.aramakutusunu locate et
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='search-input']"));


           //3.Shoes yazıp enter yap
        aramaKutusu.sendKeys("Shoes"+ Keys.ENTER);

           //4.bulunan sonuc sayısını yazdır
        WebElement sonucSayisi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucSayisi.getText());

        //5.açılan sayfada title ın Shoes içerdiğini test et

        String expectedTitleIcerik  = "Shoes";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitleIcerik)){
            System.out.println("Title içerik testi PASSED");
        }else System.out.println("Title içerik testi FAILED");

        //6.açılanlardan 2.seçeneği tıkla

        List<WebElement> secenekList = driver.findElements(By.className("prod-img"));
        secenekList.get(3).sendKeys(Keys.ENTER);

        //7.Urunun fiyatını öğren
        WebElement urunFiyati = driver.findElement(By.id("priceproduct"));
        System.out.println(urunFiyati.getText());

        //8.tekrar testotomasyonu.com a git
        driver.get("https://www.testotomasyonu.com");

        //9.sayfada 53 link old test et

        List<WebElement> LinkSayisi = driver.findElements(By.tagName("a href"));

        int expectedLinkSayisi = 53;
        int actualLinkSayisi = LinkSayisi.size();

        if (actualLinkSayisi==expectedLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else {
            System.out.println("Link sayisi testi FAILED");
            System.out.println("Link sayısı : " + LinkSayisi.size());
        }



        ReusableMethods.bekle(5);
        driver.quit();


    }
}
