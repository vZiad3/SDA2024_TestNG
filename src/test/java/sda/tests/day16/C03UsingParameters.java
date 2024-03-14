package sda.tests.day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03UsingParameters {

    @Test
    @Parameters("name")                                 // parametrizedTest , u need to enter name so u can use the method
    public void parametrizedTest(String name ){
        System.out.println("Welcome" + name);

    }
    @Test
    @Parameters({"name","surname","age"})
    public void threeParameter(String name, String surname,String age){
        System.out.println("your full name is : " + name + " " + surname + " "+"and your age is : " + age );
    }


}
