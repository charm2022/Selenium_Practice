package Web;

import Helper.Misc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class UseDriver {

    // create driver as field variable, so driver can store chromedriver object
        static WebDriver driver;
        //if you want user use className Driver.openUrl, put static
        public static void openUrl(String url){
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver =  new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get (url);
            // Misc.sleep(2);
        }
        public static WebDriver getDriver(){

            return driver;
        }

        public static void quitWebPages(){

            driver.quit();
        }

        //for example: then in Selenium_2 class, I can use this method
        public static int add(){
            return 2;
        }


    }
