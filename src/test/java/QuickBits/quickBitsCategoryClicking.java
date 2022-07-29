package QuickBits;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class quickBitsCategoryClicking extends BaseTest {
    @Test
    public void clickingOnqQuickBitsCategory() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(15000);
        driver.findElementByAccessibilityId("DIY Craft").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Tech Skill").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Sketching & Painting").click();
        Thread.sleep(10000);
       /* driver.findElementByAccessibilityId("Music").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Languages").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Photography").click();
        Thread.sleep(10000);*/
        driver.findElementByAccessibilityId("Career - Non tech").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Dance Form").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Cooking & Baking").click();
       /* Thread.sleep(10000);
        driver.findElementByAccessibilityId("Money Making").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Health & Fitness").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Career & Business").click();
        Thread.sleep(10000);*/
    }
}
