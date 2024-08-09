package leadtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {
    WebDriver driver;

    // Locators
    By filterOption = By.id("searchDropdownBox");
    By applyFilterButton = By.id("nav-search-submit-button"); 
    // Constructor
    public FilterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to apply a filter
    public void applyFilter(String filterName) {
        WebElement filterElement = driver.findElement(By.xpath("//span[text()='" + filterName + "']"));
        filterElement.click();
    }

    // Method to click apply filter button
    public void clickApplyFilterButton() {
        driver.findElement(applyFilterButton).click();
    }
}
