package day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass_ioS {

   protected IOSDriver driver;


    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 15 Pro Max");
        caps.setCapability(MobileCapabilityType.UDID,"2CF7F045-ADC4-4F30-9530-E9E0ABE2D426");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"17.5");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.ziess.demo.171");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

    }
}
