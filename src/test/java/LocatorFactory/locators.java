package LocatorFactory;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageFunctions.BasePage;
public class locators extends BasePage{
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public WebElement logo;
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement searchDropdown;
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;
    @FindBy(xpath = "//select[@id='searchDropdownBox']/option[contains(text(),'Books')][2]")
    public WebElement searchBook;
    @FindBy(xpath = "//div[@class='nav-search-field ']/input")
    public WebElement searchBoxText;
    @FindBy(id = "nav-search-submit-text")
    public WebElement searchIcon;
    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public List<WebElement> products;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement product;
    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-fixed-height']")
    public List<WebElement> productsB;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    public WebElement productB;
    @FindBy(id = "newBuyBoxPrice")
    public WebElement itemPrice;
    @FindBy(xpath = "//div[@id='hlb-subcart']//span/span[2]")
    public WebElement itemPriceCheckOut;
    @FindBy(xpath = "//span[@id='submit.add-to-cart']")
    public WebElement addToCart;
    @FindBy(id = "buyNew_cbb")
    public WebElement oneTimePurchase;
    @FindBy(id = "huc-v2-order-row-confirm-text")
    public WebElement addedConfirmText;
    @FindBy(id = "hlb-ptc-btn-native")
    public WebElement proceedCheckout;
    @FindBy(xpath = "//h1[@class='a-spacing-small']")
    public WebElement signIn;
}
