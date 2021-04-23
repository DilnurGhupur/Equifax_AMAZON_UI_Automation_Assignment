package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class CommonMethods{
    public static WebDriver driver = DriverFactory.getDriver();
    public static Wait<WebDriver> wait;

    public static Wait<WebDriver> WebDriverWait(Integer value) {
        wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(value))
                .pollingEvery(Duration.ofMillis(5)).ignoring(WebDriverException.class);
        return wait;
    }

    public static void waitUntilElementIsVisible(WebElement element, Integer... time) {
        int value = 0;
        if (time.length == 0) {
            value = 30;
        } else {
            value = time[0];
        }
        wait = WebDriverWait(value);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element, Integer... time) {
        int value = 0;
        if (time.length == 0) {
            value = 30;
        } else {
            value = time[0];
        }
        wait = WebDriverWait(value);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementClickable(WebElement element) {
        wait = WebDriverWait(30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getElementText(WebElement element) {
        wait = WebDriverWait(30);
        wait.until(ExpectedConditions.invisibilityOfAllElements(element));
        return element.getText();
    }

    public static void clickWithJS(WebElement element) {
        waitUntilElementIsVisible(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}


