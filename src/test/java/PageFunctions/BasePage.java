package PageFunctions;

import org.openqa.selenium.support.PageFactory;
import Utilities.DriverFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
