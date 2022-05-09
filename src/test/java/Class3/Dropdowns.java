package Class3;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdowns {
    @Test
    public void dropDowns(){
        // Enter your date of birth in Create New Account flow in Facebook
        /*
        1. launch facebook.com
        2. click create new account button
        3. enter date of birth - Feb 20 1991
         */
        UseDriver.openUrl("https://www.facebook.com/");
        UseDriver.getDriver().findElement(By.xpath("//a[contains(@role,'button') and contains(@data-testid,'open-regis')]")).click();
        Misc.sleep(2);

        /**
         * Dropdown with select tag --> Select class
         * see notebook Page 160
         */
        WebElement monthDdElement = UseDriver.getDriver().findElement(By.id("month"));
        Select monthDd = new Select(monthDdElement);
        monthDd.selectByVisibleText("Feb");
        Misc.sleep(2);

        WebElement dayDdElement = UseDriver.getDriver().findElement(By.name("birthday_day"));
        Select dayDd = new Select(dayDdElement);
        dayDd.selectByValue("20");
        Misc.sleep(2);

        WebElement yearDdElement = UseDriver.getDriver().findElement(By.xpath("//select[@aria-label='Year']"));
        Select yearDd = new Select(yearDdElement);
        yearDd.selectByIndex(3);
        Misc.sleep(2);
    }
    @Test
    public void findCalendar(){

        UseDriver.openUrl("https://www.hotels.com");

        WebElement checkinCalenar = UseDriver.getDriver().findElement(By.xpath("//button[starts-with(@aria-label, 'Check-in')]"));
        checkinCalenar.click();
        Misc.sleep(2);

        WebElement dayElement = UseDriver.getDriver().findElement(By.xpath("(//button[@data-day='5'])[1]"));
        dayElement.click();

    }
}
