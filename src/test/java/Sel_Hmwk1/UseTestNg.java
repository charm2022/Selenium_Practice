package Sel_Hmwk1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseTestNg {

     /*
         * Use of TestNg:
         * Helps to create Test method
         * Helps to assert the result
         *
         * Use of Selenium;
         * Helps to automate web testcases
         * */

        // test method (all test methods are executable)
        @Test

        public void twoPlusTwoResult() {
            int result = 2+2;
            // result should be 4
            Assert.assertEquals(result, 4, "Error message to print if testcase/Assert fails");
        }
        @Test
        public void threePlusThreeResult() {
            int result = 3+3;
            Assert.assertEquals(result, 6, "3+3 verification failed");
        }
    }

