package com.appium.calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class sum {

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName","Android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity",".Calculator");

        AndroidDriver<AndroidElement>  driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el5.click();

        Assert.assertEquals(driver.findElementById("com.android.calculator2:id/eq").getText(),10);

    }
}
