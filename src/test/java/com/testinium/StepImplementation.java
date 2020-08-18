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
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        //appiumDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept")).click();
    }

    @Step("Bilet al butonuna tıklanır")
    public void ticket()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/acMain_btnBooking")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/acMain_btnBooking")).click();

    }

    @Step("Tek yön ucus secilir")
    public void oneDirection()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay")).click();
    }

    @Step("Yön bilgisi SAW to ESB")
    public void directionInformation()
    {
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
    }
    @Step("Tarih bilgisi günün tarihinden 2 gün sonra")
    public void dateDirection()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout")));
        WebElement tarihelement=appiumDriver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout)["+getToDay()+"]"));
        tarihelement.click();

    }

    @Step("Tamam butonuna tıklanır")
    public void okButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_btnDone")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_btnDone")).click();

    }
    @Step("Yolcu sayısı")
    public void personIncrease()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/calendar_grid\"]//android.widget.FrameLayout")));
        appiumDriver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/calendar_grid\"]//android.widget.FrameLayout)[7]")).click();

    }
    @Step("Ucus ara butonuna tıklanır")
    public void searchButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch")).click();
    }
    @Step("Ucusların listelendiği kontrol edilir")
    public void flyControl()
    {
    }
    @Step("Ekonomik ucus secilir")
    public void economicalFlight()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow\"])[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"]")));
        appiumDriver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"])[1]")).click();
    }
    @Step("Devam butonuna tıklanır")
    public void continuationButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue")).click();

    }
    @Step("Yolcu ekle alanı doldurulur ve devam butonuna tıklanır")
    public void addPassenger()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")).sendKeys("Deniz");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")).sendKeys("Aladağ");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/form_checkbox_right")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/form_checkbox_right")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")).sendKeys("02-08-1997");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")).sendKeys("dnz.testapplication@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")).sendKeys("48085445200");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]")));
        appiumDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow\"])[2]")));
        appiumDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow\"])[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName")).sendKeys("Pınar");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName")).sendKeys("Aladağ");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/form_checkbox_right")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/form_checkbox_right")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth")).sendKeys("22-07-1995");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail")).sendKeys("pnr.testapplication@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN")).sendKeys("48091445072");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"]")));
        appiumDriver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frPickPassenger_btnContinue")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frPickPassenger_btnContinue")).click();

    }

    @Step("Finish")
    public void finish()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/toolbarBase_tvCancel")));
        appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/toolbarBase_tvCancel")).click();

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
