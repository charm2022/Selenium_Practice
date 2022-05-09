package Class3;

import Helper.Misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Locale;

public class UseLocators_3 {

    @Test
    public void getTextMethod() {
        // Verify hotels.com homepage has SEARCH text in the Search button
        /* 1. launch hotels.com
        2. get the text from Search button
        3. compare text from Step2 - should be Search
         */
        System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hotels.com/";
        driver.get(url);

        String searchButtonXpath = "//button[text()='Search']";
        By searchButtonLocator = By.xpath("//button[text()='Search']");
        WebElement searchButton = driver.findElement(searchButtonLocator);
        String searchButtonText = searchButton.getText();
        // Expected Text = SEARCH, your actual text = Search

        Assert.assertTrue(searchButtonText.equalsIgnoreCase("SEARCH"), "search button text is not as expected");
        driver.quit();
    }

    @Test
    public void getAttributeMethod(){
       // verify text on empty login and password field on facebook landing page
        // text on empty login box: email or phone number
        // text on empty password box: password

        /*
        1. launch facebook.com
        2. get value of placeholder-attribute for login box
        3. get value of placeholder-attribute for password box
        4. Assert (ignore case)
        5. Assert (ignore case)
        */

        System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);

        By loginLocator = By.id("email"); //skipped step: String loginId = "email"
        WebElement loginbox = driver.findElement(loginLocator);
        String loginPlaceholderValue = loginbox.getAttribute("placeholder");

        String passwordXpath = "//input[starts-with(@data-testid, 'royal_p')]";
        By passLocator = By.xpath(passwordXpath);
        WebElement passBox = driver.findElement(passLocator);
        //use one line like this:
        // WebElement passBox = driver.findElement(By.xpath("//input[starts-with(@data-testid, 'royal_p')]));
        String passPlaceholderValue = passBox.getAttribute("placeholder");

        Assert.assertTrue(loginPlaceholderValue.equalsIgnoreCase("Email or phone number"), "login box placeholder is not as expected");
        Assert.assertTrue(passPlaceholderValue.equalsIgnoreCase("Password"), "Password box placeholder is not as expected");
        Misc.sleep(2);

        driver.quit();

    }
}
