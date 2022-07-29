package CategoryTabs;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CategoryClicking extends BaseTest {
    @Test
    public void clickingOnCatagoryTabs() throws InterruptedException {
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google']")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.LinearLayout")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Cooking & Baking']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Dance Form']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Music']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Personal Development']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='DIY Craft']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Career & Business']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Sketching & Painting']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Languages']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Spiritual Healing']")).click();
        Thread.sleep(10000);

    }

}
