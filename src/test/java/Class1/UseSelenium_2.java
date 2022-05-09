package Class1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseSelenium_2 {


        @Test
        public void useSelenium()    {
            //path of the ChromeDriver
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver(); //driver can store only one webpage about:blank
            driver.get("https://hotels.com");
            driver.get("https://google.com");
            // another way to launch a webpage
            String url = "https://www.facebook.com/";
            driver.navigate().to(url);

            /*
             * Method to maximize the webpage
             * method: maximize()

             */
            try {
                Thread.sleep(5000); //1sec = 1000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.manage().window().maximize();

            /*
             * to get the current-url of webpage
             * Method: getCurrentUrl
             * */
            String webUrl = driver.getCurrentUrl(); //https://www.facebook.com/
            Assert.assertEquals(url, webUrl, "Facebook was not launched successfully");
            /*
             * to get the page title of window associated with driver
             * Method: getTitle
             * */
            String pageTitle = driver.getTitle();
            System.out.println("Page title after launch " + pageTitle);

            /*
             * To close a webpage
             * Method-1: close(), only close the web-window associated with driver
             * Method-2: quit(), will close all web-window launched due to automation code/script
             * */

            driver.quit();

            /* get () vs navigate().to(url)
             * get() launches the webPage and wait for few seconds (for webPage to load)
             * before executing the next line in the code.
             * navigate().to() launches the webPage, and goes to execute the next line in the code
             * */
        }


    }

