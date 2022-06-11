package Class3;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class TakeScreenShots {

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

    @Test
    public void testBankScreenShot() throws Exception {


        UseDriver.openUrl("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Misc.sleep(5);
        this.takeSnapShot(UseDriver.getDriver(), "c://Users/cchen/test.png");


    }


}
