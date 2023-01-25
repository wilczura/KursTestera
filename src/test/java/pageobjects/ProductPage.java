package pageobjects;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.ShopsSelectors.ProductPageSelectors.*;

public class ProductPage {
    public static void addToCart(){
        assertTrue(driver.findElement(ADD_TO_CART_SELECTOR).isDisplayed());
        click(ADD_TO_CART_SELECTOR);
    }
    public static void checkCart(){
        String CART_URL = getHref(CHECK_CART_SELECTOR);
        driver.get(CART_URL);
        assertEquals(CART_URL, driver.getCurrentUrl());
    }



}
