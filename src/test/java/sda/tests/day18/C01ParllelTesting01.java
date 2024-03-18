package sda.tests.day18;

import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class C01ParllelTesting01 extends TestBase {
    @Test
    public void test1(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread execution for test 1" + threadName);
    }
    @Test
    public void test2(){
        String threadName = Thread.currentThread().getName();

        System.out.println("Thread execution for test 2"+ threadName);
    }
    @Test
    public void test3(){
        String threadName = Thread.currentThread().getName();

        System.out.println("Thread execution for test 3"+ threadName);
    }
    @Test
    public void test4(){
        String threadName = Thread.currentThread().getName();

        System.out.println("Thread execution for test 4"+ threadName);
    }
}
