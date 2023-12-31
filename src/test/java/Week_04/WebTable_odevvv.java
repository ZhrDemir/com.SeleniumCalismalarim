package Week_04;

import Utilities.Before_After;
import Utilities.ReusableMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTable_odevvv extends Before_After {
    @Test
    public void test01(){

      // Bir Class olusturun D19_WebtablesHomework
      // 1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

      // 2. Headers da bulunan basliklari yazdirin
        List<WebElement> headersElementleriListesi = driver.findElements(By.xpath("(//div[@role='row'])[1]"));
        List<String> headersListesi = ReusableMethods.stringListeDonustur(headersElementleriListesi);
        System.out.print("Başlıkların Listesi : "+ headersListesi);

      // 3. 3.sutunun basligini yazdirin
        System.out.println("3. Sütun Başlığı : "+headersListesi.get(2));

      // 4. Tablodaki tum datalari yazdirin
        List<WebElement> tumDataElementleri = driver.findElements(By.xpath(""));

      // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
      // 6. Tablodaki satir sayisini yazdirin
      // 7. Tablodaki sutun sayisini yazdirin
      // 8. Tablodaki 3.kolonu yazdirin
      // 9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
      // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
      // sayisini girdigimde bana datayi yazdirsin




    }
}
