package sda.tests.day17;

import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class C04DataProviderFromAnotherClass extends TestBase {
     /*
        We can use our data by retrieving it from a different class; for this, we need to properly integrate the
        data provider method as a parameter into the test method.
        */

    @Test(dataProvider = "invalidCredentials", dataProviderClass = C02DataProviders02.class)           // it will get this method from this class C02DataPr...
    public void printCredentialsTest(String username , String password){
        System.out.println("username : " + username + " password : " + password);
    }
}
