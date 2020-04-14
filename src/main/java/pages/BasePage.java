package pages;

import manager.AppManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = AppManager.driver;
        PageFactory.initElements(AppManager.driver, this);
    }
}
