package Week_01;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

      // 2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();

      // 3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");

      // 4. Password alanina “password” yazdirin
        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");


      // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).sendKeys(Keys.ENTER);

      // 6. Back tusu ile sayfaya donun
        driver.navigate().back();

      // 7. Online Banking menusunden Pay Bills sayfasina gidin

        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

      // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("100");

      // 9. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//*[@id='sp_date']")).sendKeys("2020-09-10");
        ReusableMethods.bekle(5);

      // 10. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='pay_saved_payees']")).click();

      // 11. “The payment was successfully submitted.” mesajinin
      // ciktigini test edin

         WebElement mesaj= driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        String actualMesaj=mesaj.getText();
        String expectedMesaj = "The payment was successfully submitted.";

        if (actualMesaj.equals(expectedMesaj)){
            System.out.println("Mesaj testi PASSED");
        }else System.out.println("Mesaj testi FAILED");

        ReusableMethods.bekle(5);
        driver.quit();
    }
}
