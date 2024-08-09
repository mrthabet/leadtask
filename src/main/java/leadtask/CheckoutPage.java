package leadtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    // Locators
    By shippingOption = By.id("shippingOption");
    By paymentMethod = By.id("paymentMethod");
    By placeOrderButton = By.id("placeOrderButton");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void selectShippingOption(String option) {
        driver.findElement(shippingOption).sendKeys(option);
    }

    public void selectPaymentMethod(String method) {
        driver.findElement(paymentMethod).sendKeys(method);
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }
}