package starter.PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//These are my web elements,combined in one class to avoid many page objects classes.
public class AddItemToCart_PageObjects
{

    @FindBy(id ="user-name")
    public
    WebElement user_name;

    @FindBy(id ="password")
    public
    WebElement pass_word;

    @FindBy(id ="login-button")
    public
    WebElement login;
    @FindBy(xpath ="(//div[@class='inventory_item_name '])[1]")
    public
    WebElement item;
    @FindBy(id ="add-to-cart-sauce-labs-backpack")
    public
    WebElement addToCartButton;
    @FindBy(xpath ="(//a[@class='shopping_cart_link']//..)[1]")
    public
    WebElement cartButton;
    @FindBy(xpath ="//button[@id='checkout']")
    public
    WebElement checkoutButton;
    @FindBy(id ="first-name")
    public
    WebElement first_name;
    @FindBy(id ="last-name")
    public
    WebElement last_name;
    @FindBy(id ="postal-code")
    public
    WebElement postal_Code;
    @FindBy(id ="continue")
    public
    WebElement continueButton;
    @FindBy(xpath ="//div[contains(text(),'Sauce Labs Backpack')]")
    public
    WebElement iTemName;
    @FindBy(xpath ="//h2")
    public
    WebElement successText;
    @FindBy(id ="finish")
    public
    WebElement finishButton;
}
