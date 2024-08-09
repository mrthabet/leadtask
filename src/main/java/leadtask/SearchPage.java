package leadtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait with a 10-second timeout
    }

    // Methods to interact with elements
    public void enterSearchKeyword(String keyword) {
        WebElement searchBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        searchBoxElement.sendKeys(keyword);
    }

    public void clickSearchButton() {
        WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButtonElement.click();
    }

	public void selectCategory(String string) {
		// TODO Auto-generated method stub
		 WebElement categoryDropdownElement = driver.findElement(By.id("nav-flyout-anchor")); // استبدل 'categoryDropdownId' بـ ID القائمة المنسدلة للفئات
		    categoryDropdownElement.click(); // فتح القائمة المنسدلة
		
	}

	public void applyFilter(String string) {
		// TODO Auto-generated method stub
		
	}

	public void sortBy(String string) {
		// TODO Auto-generated method stub
		
	}
}
