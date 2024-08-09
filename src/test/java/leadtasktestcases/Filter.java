package leadtasktestcases;

import org.testng.annotations.Test;

import leadtask.SearchPage;
import leadtask.TestBase;

public class Filter extends TestBase {

    @Test
    public void testSearchByCategory() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectCategory("Electronics");
        searchPage.clickSearchButton();
        // Assert results here
    }

    @Test
    public void testSearchByKeyword() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.enterSearchKeyword("Laptop");
        searchPage.clickSearchButton();
        // Assert results here
    }

   // @Test
    public void testFilterAndSort() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.applyFilter("Price: Low to High");
        searchPage.sortBy("Best Sellers");
        // Assert results here
    }
}
