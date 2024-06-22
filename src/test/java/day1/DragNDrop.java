package day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DragNDrop {

   protected AndroidDriver driver;


    @Test
    public void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Mytest");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.wdiodemoapp");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.wdiodemoapp.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "/Users/aravindanathdm/.appium/node_modules/appium-chromium-driver/node_modules/appium-chromedriver/chromedriver/mac/chromedriver-mac-arm64_v124.0.6367.201");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Drag\"]")).click();

      WebElement e1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"drag-c1\"]/android.widget.ImageView"));
        WebElement e2 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"drop-c1\"]/android.view.ViewGroup"));

        Utils.dragNDrop(driver, e1, e2);

    }
}
