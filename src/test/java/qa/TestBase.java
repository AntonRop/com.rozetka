package qa;

import manager.AppManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class TestBase {

    private final AppManager appManager = new AppManager(BrowserType.FIREFOX);




    @BeforeClass(alwaysRun = true)

    public void setUp()  {
        appManager.init();
    }

   @AfterMethod(alwaysRun = true)
   public void removeAllCookies(){
        appManager.clearCookies();
   }


    @AfterClass(alwaysRun = true)
    public void tearDown()  {
        appManager.stop();
    }


}
