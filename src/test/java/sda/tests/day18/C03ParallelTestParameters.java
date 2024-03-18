package sda.tests.day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C03ParallelTestParameters {

    @Test(threadPoolSize = 4, invocationCount = 8, timeOut = 1000 ) //invoc = means how mych we gonna use the mehtod
    public void test1(){

        System.out.println("Thread id is :" + Thread.currentThread().getId());
    }
}
