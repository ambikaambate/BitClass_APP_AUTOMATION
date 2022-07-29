package SearchPageActions;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class searchPage extends BaseTest {
    @Test
    public void searchingCourses() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/imgBtnSearch")).click();
        //Thread.sleep(20000);
        //driver.findElement(By.name("Search for live classes & more...")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Spiritual Healing\"]\n")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Course']")).click();
        Thread.sleep(10000);
        // driver.findElement(By.xpath("//android.view.View[@content-desc='Recordings']")).click();
        driver.findElementByAccessibilityId("Filter").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Spiritual Healing").click();
        Thread.sleep(10000);
    }
}
