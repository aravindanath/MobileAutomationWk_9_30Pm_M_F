package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TC_01 extends BaseClass{

    @Test
    public void test() throws InterruptedException {
        System.out.println("App launch");
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        List<WebElement> countryList = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
        for(WebElement country : countryList){
            System.out.println(country.getText());
            if(country.getText().equals("Antarctica")){
                country.click();
                break;
            }
        }

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arvind");

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        List<WebElement> addCart = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart"));

        for(WebElement addCarts : addCart){
            addCarts.click();
        }


        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")).click();

        driver.findElement(By.className("android.widget.CheckBox")).click();

      WebElement terms =   driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));

      Utils.longPress(driver,terms);

     WebElement cls =  driver.findElement(By.xpath("//*[@text='CLOSE']"));

     Utils.tap(driver,cls);

     driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

     Thread.sleep(2000);
        Set<String> cont =  driver.getContextHandles();

        for(String co : cont){
            driver.context(co);
        }

        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Appium jobs", Keys.ENTER);

    }
}
