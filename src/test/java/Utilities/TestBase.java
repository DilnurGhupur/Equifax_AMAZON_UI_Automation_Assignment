package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

    @BeforeClass
    public static void setup() {

        DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @AfterClass
    public static void teardown() {
        DriverFactory.closeDriver();
    }
}
