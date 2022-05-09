package Class5;

import Class5.Facebook.LaunchPage;
import Class5.Facebook.MessengerHomePage;
import Class5.Facebook.MessengerLoginFail;
import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModel {

    /*
    Launch facebook
    click messenger
    click login button
    verify incorrect email error is displayed
     */
    @Test
    public void sampleTest() {

        UseDriver.openUrl("https://www.facebook.com/");
        LaunchPage lp = new LaunchPage();
        Misc.sleep(2);

        lp.clickMessengerLink();
        Misc.sleep(2);

        MessengerHomePage mhp = new MessengerHomePage();
        mhp.clickLoginButton();
        Misc.sleep(2);

        MessengerLoginFail mlf = new MessengerLoginFail();
        Assert.assertTrue(mlf.isIncorrectEmailErrorDisplayed(), "Incorrect Email error messages is not displayed");
        UseDriver.getDriver().quit();
    }
    @Test
    public void sampleTest2(){
        UseDriver.getDriver().get("https://www.facebook.com/");
        LaunchPage lp = new LaunchPage();
        lp.enterLoginEmail( "testing@gmail.com");
        lp.enterLoginPassword("abcd@1234");
        lp.clickLoginButton();




    }
}
