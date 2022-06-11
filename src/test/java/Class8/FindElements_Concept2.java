package Class8;

import Class7.Facebook.LaunchPage;
import Helper.DateUtil;
import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElements_Concept2 {

    /*
    To find multiple webElements using a locator
    Method: findElements
    return type: List<WebElement>
     */

    @Test
    public void findElements_Concept() {
        /* Verify Facebook launch page has 48 links
    1. launch facebook.com
    2. find the number of links of launch page
    3. verify count from #2 is 48

         */
        UseDriver.openUrl("https://www.facebook.com");
        LaunchPage lp = new LaunchPage();
        int linksCountFromWeb = lp.getNumberOfLinks();

        Assert.assertEquals(linksCountFromWeb, "Number of links are not same as expected");

        UseDriver.quitWebPages();

    }
    @Test
    public void CalendarOnWeb() {
        /*
        1. Analyse if the Date-Value are present in dom as text-value or some attribute's - value
        2. Create locator to get all date-webElement of interested month (//h2[text() = 'January 20
        3. Use findElements method to get all data-WebElements
        4. use loop
            pick dateElement from List<WebElement>
            apply getText or getAttribute [depend on step#1]
            if (above-value is equal to date user want to select)
                click the WebElement
                break the loop
          */

        UseDriver.openUrl("https://www.hotels.com");

        try {
            UseDriver.getDriver().findElement(By.xpath("//span[text()='Check in' or text()='Check-in'"));
        } catch (ElementClickInterceptedException e) {
            UseDriver.getDriver().findElement(By.xpath("//button[starts-with(@aria-label, 'Check-in"));
        }

    }
        @Test
        public void CalendarOnWeb2() {
        /* Select tomorrow's date as Check-in (Jan 8)
        Select Checkout as 7 days from Check-in (Jan 15)
         */

        UseDriver.openUrl("https://www.hotels.com");
        try {
            UseDriver.getDriver().findElement(By.xpath("//span[text()='Check in' or 'Check-in'"));
        } catch (ElementClickInterceptedException e) {
            UseDriver.getDriver().findElement(By.xpath("//button[starts-with(@aria-label, 'Check-in'"));
        }

            Misc.sleep(2);
        String[] dateFields = DateUtil.getTomorrowDateFields();

    }

    @Test
public void Autosuggestions() {

    /* 1. Analyse if the auto-suggestions are present in dom as text-value or some attribute's-value
    2. Create locator to get all auto-suggestions webElements (//ul[contains(@data-stid, 'des
    3. Use findElements method to get all auto-suggestions-WebElements
    4. use loop
        pick autoSuggestion=WebElment from List<WebElement>
        apply getText or getAttribute [depends on step@1]
         if (above-value is equal to date user want to select)
                click the WebElement
                break the loop
     */

        UseDriver.openUrl("https://www.hotels.com");

    }

    @Test
    public void verifyMonthDropdown() {

        /*
        Array[] monthNames = [Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]
        boolean isFail = false;
        FindElements find all webElements with Month-values (List of <WebElement>) (web1, web2, web3, ...)
        Loop
            pick a webElement (web1)
            if web1.getText() (Jan) is not equal to Array[0], fail testcase, stop the loop
            isFail = true, stop the loop
            pick a webElement(web2)
            if web2.getText() (Feb) is Not equal to Array[1]
            ifFail = true
            stop the loop
            After loop,
            Assert.assertFalse(isFail, "Dropdown values are not expected")

         */




    }
}

