package QuickBits;

import GenericUtility.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class QuickBitsFromHomePage extends BaseTest {
    @Test
    public void clickingOnquickBtsFromHomePage(){

        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Quick Bits\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View")).click();
    }
}
