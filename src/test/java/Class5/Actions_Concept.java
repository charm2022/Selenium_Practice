package Class5;

import Helper.Misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Concept {

    @Test

    public void Actions_Demo(){

        // mouse Hover

        System.setProperty("webdriver.chrome.driver",  "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.classroomessentialsonline.com/";
        driver.get(url);

        WebElement churchChair = driver.findElement(By.xpath("//a[@href='/church-chairs/']"));

        Actions act = new Actions(driver);
        act.moveToElement(churchChair).build().perform();
        Misc.sleep(2);

        driver.findElement(By.xpath("//a[@href='/economy-church-chairs/']")).click();
        // or you may use Actions class's click, store the webelement such as
        // Webelement economyChurchChairs = driver.findElement(By.xpath("//a[@href='/economy-church-chairs/']"));
        // act.click(economyChurchChairs).build().perform();
        act.click(driver.findElement(By.xpath("//a[@href='/economy-church-chairs/']"))).build().perform();
        driver.quit();


    }
}
