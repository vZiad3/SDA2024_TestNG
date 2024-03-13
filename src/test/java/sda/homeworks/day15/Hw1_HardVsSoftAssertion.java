package sda.homeworks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.tests.utilities.TestBase;

public class Hw1_HardVsSoftAssertion extends TestBase {
    /*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/

    @Test
    public void hardAssertion() throws InterruptedException {
        //  By.ById userName = driver.findElement(("username");
        //  By passWord = driver.findElement(By.id("password"));
        //
        //Test Case1: Positive Login Test
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement userEle = driver.findElement(By.id("username"));
        userEle.sendKeys("student");

        //Type password Password123 into Password field
        WebElement passWordEle = driver.findElement(By.id("password"));
        passWordEle.sendKeys("Password123");
        Thread.sleep(3000);
        //Click Submit button.
        driver.findElement(By.id("submit")).click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        // WebElement icon = driver.findElement(By.xpath("//img[@class='custom-logo']"));
        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'Congratulations')]")).size()>0);

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')

        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'successfully logged in')]")).size()>0);


        //Verify button Log out is displayed on the new page.
        WebElement logOutButton = driver.findElement(By.xpath("//div[.='Log out']"));
        Assert.assertTrue(logOutButton.isDisplayed());


    }

    @Test
    public void softAssertion() {
        SoftAssert sa = new SoftAssert();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement userEle = driver.findElement(By.id("username"));
        userEle.sendKeys("student");

        //Type password Password123 into Password field
        WebElement passWordEle = driver.findElement(By.id("password"));
        passWordEle.sendKeys("Password123");
        //Click Submit button.
        driver.findElement(By.id("submit")).click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String newUrl = driver.getCurrentUrl();
        System.out.println("newUrl = " + newUrl);
        // WebElement icon = driver.findElement(By.xpath("//img[@class='custom-logo']"));
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'Congratulations')]")).size()>0);


        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'successfully logged in')]")).size()>0);

        //Verify button Log out is displayed on the new page.
        WebElement logOutButton = driver.findElement(By.xpath("//div[.='Log out']"));
        sa.assertTrue(logOutButton.isDisplayed());
        sa.assertAll();


    }
}




