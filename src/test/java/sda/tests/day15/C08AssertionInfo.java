package sda.tests.day15;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08AssertionInfo {

    @Test
    public void hardAssertion(){
        // Hard assertions are methods that we call through the Assert class.
        // If any assertion fails during test execution, the test execution stops at that moment.
        System.out.println("Testing equality of 3=3");
        Assert.assertEquals(3,3);       //Passed
        Assert.assertTrue(3==3);
        //passed

        //failed, execution stops here
        Assert.assertEquals(3,4);

        //this line won't be executed as the program crashes after a hard assertion failure
        System.out.println("This message wont appear in the console  because the previous will fail ");
        Assert.assertTrue(3==3);

    }

    @Test
    public void softAssertion(){
        // Soft assertion - verification; test execution continues even if assertions fail.
        SoftAssert sa = new SoftAssert();
        System.out.println("Testing equality of 3=4");//failed
        sa.assertEquals(3,4);


        System.out.println("Testing equality of 3=3");
        sa.assertEquals(3,3);

        //failed, but it doesn't underline..
        sa.assertAll();
        //passed
        //sa.assertAll();
        // If not used, all assertions are written in vain.
        // This method puts all assertions into action.
        // If there is any failure, it underlines it in yellow.

        System.out.println("Will this message appear in the console?");//This message won't appear..
        // Soft assert continues to work even if an error is found, and this continuation feature is valid until assertAll().
    }
}