package Week_05;

import Week_04.File;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class readExcel2 {
    @Test
    public void readExcel2() throws IOException {



//     Yeni bir test method olusturalim readExcel2( )

        String dosyaYolu = "C:\\Users\\AİLE\\Desktop\\Zehra\\IT\\com.seleniumCalismalarim\\src\\test\\java\\resources\\ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sayfa1 = workbook.getSheet("Sayfa1");


// - 1.satirdaki 2.hucreye gidelim ve yazdiralim
        System.out.println(sayfa1.getRow(0).getCell(1));

// - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String baskent1 = sayfa1.getRow(0).getCell(1).toString();
        System.out.println(baskent1);


// - 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expected = "Kabil";
        String actual = sayfa1.getRow(1).getCell(3).toString();
        Assert.assertEquals(expected,actual);

// - Satir sayisini bulalim

       int satirSayisi= sayfa1.getLastRowNum();
        System.out.println(satirSayisi);

// - Fiziki olarak kullanilan satir sayisini bulun
        int fizikSatirs = sayfa1.getPhysicalNumberOfRows();
        System.out.println(fizikSatirs);
// - Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

        Map<String,String> ulkelerMap = new TreeMap<>();
          String ulkeIsimleri = "";
          String baskentIsimleri = "";

        for (int i = 0; i <= satirSayisi; i++) {
            ulkeIsimleri=sayfa1.getRow(i).getCell(2).toString();
            baskentIsimleri = sayfa1.getRow(i).getCell(3).toString();
            ulkelerMap.put(ulkeIsimleri,baskentIsimleri);

        }
           String expectedUlke = "Moskova";
        String actualUlke = ulkelerMap.get("Rusya");
        Assert.assertEquals(expectedUlke,actualUlke);
        System.out.println(ulkelerMap.get("Rusya"));

}
 }