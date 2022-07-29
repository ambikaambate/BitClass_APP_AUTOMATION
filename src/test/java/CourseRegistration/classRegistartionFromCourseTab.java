package CourseRegistration;

import GenericUtility.BaseTest;
import LoginActions.LoginWithExstingNoFromProfile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class classRegistartionFromCourseTab extends BaseTest {
    @Test
    public void courseRegistartion() throws InterruptedException {
        LoginWithExstingNoFromProfile login = new LoginWithExstingNoFromProfile();
        login.loginToTheApp();
        Thread.sleep(500);
        driver.findElement(By.id("com.bitclass.android:id/full_courses")).click();
        Thread.sleep(20000);
        driver.findElementByAccessibilityId("Join for ₹ 1499.0 /-").click();
    }
}
