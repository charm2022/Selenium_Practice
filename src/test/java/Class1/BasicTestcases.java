package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestcases {

    // testcase one: verify Facebook current url is correct after launching the page
    @Test
    public void verifyFacebookUrl() {
        System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);

        String urlFromWeb = driver.getCurrentUrl();
        Assert.assertEquals(urlFromWeb, url, "Facebook url is not correct after launch");

        driver.quit();
    }



        @Test
        public void verifyFacebookTitel() {

            System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.facebook.com/";
            driver.get(url);

            String titleFromWeb = driver.getTitle();
            Assert.assertEquals(titleFromWeb, "Facebook - log in or sign up", "Facebook title is not correct after launch");

            driver.quit();


        }
}
