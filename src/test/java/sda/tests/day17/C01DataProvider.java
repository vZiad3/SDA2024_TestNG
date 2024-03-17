package sda.tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class C01DataProvider extends TestBase {
    //    /*
    //    @DataProvider is a TestNG annotation.
    //    Therefore, it is used exclusively with TestNG.
    //    It is used to provide data / obtain a list of data in TestNG.
    //    It is used for Data Driven Testing (DDT).
    //    It serves the same purpose as Scenario Outline in Cucumber.
    //    How to pass data from one method to another using DataProvider?
    //
    //    Use the dataProvider in the test method and set the description equal to the method name.
    //    We can provide an alternative name using "name = "alternative name".
    //    */

    By searchBoxId = By.id("gh-ac");
    @Test(dataProvider = "getData" )
    public void searchTest(String searchKey){
        driver.get("https://www.ebay.com");
        WebElement searchBox = driver.findElement(searchBoxId);
        searchBox.sendKeys(searchKey, Keys.ENTER);

    }
    @DataProvider
    public Object [][] getData(){
        Object [][] data = {{"Java"} , {"JavaScript"} ,{"Python"} };            // its kind like Loop it will loop until this array finish
        return data;

    }





    @Test(dataProvider = "Aseel" )
    public void searchTest2(String searchKey){
        driver.get("https://www.ebay.com");
        WebElement searchBox = driver.findElement(searchBoxId);
        searchBox.sendKeys(searchKey, Keys.ENTER);

    }
    @DataProvider(name  = "Aseel")
    public Object [][] getData2(){
        Object [][] data = {
                         {"iphone"}            // for readability
                        ,{"android"}                // Multiple Arrays
                        ,{"Laptop"} };            // its kind like Loop it will loop until this array finish
        return data;

    }
}
