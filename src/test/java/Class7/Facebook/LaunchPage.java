package Class7.Facebook;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaunchPage {

    //Locators of elements on Launch Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//button[@name='login']");
    By messengerLocator = By.linkText("Messenger");

    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.xpath("//a[@title='Learn more about Facebook Pay']");
    // or By.linkText("Facebook Pay");

    // Methods to interact with elements of Launch Page
    // type in login email box

    public void enterLoginEmail(String loginEmail) {
        UseDriver.getDriver().findElement(loginEmailLocator).sendKeys(loginEmail);
    }

    // if login email box is enabled
    public boolean isLoginEmailBoxEnabled() {
        return UseDriver.getDriver().findElement(loginEmailLocator).isEnabled();
    }

    // type in login password
    public void enterLoginPassword(String loginPwd) {
        UseDriver.getDriver().findElement(loginPasswordLocator).sendKeys(loginPwd);

    }

    //click login button
    public void clickLoginButton() {
        UseDriver.getDriver().findElement(loginButtonLocator).click();
    }

    public void scrollToElement() {

        WebElement messengerElement = UseDriver.getDriver().findElement(messengerLocator);

        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", messengerElement);
    }

    // to click the messenger link

    public void clickMessengerLink() {
        UseDriver.openUrl("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("scrollBy(0, 800);");
        Misc.sleep(2);
        UseDriver.getDriver().findElement(messengerLocator).click();
    }


        // to get number of links
        public int getNumberOfLinks() {
            List<WebElement> allLinks = UseDriver.getDriver().findElements(allLinksLocator);
            return allLinks.size();
        }

        public void clickFacebookPay(){
            UseDriver.getDriver().findElement(facebookPayLocator).click();

        }
    }








