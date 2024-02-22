package starter.stepdefinitions;

import org.junit.Assert;
import starter.PageObjects.AddItemToCart_PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AddItemToCartStepDefinitions {

    private static WebDriver driver;

    private static AddItemToCart_PageObjects pageObject =
            PageFactory.initElements(driver = new ChromeDriver(),
                    AddItemToCart_PageObjects.class);

    //Launching my website for adding item(s) into the cart
    @Given("i am on login page")
    public void i_am_on_login_page() {

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    //Enter my username and password
    @When("i enter {string} as username and {string} as password")
    public void i_enter_as_username_and_as_paasword(String userName, String password) {

        pageObject.user_name.sendKeys(userName);
        pageObject.pass_word.sendKeys(password);
    }
    //Click the login button
    @When("i click login button")
    public void i_click_login_button() {
        pageObject.login.click();
    }
    //When the products/items are displayed I select one and add it to cart
    @Then("i should see Products displayed")
    public void i_should_see_products_displayed() {
        pageObject.item.click();
        pageObject.addToCartButton.click();
    }
    //Opening the cart
    @Then("i navigate to cart")
    public void i_navigate_to_cart() {

        pageObject.cartButton.click();
        pageObject.checkoutButton.click();
    }
    //Capturing the firstname and lastname
    @Then("i enter  {string} as firstname and {string} as last name")
    public void i_enter_as_firstname_and_as_last_name(String firstname, String lastname) {

        pageObject.first_name.sendKeys(firstname);
        pageObject.last_name.sendKeys(lastname);
    }
    //Capturing the zip code
    @Then("i enter {string} as zip code")
    public void i_enter_as_zip_code(String postalCode) {
        pageObject.postal_Code.sendKeys(postalCode);
    }
    //Click the continue button
    @Then("i click the continue button")
    public void i_click_the_continue_button() {
        pageObject.continueButton.click();
    }
    //Asserting my cart item name(extracting the actual item name and compare it with the expected item name)
    @Then("i validate my cart item name {string}")
    public void i_validate_my_cart_item_name(String item_name) {
        Assert.assertEquals(pageObject.iTemName.getText(),item_name);
        pageObject.finishButton.click();
    }
    //Upon clicking the 'Finish' button, I validate the success message displayed.
    @Then("i validate the success message {string}")
    public void i_validate_the_success_message(String successMessage) {
        Assert.assertEquals(pageObject.successText.getText(),successMessage);

    }

}
