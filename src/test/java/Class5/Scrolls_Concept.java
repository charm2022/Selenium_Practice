package Class5;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolls_Concept {

    /**
     * To scroll in webpage, we use JavaScript
     * 1. scroll by pixel
     * scrollBy(0,y)
     * y is +ve --> scroll downwards pixels down
     * scrollBy(0, 500) --> scroll downwards by 500 pixels
     * y is -ve --> scroll upwards pixels down
     * scrollBy(0,-500) --> scroll upwards by 500 pixels
     *
     */
    @Test
    public void scrollByPixel1(){

        UseDriver.openUrl("https://www.darksky.net");

        // scroll to Time Machine button

        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("scrollBy(0, 1000)");

        Misc.sleep(5);
        UseDriver.getDriver().findElement(By.xpath("//a[@class='button']")).click();
    }
    @Test
    public void Scrolls_Concept2() {

        UseDriver.getDriver().get("https://www.darksky.net");

        for (int i = 1; i <= 15; i++) {
            try {
                UseDriver.getDriver().findElement(By.xpath("//a[@class='button']")).click();
                break;
            } catch (ElementClickInterceptedException e) {
                JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver(); //casting, change one datatype to another
                js.executeScript("scrollBy(0, 200)");
            }
        }
    }


            @Test
            public void scrollUpToElement(){

                /**
                 * scroll up to a webElement
                 * "element.scrollIntoView(true)"
                 * scroll up only once
                 */
                WebElement element = UseDriver.getDriver().findElement(By.xpath(""));

                JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
                js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    @Test
    public void scrollToBottom(){
    //"window.scrollTo(0,document.body.scrollHeight);"

       UseDriver.openUrl("https://www.darksky.net");

        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        UseDriver.getDriver().quit();

    }

        }



