package Tests;

import LocatorFactory.locators;
import PageFunctions.testFunctions;
import Utilities.CommonMethods;
import Utilities.DriverFactory;
import Utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testRun extends TestBase {
    locators lr = new locators();
    testFunctions tf = new testFunctions();

    @Test(priority = 1)
    public void amazonTest() {
        PageFactory.initElements(DriverFactory.getDriver(), locators.class);
        CommonMethods.waitUntilElementIsVisible(lr.logo);
        tf.searchItem();
        tf.addItemToCart();
        tf.checkOut();
    }
}