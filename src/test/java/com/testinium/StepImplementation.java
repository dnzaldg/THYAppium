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

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.turkishairlines.mobile:id/itemAirport_tvBottom\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.turkishairlines.mobile:id/itemAirport_tvBottom\"])[3]")).click();

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

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_btnDone")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_btnDone")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/calendar_grid\"]//android.widget.FrameLayout")));
        appiumDriver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/calendar_grid\"]//android.widget.FrameLayout)[7]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow\"])[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"]")));
        appiumDriver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"])[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")).sendKeys("Deniz");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")).sendKeys("Aladağ");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/form_checkbox_right")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/form_checkbox_right")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")).sendKeys("02.08.1997");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")).sendKeys("dnz.testapplication@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddFlyerNumber")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddFlyerNumber")).sendKeys("+905376597516");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")).sendKeys("48085445200");



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]")));
        appiumDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]")).click();


        //com.turkishairlines.mobile:id/frPickPassenger_btnContinue


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
