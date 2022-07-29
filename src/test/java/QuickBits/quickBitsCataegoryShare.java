package QuickBits;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class quickBitsCataegoryShare extends BaseTest {
    @Test
    public void clickingOnQuickBitCategotyCard() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("DIY Craft").click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.view.View")).click();
    }
}
