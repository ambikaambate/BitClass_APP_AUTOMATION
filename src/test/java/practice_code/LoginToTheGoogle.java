package practice_code;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginToTheGoogle {
    @Test
    public static void loginWithMail() throws MalformedURLException, InterruptedException {

        File appDir = new File("resources");
        File app = new File(appDir, "base.apk");
        //File OfferUp = new File("./src/main/resources/base.apk");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Android Emulator");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
         dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        dc.setCapability("app", app.getAbsolutePath());
        dc.setCapability("no",true);
        dc.setCapability("appPackage", "com.bitclass.android");
      dc.setCapability("appActivity", "com.bitclass.android.home.HomePageActivity");
        AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://169.254.58.17:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
}
//./src/test/resources/testData.xlsx