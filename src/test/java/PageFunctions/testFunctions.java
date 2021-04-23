package PageFunctions;

import LocatorFactory.locators;
import Utilities.CommonMethods;
import Utilities.ConfigurationReader;
import org.testng.Assert;

public class testFunctions extends BasePage{
    locators l = new locators();
    String price = "";
    String checkoutPrice = "";

    public  void searchItem() {
        l.searchDropdown.click();
        CommonMethods.waitUntilElementIsClickable(l.searchBook);
        l.searchBook.click();
        l.searchBox.click();
        l.searchBoxText.sendKeys(ConfigurationReader.getProperty("item"));
        l.searchIcon.click();
        CommonMethods.waitUntilElementIsClickable(l.productB);
        l.productB.click();
        String price = l.itemPrice.getText();
        System.out.println("Price is " + price);
        System.out.println("This is the item I want to buy");
    }

    public  void addItemToCart() {
        if (l.addToCart.isDisplayed()) {
            l.addToCart.click();
        } else if (l.oneTimePurchase.isDisplayed()) {
            l.oneTimePurchase.click();
            CommonMethods.waitElementClickable(l.addToCart);
            l.addToCart.click();
        }
        String checkoutPrice = l.itemPriceCheckOut.getText();
        System.out.println("Price at the checkout is " + checkoutPrice);
        Assert.assertEquals(l.addedConfirmText.getText(), "Added to Cart");
        System.out.println("Item added to shopping cart");
    }

    public  void checkOut() {
        CommonMethods.waitElementClickable(l.proceedCheckout);
        l.proceedCheckout.click();
        Assert.assertEquals(price, checkoutPrice, "Price not the same");
        CommonMethods.waitUntilElementIsVisible(l.signIn);
        System.out.println("You have to login for buy the item");
    }
}
