package day1;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Utils {

    public static void longPress(WebDriver driver, WebElement element){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
       action.longPress(ElementOption.element(element)).release().perform();
    }

    // This method workslike click
    public static void tap(WebDriver driver, WebElement element){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.tap(ElementOption.element(element)).release().perform();
    }
}
