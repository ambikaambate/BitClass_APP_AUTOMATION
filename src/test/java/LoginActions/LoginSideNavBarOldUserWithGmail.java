package LoginActions;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginSideNavBarOldUserWithGmail extends BaseTest {
    @Test
    public void loginWithGmail() throws InterruptedException {
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        drawer.click();
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("Navigation header").click();
        Thread.sleep(20000);
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google']")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.LinearLayout")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(1000);
    }
}
