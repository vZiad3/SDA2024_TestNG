package sda.homeWorks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class hw2DataProvider extends TestBase {
By search= By.xpath("//*[@name='search']");
By password= By.id("input-password");
By email= By.id("input-email");
    @Test(dataProvider= "multipleDataEntery" )
    public void dataProviderHw(String entery){
        //Open the site: http://opencart.abstracta.us/index.php?route=account/login

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        //Login with that credentials
        WebElement emailEle = driver.findElement(email);
        emailEle.sendKeys("clarusway@gmail.com");
        //Email: clarusway@gmail.com

        //Password: 123456789
        WebElement passWordEle = driver.findElement(password);
        passWordEle.sendKeys("123456789");

        driver.findElement(By.xpath("//*[@value='Login'][@class='btn btn-primary']")).click();

        //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
        WebElement searchEle = driver.findElement(search);
        searchEle.sendKeys(entery, Keys.ENTER);
    }

    // Here's the data we gonna provide according to the homework
    @DataProvider(name = "multipleDataEntery")
    public Object[][] enteryData(){
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}};
        }
    }
