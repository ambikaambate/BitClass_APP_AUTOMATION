package SearchPageActions;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchingKey extends BaseTest {
    @Test
    public void searchingFreeClasses() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/imgBtnSearch")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("Search for live classes & more...")).click();
        driver.getKeyboard().sendKeys("dance course");
        Thread.sleep(1000);
    }
}
