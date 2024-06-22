package day1;

import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OTPReading  extends BaseClass{


    @Test
    public void otpRead() throws InterruptedException {

        Thread.sleep(3000);

        driver.openNotifications();
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/conversation_text")).click();

        String msg = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.google.android.apps.messaging:id/message_text'])[last()]")).getText();
        System.err.println(msg);
        String x =  Utils.getOTP(msg);

        Thread.sleep(2000);

        driver.startActivity(new Activity("com.androidsample.generalstore","com.androidsample.generalstore.SplashActivity"));
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys(x);
    }





}

