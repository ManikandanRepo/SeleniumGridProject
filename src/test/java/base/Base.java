package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {

        WebDriver driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        switch (browserName){
            case "chrome":
                dc.setBrowserName("chrome");
                break;
            case "firefox":
                dc.setBrowserName("firefox");
                break;
            case "edge":
                dc.setBrowserName("MicrosoftEdge");
                break;
            default:
                System.out.println("Please enter the valid browserName as 'chrome', 'firefox', 'edge'");
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
        return driver;

    }
}
