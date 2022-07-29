package LoginActions;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginWithOldUserFromNavBar extends BaseTest {
    @Test
    public void loginTOTheApp() throws InterruptedException {
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        drawer.click();
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("Navigation header").click();
        Thread.sleep(20000);
        MobileElement NoTextField = driver.findElement(By.className("android.widget.EditText"));
        NoTextField.click();
        Thread.sleep(5000);
        //NoTextField.sendKeys("9876654329");
        driver.getKeyboard().sendKeys("3333335658");
        Thread.sleep(2000);
        driver.getKeyboard().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElementByAccessibilityId("Continue").click();
        Thread.sleep(1000);
//        Thread.sleep(1000);
        driver.getKeyboard().sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.getKeyboard().sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.getKeyboard().sendKeys("2139");
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Verify and Proceed").click();
        Thread.sleep(20000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(1000);
    }
}

