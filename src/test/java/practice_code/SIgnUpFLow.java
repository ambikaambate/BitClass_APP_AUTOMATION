package practice_code;

import GenericUtility.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SIgnUpFLow extends BaseTest {
    @Test
    public static void signUpAuthflow() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button"))).click();
        Thread.sleep(2000);
        MobileElement element =  driver.findElement(By.className("android.widget.Button"));
        driver.getKeyboard().sendKeys(Keys.ENTER);
        element.click();
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView"))).click();
        MobileElement drawer = driver.findElementByAccessibilityId("Open navigation drawer");
        for(int i=0; i<=2; i++){
            drawer.click();
        }
        Thread.sleep(5000);
        MobileElement profile = driver.findElement(By.id("com.bitclass.android:id/profileBtn"));
        profile.click();
        Thread.sleep(4000);
        MobileElement noTextFiled = driver.findElementByClassName("android.widget.EditText");//(By.className("android.widget.EditText"));
        noTextFiled.click();
        // Thread.sleep(3000);
        driver.getKeyboard().sendKeys("3948594859");
        Thread.sleep(2000);
    }
}

