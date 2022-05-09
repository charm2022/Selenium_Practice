package Class2;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseLocators {

    @Test

    public void useLocators() {

        UseDriver.openUrl("https://www.facebook.com/");
        Misc.sleep(2);
        WebElement loginEmailBox = UseDriver.getDriver().findElement(By.name("email"));
        loginEmailBox.sendKeys("lily@gmail.com");
        Misc.sleep(2);
        loginEmailBox.clear();
        loginEmailBox.sendKeys("adeline@hotmail.com");

        String loginButtonTag = "button";
        WebElement loginButton = UseDriver.getDriver().findElement(By.tagName("button"));
       // loginButton.click();
        boolean isLoginButtonEnabled = loginButton.isEnabled();
        Assert.assertTrue(isLoginButtonEnabled, "Login button is not enabled when user lands on Facebook.com");
        UseDriver.quitWebPages();

    }
    @Test
    public void checkSelected() {
        // verify no gender radio button is selected on Create new account form
        /*
        Launch facebook.com
        Click Create new account button
        Verify female radio button is not selected
        Verify male radio button is not selected
        Verify custom radio button is not selected
         */
        UseDriver.openUrl("https://www.facebook.com");
        Misc.sleep(2);



    }
}
