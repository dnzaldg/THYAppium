package com.testinium.base;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AppiumDriver appiumDriver;
    public static WebDriverWait wait;

    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.turkishairlines.mobile");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.turkishairlines.mobile.ui.ACSplash");
        desiredCapabilities.setCapability("autoGrantPermissions", true);
        desiredCapabilities.setCapability("autoDismissAlerts", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AndroidDriver(url, desiredCapabilities);
        wait=new WebDriverWait(appiumDriver,30);
    }

    @AfterSuite
    public void closeDriver(){
        appiumDriver.quit();
    }
}
