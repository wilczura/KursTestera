package pageobjects;

import static drivers.DriverFactory.driver;
import static org.junit.Assert.assertTrue;
import static selectors.ShopsSelectors.CartPageSelectors.*;
import static strings.ShopStrings.CartPageStrings.*;

public class CartPage {
    public static void assertCartItem() {
        assertTrue(driver.findElement(PRODUCT_CART_LINK_SELECTOR).isDisplayed());
        if (driver.findElement(PRODUCT_CART_LINK_SELECTOR).isDisplayed()) {
            System.out.println("Nazwa produktu: " + PRODUCT_NAME_STRING);
        }
    }

}
