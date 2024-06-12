package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TC_02 extends BaseClass{

    @Test
    public void test() throws InterruptedException {
        System.out.println("App launch");
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        Utils.scrollToTextClick(driver,"Cuba");
    }
}
