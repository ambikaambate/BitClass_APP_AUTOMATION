package HomePageFunctinalities;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClikcingOnHomeBurgerMenu extends BaseTest {
    @Test
    public void clickingOnMenuBar(){
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
        driver.findElement(By.name("Search")).click();
    }

}
