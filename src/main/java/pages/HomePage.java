package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
//    private By searchField = By.name("text");
//    private By searchButton = By.cssSelector("header div button.js-rz-search-button");
   @FindBy(name = "search")
   private WebElement searchField;
   @FindBy(css = "body > app-root > div > div:nth-child(2) > app-rz-header > header > div > div.header-bottomline > div.header-search.js-app-search-suggest > form > button")
   WebElement searchButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage open(String url) {
        driver.get(url);
        return this;
    }

    public HomePage clickOnSearchField() {
        searchField.click();
    //    driver.findElement(searchField).click();
        return this;
    }

    public HomePage enterSearchTerm(String search) {
        searchField.sendKeys(search);
   //     driver.findElement(searchField).sendKeys(search);
        return this;
    }

    public SearchPage clickOnSearchButton() {
        searchButton.click();
  //      driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }

}
