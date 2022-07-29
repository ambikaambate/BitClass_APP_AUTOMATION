package QuickBits;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class clickOnQuickBits extends BaseTest {
    @Test
    public void clickingOnQuickBits() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cooking and Baking: Bake the world a butter place!\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View")).click();
        Thread.sleep(20000);
      /*  driver.findElement(By.className("android.view.View")).click(); //click on screen
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("More Chapters").click(); //click on more chapter
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("More like this").click(); //click on more like this
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.ImageView")).click(); // click on chapter from more like this
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("Checkout Upcoming Batch").click(); // checkout Upcoming batch
        Thread.sleep(20000);*/
    }
}
