package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseSelenium {

    @Test
    public void useSelenium() {
        // path of the ChromDriver
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotels.com");

    }
}
