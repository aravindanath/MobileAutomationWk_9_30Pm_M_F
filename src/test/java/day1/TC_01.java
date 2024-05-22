package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_01 extends BaseClass{

    @Test
    public void test(){
        System.out.println("App launch");
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
    }
}
