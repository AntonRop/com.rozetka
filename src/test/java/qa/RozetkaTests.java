package qa;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RozetkaTests extends TestBase {
    protected WebDriver driver;


    @DataProvider(name="search")
    public static Iterator<Object[]> searchTerm(){
        List<Object[]> list=new ArrayList<>();
        list.add(new Object []{"https://rozetka.com.ua/","sony"});
        list.add(new Object []{"https://rozetka.com.ua/","panasonic"});
        list.add(new Object[]{"https://rozetka.com.ua/","nike"});
        return list.iterator();
    }

    @Test(dataProvider="search")
    public void searchProduct(String url, String searchTerm) throws Exception {

        SearchPage searchPage = new HomePage(driver).open(url)
                .clickOnSearchField()
                .enterSearchTerm(searchTerm)
                .clickOnSearchButton();
        Assert.assertTrue(searchPage.isItemFound());
    }

}

