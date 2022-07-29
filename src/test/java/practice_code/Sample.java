package practice_code;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sample {
    AndroidDriver<MobileElement> driver;
    @Test
    public void CalculatorApp() throws MalformedURLException {

        File f = new File("/Users/ankushkumar/Downloads/apk's for android testng/base.apk");

        DesiredCapabilities dc = new DesiredCapabilities();
        // Common DC (Android or IOS)
        dc.setCapability("deviceName", "DEVICE_NAME");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        dc.setCapability("app" ,f.getAbsolutePath());
        //Install app in Phone IOS and Android
        //	dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\Touch Screen Test_v1.7.14_apkpure.com.apk");

        dc.setCapability("appPackage", "com.bitclass.android");
        dc.setCapability("appActivity", "com.bitclass.android.home.HomePageActivity");
        //DC for Android
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AndroidDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
       // driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
        //driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
        //driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
        
    }
}
