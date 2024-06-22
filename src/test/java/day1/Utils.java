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

    public static  void scrollToText(AndroidDriver driver, String text){
        String textPath ="new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(textPath);

    }
    public static  void scrollToTextClick(AndroidDriver driver, String text){
        String textPath ="new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(textPath).click();

    }


    public static String getOTP(String msg){
        String otp = null;
        System.out.println(msg);
        for(String x : msg.split(" ")){
            if(x.matches("\\d{6}")){
                System.out.println(x);
                otp =x;
            }else if(x.matches("\\d{4}")){
                System.out.println(x);
                otp =x;
            }else {
                System.out.println("Wrong OTP");
                System.out.println(x);
            }
        }
        return otp;
    }

}
