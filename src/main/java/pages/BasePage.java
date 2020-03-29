package pages;

import manager.AppManager;
import org.openqa.selenium.WebDriver;

public class BasePage {


    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = AppManager.driver;
    }
}
