package LoginActions;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginWithNewUserNoFromProfile extends BaseTest {
    @Test
    public void loginToTheApp() throws InterruptedException {
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(8000);
        MobileElement NoTextField = driver.findElement(By.className("android.widget.EditText"));
        NoTextField.click();
        Thread.sleep(5000);
        //NoTextField.sendKeys("9876654329");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.getKeyboard().sendKeys("3333336" + randomInt);
       // driver.getKeyboard().sendKeys("3333336749");
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Continue").click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.getKeyboard().sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.getKeyboard().sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.getKeyboard().sendKeys("2139");
        driver.findElementByAccessibilityId("Verify and Proceed").click();
        Thread.sleep(5000);
        driver.findElement(By.className("android.widget.EditText")).click();
        Thread.sleep(1000);
        driver.getKeyboard().sendKeys("ambika");
        Thread.sleep(5000);
        driver.getKeyboard().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElementByAccessibilityId("Continue").click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(1000);
    }
}
