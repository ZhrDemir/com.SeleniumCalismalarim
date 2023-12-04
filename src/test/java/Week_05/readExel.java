package Week_05;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readExel {

//    1. apache poi dependency’i pom file’a ekleyelim
// . Java klasoru altinda resources klasoru olusturalim
// . Excel dosyamizi resources klasorune ekleyelim
// . excelAutomation isminde bir package olusturalim
// . ReadExcel isminde bir class olusturalim
// . readExcel( ) method olusturalim

    @Test
    public void readExcel() throws IOException {


// . Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "C:\\Users\\AİLE\\Desktop\\Zehra\\IT\\com.seleniumCalismalarim\\src\\test\\java\\resources\\ulkeler.xlsx";

// . FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);

// . Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fis);

// 0. WorkbookFactory.create(fileInputStream)
// 11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sayfa1 = workbook.getSheet("Sayfa1");

// 2. Row objesi olusturun sheet.getRow(index)
        Row row = sayfa1.getRow(1);

// 3. Cell objesi olusturun row.getCell(index)
        Cell cell = row.getCell(2);

        System.out.println(sayfa1.getRow(1).getCell(2));
        sayfa1.getRow(0).createCell(4);
        sayfa1.getRow(0).getCell(4).setCellValue("Nüfus");

        sayfa1.getRow(2).createCell(4).setCellValue("1222");
        System.out.println(sayfa1.getRow(0).getCell(4));
        System.out.println(sayfa1.getRow(2).getCell(4));
        fis.close();
        workbook.close();
    }
 }