package sda.homeworks.day15;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.tests.utilities.TestBase;

public class Hw3 extends TestBase {
    @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("PasSSSswwwword122234343");
        driver.findElement(By.xpath("//*[@id='submit']")).click();


        SoftAssert sa = new SoftAssert();

        sa.assertTrue(driver.findElements(By.id("error")).size() > 0);
        sa.assertTrue(driver.getPageSource().contains("Your password is invalid!"));

        sa.assertAll();
    }
}