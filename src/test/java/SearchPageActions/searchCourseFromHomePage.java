package SearchPageActions;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class searchCourseFromHomePage extends BaseTest {
    @Test
    public void RegisterCourseFromSearchBar() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/imgBtnSearch")).click();
        //Thread.sleep(20000);
        //driver.findElement(By.name("Search for live classes & more...")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Spiritual Healing\"]\n")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Register for FREE\"])[1]")).click();
        Thread.sleep(10000);
    }

}
