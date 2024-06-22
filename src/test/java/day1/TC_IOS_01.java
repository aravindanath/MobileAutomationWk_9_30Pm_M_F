package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_IOS_01 extends  BaseClass_ioS {

    @Test
    public void test() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElementByIosNsPredicate("name == \"UIKitCatalog\" AND label == \"UIKitCatalog\" AND type == \"XCUIElementTypeButton\"").click();
        Thread.sleep(2000);
        driver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`name == \"Views\"`]").click();
        Thread.sleep(2000);
        driver.findElementByIosNsPredicate("name == \"Alert Controllers\" AND label == \"Alert Controllers\" AND value == \"Alert Controllers\"").click();

        driver.findElementByAccessibilityId("Three Buttons").click();

        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Choice One\"]\n")).click();
        Thread.sleep(2000);
        driver.findElementByIosNsPredicate("name == \"UIKitCatalog\" AND label == \"UIKitCatalog\" AND type == \"XCUIElementTypeButton\"").click();
        Thread.sleep(2000);
        driver.findElementByIosNsPredicate("name == \"Pickers\" AND label == \"Pickers\" AND value == \"Pickers\"").click();
        Thread.sleep(2000);
        driver.findElementByIosNsPredicate("name == \"Picker View\" AND label == \"Picker View\" AND value == \"Picker View\"").click();
        Thread.sleep(3000);

        driver.findElementByIosNsPredicate("name == \"Red color component value\"").sendKeys("180");
        Thread.sleep(3000);
        driver.findElementByIosNsPredicate("name == \"Green color component value\"").sendKeys("255");
        Thread.sleep(3000);
        driver.findElementByIosNsPredicate("name == \"Blue color component value\"").sendKeys("200");
        Thread.sleep(3000);

    }
}
