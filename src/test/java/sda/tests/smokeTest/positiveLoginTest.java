package sda.tests.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.tests.utilities.TestBase;

public class positiveLoginTest extends TestBase {
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
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'Congratulations')]")).size() > 0);


        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'successfully logged in')]")).size() > 0);

        //Verify button Log out is displayed on the new page.
        WebElement logOutButton = driver.findElement(By.xpath("//div[.='Log out']"));
        sa.assertTrue(logOutButton.isDisplayed());
        sa.assertAll();
    }
}