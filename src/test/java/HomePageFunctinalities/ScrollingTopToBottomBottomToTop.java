package HomePageFunctinalities;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class ScrollingTopToBottomBottomToTop extends BaseTest {
    @Test
    public void scrolling() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000000)"));
        Thread.sleep(10000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000000)"));
        Thread.sleep(20000);
        driver.findElement(MobileBy.AndroidUIAutomator(
             "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000000)"));

    }
}
  /* MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
       Thread.sleep(10000);
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));*/


// driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000000)"));