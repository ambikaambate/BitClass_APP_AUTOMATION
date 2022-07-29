package LoginActions;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginFromSideNavBarWithNewUserGmail extends BaseTest {
    @Test
    public void GmailLoginToApp() throws InterruptedException {
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        drawer.click();
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("Navigation header").click();
        Thread.sleep(20000);
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google']")).click();
        Thread.sleep(35000);
        driver.findElement(By.className("android.widget.EditText")).click();
        driver.getKeyboard().sendKeys("ambikaambate96@gmail.com");
        Thread.sleep(20000);
        driver.getKeyboard().sendKeys("ambikasaggam@96");
        Thread.sleep(20000);
        driver.getKeyboard().sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.id("signinconsentNext")).click();
        Thread.sleep(10000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(10000);

    }
}
