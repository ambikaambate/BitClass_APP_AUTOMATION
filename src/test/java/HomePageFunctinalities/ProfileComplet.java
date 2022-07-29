package HomePageFunctinalities;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class ProfileComplet extends BaseTest {
    @Test
    public void profileCompletion() throws InterruptedException {
        Thread.sleep(10000);
        MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
        driver.findElementByAccessibilityId("Complete Profile").click();
    }
}
