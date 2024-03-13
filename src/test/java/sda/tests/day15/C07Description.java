package sda.tests.day15;
import org.testng.annotations.Test;

public class C07Description {


    // To describe what test methods do, we use description attribute.

    @Test(description = "this is testcase1")                // description is like comment ( for provide info of the method )
    void testCase1() {

        System.out.println("SDET");
    }


    @Test(description = "this is testcase2")                     // description is like comment ( for provide info of the method )
    void testCase2() {
        System.out.println("QA Analyst");
    }

    @Test(description = "this is testcase3")
    void testCase3() {
        System.out.println("Software Developer");
    }        // description is like comment ( for provide info of the method )

    /*
    SDET
    QA Analyst
    Software Developer
     */

}