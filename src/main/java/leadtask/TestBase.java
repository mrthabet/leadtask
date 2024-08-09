package leadtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver, ChromeDriver for example
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         //driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
    }

    @AfterMethod
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}