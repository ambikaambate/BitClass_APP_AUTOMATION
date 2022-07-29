package CourseRegistration;

import GenericUtility.BaseTest;
import LoginActions.LoginWithExstingNoFromProfile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class freeCourseRegistration extends BaseTest {
        @Test
        public void freeClassRegistration() throws InterruptedException {
             LoginWithExstingNoFromProfile login = new LoginWithExstingNoFromProfile();
            login.loginToTheApp();
            Thread.sleep(15000);
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000000)"));
            Thread.sleep(10000);
            driver.findElement(By.xpath("(//android.view.View[@content-desc='Register for FREE'])[1]")).click();
            Thread.sleep(20000);
            driver.findElementByAccessibilityId("Register For Free").click();////android.widget.Button[@content-desc="Register For Free"]
            Thread.sleep(10000);
            driver.findElementByAccessibilityId("Done").click();
        }

    }

// LoginWithExstingNoFromProfile login = new LoginWithExstingNoFromProfile() ;
//login.loginToTheApp();
//  Thread.sleep(5000);
//  driver.findElement(MobileBy.AndroidUIAutomator(
//        "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000000)"));
          /*  MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                            ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));*/