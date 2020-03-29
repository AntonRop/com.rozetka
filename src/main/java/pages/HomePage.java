package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By searchField = By.name("text");
    private By searchButton = By.cssSelector("header div button.js-rz-search-button");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage open(String url) {
        driver.get(url);
        return this;
    }

    public HomePage clickOnSearchField() {
        driver.findElement(searchField).click();
        return this;
    }

    public HomePage enterSearchTerm(String search) {
        driver.findElement(searchField).sendKeys(search);
        return this;
    }

    public SearchPage clickOnSearchButton() {
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }

}
