package HomePageFunctinalities;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class scrollingLeftToRight extends BaseTest {
    @Test
    public void scroolingLeftToRight() throws InterruptedException {
        driver.findElement(By.id("com.bitclass.android:id/quick_bits_tab")).click();
        Thread.sleep(20000);
      MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
       Thread.sleep(10000);
        MobileElement elementq = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
    }
}
