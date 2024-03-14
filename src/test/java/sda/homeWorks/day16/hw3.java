package sda.homeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class hw3 extends TestBase {

    @Test
    @Parameters({"username", "password"})
    public void postiveTest(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(username);

        //Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(password);

        driver.findElement(By.id("submit")).click();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        // WebElement icon = driver.findElement(By.xpath("//img[@class='custom-logo']"));
        //WebElement congrats = driver.findElement(By.xpath("//*[.='Congratulations')]"));
      //  Assert.assertTrue(congrats.isDisplayed());
        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'successfully logged in')]")).size()>0);

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement verff = driver.findElement(By.xpath("//h1[.='Logged In Successfully']"));
        Assert.assertTrue(verff.isDisplayed());
        //Verify button Log out is displayed on the new page.
        WebElement logOutButton = driver.findElement(By.xpath("//a[.='Log out']"));
        Assert.assertTrue(logOutButton.isDisplayed());
    }

    @Test
    @Parameters({"username", "password"})
    public void negativeTestUserName(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type incorrectUser  into Username field
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(username);

        //Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(password);

        driver.findElement(By.id("submit")).click();


        //Asertions , message is apears & message equals to the one printed on the page

        // Verify error message is displayed.
        WebElement errorMes = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMes.isDisplayed());

        //         Verify error message text is Your username is invalid!
       // Assert.assertTrue(errorMessage.equals("Your username is invalid!"));
    }

    @Test
    @Parameters({"username", "password"})
    public void negativeTestPassword(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(username);

        //Type incorrectPassword  into Password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(password);

        driver.findElement(By.id("submit")).click();

        WebElement errorMes = driver.findElement(By.id("error"));
        String errorMessage = errorMes.getText();

        //System.out.println("errorMes  = " + errorMessage);

        //Asertions , message is apears & message equals to the one printed on the page
        Assert.assertTrue(errorMes.isDisplayed());
        //Assert.assertTrue(errorMessage.equals("Your password is invalid!"));


    }
}