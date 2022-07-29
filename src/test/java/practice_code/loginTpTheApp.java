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

public class loginTpTheApp implements IAutoConstants {
    AndroidDriver<MobileElement> driver;
    @Test
    public void loginAppWithNo() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        // Common DC (Android or IOS)
        dc.setCapability("deviceName", "Android Emulator");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        dc.setCapability("resetKeyboard", true);
        dc.setCapability("noReset",true);
        dc.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        //Install app in Phone IOS and Android
        //	dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\Touch Screen Test_v1.7.14_apkpure.com.apk");

        dc.setCapability("appPackage", "com.bitclass.android");
        dc.setCapability("appActivity", "com.bitclass.android.home.HomePageActivity");
        //DC for Android
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button"))).click();
        Thread.sleep(2000);
       MobileElement element =  driver.findElement(By.className("android.widget.Button"));
       driver.getKeyboard().sendKeys(Keys.ENTER);
        element.click();
        WebDriverWait wait1 = new WebDriverWait(driver,30);
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView"))).click();
       Thread.sleep(2000);
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        for(int i=0; i<=2; i++){
            drawer.click();
        }
        Thread.sleep(5000);
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       Thread.sleep(5000);
       MobileElement NoTextField =  driver.findElement(By.className("android.widget.EditText"));
        NoTextField.click();
       Thread.sleep(5000);
        driver.getKeyboard().sendKeys("3"+"9"+"4"+"8"+"5"+"9"+"4"+"8"+"5"+"9");
        Thread.sleep(2000);
       driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(1000);
        WebDriverWait wait2 = new WebDriverWait(driver,30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View"))).sendKeys("2139");
       //MobileElement optTextfield= driver.findElement(By.className("android.view.View"));
        //optTextfield.click();
      //  optTextfield.sendKeys("2139");
       // Thread.sleep(4000);
        //driver.findElement(By.className("android.widget.EditText")).sendKeys("ambika");
        //Thread.sleep(4000);
        //driver.findElement(By.className("android.widget.Button")).click();
    }
}
//  MobileElement loginButton = driver.findElement(By.className("android.widget.TextView"));
//loginButton.click();
//  MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
//  noTextFiled.sendKeys(Keys.ARROW_DOWN);
//Thread.sleep(3000);
//noTextFiled.sendKeys(Keys.ARROW_DOWN);
//Thread.sleep(3000);
//noTextFiled.sendKeys(Keys.ENTER);