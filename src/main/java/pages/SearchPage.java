package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    By resultItem = By.cssSelector("div li.catalog-grid__cell:nth-of-type(1)");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean isItemFound() {
        try {
            driver.findElement(resultItem);
            return true;
        } catch (RuntimeException e) {
            return false;
        }


    }
}
