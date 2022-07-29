package CourseRegistration;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClassRegistartionFromClassTab extends BaseTest {
    @Test
    public void classRegistartion() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("com.bitclass.android:id/free_courses")).click();
        Thread.sleep(20000);
        MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Register for FREE\"])[1]")).click();
        Thread.sleep(10000);

    }
}
