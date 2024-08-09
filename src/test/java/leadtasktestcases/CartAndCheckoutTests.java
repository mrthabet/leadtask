package leadtasktestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import leadtask.CartPage;
import leadtask.CheckoutPage;
import leadtask.TestBase;

public class CartAndCheckoutTests extends TestBase {

    @Test
    public void addItemToCart1() {
        By addToCartButton = null;
		driver.findElement(addToCartButton).click();
}
    public void testAddToCartAndApplyDiscount() {
        CartPage cartPage = new CartPage(driver);
        cartPage.addItemToCart();
       // cartPage.applyDiscountCode("DISCOUNT2024");
        // Assert total price with discount here
    }
        public void addItemToCart() {
            By addToCartButton = null;
			driver.findElement(addToCartButton).click();
    }

    //@Test
    public void testCheckoutProcess() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.selectShippingOption("Express Shipping");
        checkoutPage.selectPaymentMethod("Credit Card");
        checkoutPage.placeOrder();
        // Assert order completion here
    }
}