package Selenium_Hmwk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sel_Hmk1 {

        @Test
        public void launchAmazon() {

            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.amazon.com");
            driver.quit();

        }

        @Test
        public void verifyAmazonUrl() {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.amazon.com/";
            driver.get(url);
            String urlFromWeb = driver.getCurrentUrl();
            Assert.assertEquals(urlFromWeb, url, "Amazon url is not correct after launch");
            driver.quit();
        }


        public class Homework1_Solution {

            /**
             * Create new repository in github
             * Invite Ahsan, Tim or I as collaborator in the repository
             * Clone repository in local
             * Create a Maven project in above clones repository
             * Add TestNg and Selenium-Java dependencies in pom.xml
             * Check version of Chrome installed in your machine
             * Download and save compatible ChromeDriver
             * Create a new package in src/test/java package
             * Create a new class in above created package
             * Create a test-method using @Test annotation
             * Write code in above test-method to perform below steps
             * 1. Launch amazon.com
             * 2. verify url of the launched is as expected
             */
            @Test
            public void openWebPage() {

                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                String url = "https://www.facebook.com/";
                driver.get(url);
                driver.quit();
            }
        }
    }


