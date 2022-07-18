package tests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class Two extends Base {

    public WebDriver driver;

    @Test
    public void testTwo() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()+" from firefox");
        Reporter.log(driver.getTitle()+" from firefox");
        sleep(3000);
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = initializeBrowser("firefox");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
