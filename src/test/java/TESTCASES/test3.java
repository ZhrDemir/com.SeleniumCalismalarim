package TESTCASES;

import Utilities.BeforeClass_AfterClass;
import Utilities.Before_After;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class test3 extends BeforeClass_AfterClass {

    @Test
    public void test01() {


        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(expectedURL, actualURL);
    }
    @Test
     public void test02(){
        driver.get("http://automationexercise.com");
      // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@*='/login']")).click();

      // 5. Verify 'Login to your account' is visible
        WebElement loginElem = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginElem.isDisplayed());


      // 6. Enter incorrect email address and password

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("a@a.gmail.com"+ Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("a"+Keys.ENTER);

      // 7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

      // 8. Verify error 'Your email or password is incorrect!' is visible

        WebElement incorrectYaziEl = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
        Assert.assertTrue(incorrectYaziEl.isDisplayed());













  }

}
