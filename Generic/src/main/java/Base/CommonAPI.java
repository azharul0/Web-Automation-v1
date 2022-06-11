package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void Browser(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/azharul/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
