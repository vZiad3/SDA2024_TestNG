package sda.homeworks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        WebElement errorMes = driver.findElement(By.id("error"));
        String errorMessage = errorMes.getText();

        //System.out.println("errorMes  = " + errorMessage);

        //Asertions , message is apears & message equals to the one printed on the page
        sa.assertTrue(errorMes.isDisplayed());
        sa.assertTrue(errorMessage.equals("Your password is invalid!"));

        sa.assertAll();
    }
}