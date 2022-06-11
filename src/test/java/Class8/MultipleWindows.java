package Class8;

import Class7.Facebook.FacebookPayPage;
import Class7.Facebook.LaunchPage;
import Helper.Misc;
import Web.UseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    //Verify after clicking on Facebook Pay, user can see new page with Title "Facebook Pay: Simple, Secure, Free Payments"

    @Test
    public void verifyFacebookPayLanding() {
        /*
        Launch facebook.com
        click on facebook pay link
        verify new page with title "facebook pay: simple, secure, free payment"
         */

        UseDriver.openUrl("https://www.facebook.com");
        LaunchPage lPage = new LaunchPage();
        lPage.clickFacebookPay();

        // Driver is always connected to one window unless we change it
        /**
         * To get the value of windowHandle stored in driver
         * Method: getWindowHandle
         * Return Type: String
         */
        String launchWindowHandle = UseDriver.getDriver().getWindowHandle();
        System.out.println("launchWindowHandle = " + launchWindowHandle);


       // FacebookPayPage fpPage = new FacebookPayPage();
        //   Assert.assertEquals(fpPage.getPageTitle(), "Facebook Pay: Simple, Secure, Free Payments", "Facebook Pay page title is not as expected");

        /**
         * To get the value of All WindowHandle generated due to automated code
         * Method:getWindowHandles
         * Return Type: Set of <String>
         */
       Set<String> allHandles = UseDriver.getDriver().getWindowHandles();
        System.out.println("allHandles =" + allHandles);

        String launchWindowHandle2 = UseDriver.getDriver().getWindowHandle();
        System.out.println("launchWindowHandle2 =" + launchWindowHandle2);
        /*
        To connect driver with new windowHandle
        Method: switchTo().window(windowHandle)
        input: windowHandle
         */
        /*
        get the windowHandle stored in driver (handleRightNow = wh1)
        using getWindowHandles get all windowHandles (allHandles = wh2, wh1)
        loop
        get a handle from allHandles-Set
        if(handle != handleRightNow)
        switch to new handle
        break/stop the loop
         */

         // UseDriver.getDriver().switchTo().window("newWindowHandle");
        for (String handle: allHandles) {
            if (!handle.equals(launchWindowHandle)) {
                UseDriver.getDriver().switchTo().window(handle);
                break;
            }
        }

        FacebookPayPage fpPage = new FacebookPayPage();
        Assert.assertEquals(fpPage.getPageTitle(), "Facebook Pay: Simple, Secure, Free Payments", "Facebook Pay page title is not as expected");


    }

    @Test
    public void verifyCloseAllAds() {

        /* launch naukri.com
        if any adv window opens
        cose all ads
        click search button on naukri.com
         */
        UseDriver.openUrl("https://www.ducksters.com");

        /*
        get all window handles
        if size of windowHandles -Set > 1
        then execute code to close advs
       */

        String mainWindowHandle = UseDriver.getDriver().getWindowHandle(); //mainHandle
        Set<String> allHandles = UseDriver.getDriver().getWindowHandles(); //mainHandle, handle1, handle2, handle3)

        if (allHandles.size() > 1) {
            //code to close ads
            /* loop
                get a handle from allHandles-Set (handle1)
                if (handle != mainWindowHandle)
                switch driver to handle1
                driver.close (); //close handle1, then one by one, close all handles except mainHandle
             */
            // then switch driver to mainHandle
            // findElement for Search button

            for (String handle: allHandles) {
                if(!handle.equals(mainWindowHandle)) {
                    Misc.sleep(5);
                    UseDriver.getDriver().switchTo().window(handle);
                    UseDriver.getDriver().close();
                }
            }

        }
        UseDriver.getDriver().switchTo().window(mainWindowHandle);
        //then findElement for Search button
        // click Search button

    }

}