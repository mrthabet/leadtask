package leadtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Locators
    By addToCartButton = By.id("a-autoid-4-announce");
    By cartTotalPrice = By.id("cartTotalPrice");
    By discountCodeField = By.id("discountCodeField");
    By applyDiscountButton = By.id("applyDiscountButton");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void addItemToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getTotalPrice() {
        return driver.findElement(cartTotalPrice).getText();
    }

    
}
