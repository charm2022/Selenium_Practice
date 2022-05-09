package Class5.Facebook;

import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessengerLoginFail {

    By incorrectEmailErrorLocator = By.xpath("//div[text()='Incorrect email or phone number']");

    public boolean isIncorrectEmailErrorDisplayed() {
        return UseDriver.getDriver().findElement(incorrectEmailErrorLocator).isDisplayed();
    }
}
