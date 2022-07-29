package QuickBits;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class quickBitShare extends BaseTest {
    @Test
    public void clickingOnQuickBits() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Share'])[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("android:id/drag")).click();
        Thread.sleep(10000);
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click();

    }
}