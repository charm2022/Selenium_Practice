package Class7.Facebook;

import Web.UseDriver;
import org.openqa.selenium.By;

public class MessengerLoginFail {

    By incorrectEmailErrorLocator = By.xpath("//div[text()='Incorrect email or phone number']");

    public boolean isIncorrectEmailErrorDisplayed() {
        return UseDriver.getDriver().findElement(incorrectEmailErrorLocator).isDisplayed();
    }
}
