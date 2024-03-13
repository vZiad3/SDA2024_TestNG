package sda.homeworks.day15;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.tests.utilities.TestBase;


public class Hw2 extends TestBase {
    /*
        Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Click Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!

     */

    @Test
    public void test() {

    //        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
       // Type username incorrectUser into Username field.

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("studeneeett");

        // Type password Password123 into Password field.

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        //Click button
        driver.findElement(By.xpath("//*[@id='submit']")).click();



        SoftAssert sa = new SoftAssert();
        //Asertions , message is apears & message equals to the one printed on the page

        // Verify error message is displayed.
        WebElement errorMes = driver.findElement(By.id("error"));
        String errorMessage = errorMes.getText();
        sa.assertTrue(errorMes.isDisplayed());

      //         Verify error message text is Your username is invalid!
        sa.assertTrue(errorMessage.equals("Your username is invalid!"));


        sa.assertAll();

    }
}