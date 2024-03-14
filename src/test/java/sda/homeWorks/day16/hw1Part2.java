package sda.homeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class hw1Part2 extends TestBase {
    @Test
    @Parameters("AutomationFrameWork")
    public void hw2(String AutomationFrameWork) {
        //HW01:
        //Go to URL: https://www.google.com
        driver.get("https://www.google.com");
        //Search words: Java, Selenium
        WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        search.click();
        search.sendKeys(AutomationFrameWork);

        //Button click
        driver.findElement(By.xpath("//input[@name='btnK'][@role='button']")).click();
        //Assert get text result est that the result text contains the searched Word.
        WebElement result2 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        Assert.assertTrue(result2.isDisplayed());
        //Run tests from XML file.



    }
}
