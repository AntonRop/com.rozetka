package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class AppManager {
    public static WebDriver driver;
    private String browser;


    public AppManager(String browser) {
        this.browser = browser;
    }


    public void init()  {
        if (browser == BrowserType.CHROME) {
            System.setProperty("webdriver.chrome.driver", "d:\\automation\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser == BrowserType.FIREFOX) {

            System.setProperty("webdriver.gecko.driver", "d:\\automation\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser == BrowserType.IE) {
            System.setProperty("webdriver.ie.driver", "d:\\automation\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();


        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    public void stop() {
        driver.quit();
    }

    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }
}
