package testamazon;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class TestAmazonHome extends CommonAPI {

    @Test
    public void testSearchBar(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("alcohol wipes", Keys.ENTER);
    }

    @Test
    public void testHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }
}
