package practice_code;

import GenericUtility.IAutoConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginWithGmailExstingMail implements IAutoConstants {
    AndroidDriver<MobileElement> driver;

    @Test
    public void GmailLogin() throws InterruptedException, MalformedURLException {
        File f = new File("/Users/ankushkumar/Downloads/apk's for android testng/base.apk");
        DesiredCapabilities dc = new DesiredCapabilities();
        // Common DC (Android or IOS)
        dc.setCapability("deviceName", "DEVICE_NAME");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        dc.setCapability("app", f.getAbsolutePath());
        //Install app in Phone IOS and Android
        //	dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\Touch Screen Test_v1.7.14_apkpure.com.apk");

        dc.setCapability("appPackage", "com.bitclass.android");
        dc.setCapability("appActivity", "com.bitclass.android.home.HomePageActivity");
        //DC for Android
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button"))).click();
        Thread.sleep(2000);
        MobileElement element = driver.findElement(By.className("android.widget.Button"));
        driver.getKeyboard().sendKeys(Keys.ENTER);
        element.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView"))).click();
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        for (int i = 0; i <= 2; i++) {
            drawer.click();
            Thread.sleep(6000);
        }
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google']")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.LinearLayout")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(20000);

    }

}