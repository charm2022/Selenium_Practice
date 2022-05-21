package Class7;

import Class7.Facebook.LaunchPage;
import Helper.DateUtil;
import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.WebStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements_Concept {
    @Test
    public void findElements_Concept() {
        UseDriver.openUrl("https://www.facebook.com");
        LaunchPage lp = new LaunchPage();
        int linksCountFromWeb = lp.getNumberOfLinks();

        Assert.assertEquals(linksCountFromWeb, 47, "Number of links are not same as expected");
        UseDriver.quitWebPages();
    }

    @Test
    public void CalendarOnWeb() {
        UseDriver.openUrl("https://www.hotels.com");
        UseDriver.getDriver().findElement(By.xpath("//button[starts-with(@aria-label, 'Check-in')]")).click();
        Misc.sleep(2);

        String mayDatesLocator = "//h2[text()='May 2022']/following-sibling::table//button";
        List<WebElement> allMayDates = UseDriver.getDriver().findElements(By.xpath(mayDatesLocator));

        for (WebElement mayDate : allMayDates) {
            String dateValue = mayDate.getText();
            if (dateValue.equalsIgnoreCase("19")) {
                mayDate.click();
                break;
            }
        }
    }


    @Test
    public void CalendarOnWeb2() {

        /**
         * Select tomorrow's date as Check-in (May 16)
         * Select Checkout as 7 days from Check-in (May 23);
         *
         */
        UseDriver.openUrl("https://www.hotels.com");
        UseDriver.getDriver().findElement(By.xpath("//button[starts-with(@aria-label, 'Check-in')]")).click();
        Misc.sleep(2);

        String[] dateFields = DateUtil.getTomorrowDateFields(); // dateFields = [22, May, 2022]
        String datesLocator = "//h2[text()='" + dateFields[1] + " " + dateFields[2] + "']/following-sibling::table//button";
        List<WebElement> allDates = UseDriver.getDriver().findElements(By.xpath(datesLocator));

        for (WebElement date : allDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(dateFields[0]) || dateAttributeValue.equalsIgnoreCase(dateFields[0])) {
                date.click();
                break;
            }
        }

        String[] checkoutDateFields = DateUtil.addDaysToTomorrow(7);
        String checkoutDatesLocator = "//h2[text()='" + checkoutDateFields[1] + " " + checkoutDateFields[2] + "']/following-sibling::table//button";
        List<WebElement> allCheckoutDates = UseDriver.getDriver().findElements(By.xpath(checkoutDatesLocator));

        for (WebElement date : allCheckoutDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(dateFields[0]) || dateAttributeValue.equalsIgnoreCase(checkoutDateFields[0])) {
                date.click();
                break;
            }

        }
    }
}