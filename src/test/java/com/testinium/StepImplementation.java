package com.testinium;


import com.testinium.base.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class StepImplementation extends BaseTest {

    @Step("start")
    public void start()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        appiumDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/acMain_btnBooking")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/acMain_btnBooking")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_llFrom")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_llFrom")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")).sendKeys("İstanbul");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_llTo")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_llTo")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch")).sendKeys("Ankara");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout")));
        WebElement tarihelement=appiumDriver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout)["+getToDay()+"]"));
        tarihelement.click();


    }

    public int getToDay()
    {
        Date date=new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Turkey/İstanbul"));
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return (day+7+2);
    }

}
