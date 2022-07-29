package HomePageFunctinalities;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClikingTABsFromHomePage extends BaseTest {  //Class, course, quick bits, myclasses
    @Test
    public void clickingTabs() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/free_courses")).click();
        Thread.sleep(20000);
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(20000);
        driver.findElement(By.id("com.bitclass.android:id/full_courses")).click();
        Thread.sleep(20000);
        driver.findElement(By.id("com.bitclass.android:id/navigation_home")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google']")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.LinearLayout")).click();
        Thread.sleep(20000);
    }
}
