package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.CategoryPage;
import pageobjects.ProductPage;
import pageobjects.ShopHomePage;

public class TestCase001 {
    @Given("I open shop website")
    public void iOpenShopWebsite() {
        ShopHomePage.openShopHomePage();
    }

    @When("I open first category")
    public void iOpenFirstCategory() {
        ShopHomePage.openCategory(1);
    }

    @And("I choose second product")
    public void iChooseSecondProduct() {
        CategoryPage.chooseProduct(2);
    }

    @And("I click Add to cart button")
    public void iClickAddToCartButton() {
        ProductPage.addToCart();
    }

    @And("I click check cart")
    public void iClickCheckCart() {
        ProductPage.checkCart();
    }

    @Then("I see my product in cart")
    public void iSeeMyProductInCart() {
        CartPage.assertCartItem();
    }
}
