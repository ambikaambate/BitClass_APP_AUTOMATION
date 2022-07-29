package CourseRegistration;

import GenericUtility.BaseTest;
import LoginActions.LoginWithExstingNoFromProfile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fullCourseRegistration extends BaseTest {
    @Test
    public void registartion() throws InterruptedException {
       LoginWithExstingNoFromProfile login = new LoginWithExstingNoFromProfile();
       login.loginToTheApp();
       Thread.sleep(10000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100)"));
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Join for ₹ 1499.0 /-").click();
        Thread.sleep(10000);
        driver.findElementByLinkText("Apply Coupon").click();
        Thread.sleep(10000);
        driver.findElement(By.name("Enter Coupon Code")).sendKeys("counpon code");
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Apply Coupon").click();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Register for ₹1499").click();
    }
}
