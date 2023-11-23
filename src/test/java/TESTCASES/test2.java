package TESTCASES;

import Utilities.BeforeClass_AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class test2 extends BeforeClass_AfterClass {



        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        // 3. Verify that home page is visible successfully
        // 4. Click on 'Signup / Login' button
        // 5. Verify 'Login to your account' is visible
        // 6. Enter correct email address and password
        // 7. Click 'login' button
        // 8. Verify that 'Logged in as username' is visible
        // 9. Click 'Delete Account' button
        // 10. Verify that 'ACCOUNT DELETED!' is visible

    @Test
    public void test1() {
        //  2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

        //  3. Ana sayfanın başarıyla göründüğünü doğrulayın
        String homePageTitle = driver.getTitle();
        Assert.assertEquals("Automation Exercise", homePageTitle);

    }
    @Test
            public void test2() {
        //  4. 'Kayıt Ol / Giriş Yap' butonuna tıklayın
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

        //  5. 'Hesabınıza giriş yapın' seçeneğinin görünür olduğunu doğrulayın
        WebElement expectedyaziElementi = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(expectedyaziElementi.isDisplayed());


        //  6. Doğru e-posta adresini ve şifreyi girin
        driver.findElement(By.xpath("//*[@*='login-email']")).sendKeys("zdem2021@gmail.com");
        driver.findElement(By.xpath("//*[@*='login-password']")).sendKeys("password");

        //  7. 'Giriş yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@*='login-button']")).click();

        //  8. 'Kullanıcı adı olarak oturum açıldı' seçeneğinin görünür olduğunu doğrulayın
        WebElement expectedKullaniciAdi = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(expectedKullaniciAdi.isDisplayed());

    }
    @Test
    public void test3(){
     //  9. 'Hesabı Sil' düğmesine tıklayın
        driver.findElement(By.xpath(" //a[text()=' Delete Account']")).click();

     //  10. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. görünür

        driver.get("https://automationexercise.com/delete_account");
        WebElement expectedHeapSilindiYazisi= driver.findElement(By.xpath("//*[@class='title text-center']"));
        Assert.assertTrue(expectedHeapSilindiYazisi.isDisplayed());



    }







}
