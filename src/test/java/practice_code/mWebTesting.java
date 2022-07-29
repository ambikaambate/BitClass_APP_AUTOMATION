package practice_code;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mWebTesting {
    AndroidDriver<MobileElement> driver;

    @Test
    public void loginAppWithNo() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        // Common DC (Android or IOS)
        dc.setCapability("deviceName", "DEVICE_NAME");
        dc.setCapability("automationName", "appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("UDID", "emulator-5554");
        dc.setCapability("resetKeyboard", true);
        dc.setCapability("no", true);
        dc.setCapability("browserName", "Chrome");

        //DC for Android
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://staging-next.bitclassdev.com/");
        driver.findElement(By.xpath("//button[text()='login']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8875847584", Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1971",Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ambika",Keys.ENTER);
    }
}