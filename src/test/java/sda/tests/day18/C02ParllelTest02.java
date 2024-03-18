package sda.tests.day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class C02ParllelTest02 extends TestBase {
    @Test
    public void test1(){
        new ChromeDriver().get("https://clarusway.com");

    }
    @Test
    public void test2(){
        new ChromeDriver().get("https://ebay.com");
    }
    @Test
    public void test3(){
        new ChromeDriver().get("https://linkedin.com");
    }
    @Test
    public void test4(){
        new ChromeDriver().get("https://google.com");
    }
}
