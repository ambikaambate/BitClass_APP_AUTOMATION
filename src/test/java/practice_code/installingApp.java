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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class installingApp implements IAutoConstants {
    AndroidDriver<MobileElement> driver;

    @Test
    public void LoginToTheApplication() throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        // Common DC (Android or IOS)

        dc.setCapability("deviceName", "Android Emulator");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        // dc.setCapability("noReset", true);

        //Install app in Phone IOS and Android
        //	dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\Touch Screen Test_v1.7.14_apkpure.com.apk");
        dc.setCapability("appPackage", "com.bitclass.android");
        dc.setCapability("appActivity", "com.bitclass.android.home.HomePageActivity");
        //DC for Android
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button"))).click();
        Thread.sleep(2000);
        MobileElement element = driver.findElement(By.className("android.widget.Button"));
        driver.getKeyboard().sendKeys(Keys.ENTER);
        element.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView"))).click();
        Thread.sleep(2000);
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        for (int i = 0; i <= 2; i++) {
            drawer.click();
            Thread.sleep(5000);
        }
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(8000);
        MobileElement NoTextField = driver.findElement(By.className("android.widget.EditText"));
        NoTextField.click();
        Thread.sleep(5000);
        //NoTextField.sendKeys("9876654329");
        driver.getKeyboard().sendKeys("9857483958");
        Thread.sleep(5000);
       driver.findElementByAccessibilityId("Continue").click();
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     // WebElement optTextField =  driver.findElement(By.className("android.view.View"));
       MobileElement otptextfield = driver.findElement(By.className("android.view.View"));
        //Thread.sleep(5000);
       if (otptextfield.isDisplayed()){
          // Thread.sleep(5000);
           otptextfield.click();
           Thread.sleep(5000);
           driver.getKeyboard().sendKeys("2134");

       }

        // Thread.sleep(5000);
        //insertTextElement.sendKeys("2139");

    }
}

 /*WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button"))).click();
        MobileElement buttonBegin = driver.findElement(By.className("android.widget.Button"));
        TouchAction action = new TouchAction( driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(buttonBegin))).perform();*/

// driver.findElement(By.className("android.widget.EditText")).sendKeys("3333339867");
// MobileElement element1 = (MobileElement) driver.findElement(By.className("android.widget.Button"));
//element1.click();