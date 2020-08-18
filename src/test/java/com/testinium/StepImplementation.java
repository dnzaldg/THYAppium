package com.testinium;


import com.testinium.base.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class StepImplementation extends BaseTest {

    @Step("start")
    public void start()
    {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        //appiumDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        clickBy(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept"));
    }

    @Step("Bilet al butonuna tıklanır")
    public void ticket()
    {
       clickBy(By.id("com.turkishairlines.mobile:id/acMain_btnBooking"));

    }

    @Step("Tek yön ucus secilir")
    public void oneDirection()
    {
         clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay"));
    }

    @Step("Yön bilgisi SAW to ESB")
    public void directionInformation()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llFrom"));
        String sonuc=getValueFromExcel("fromC");
        System.out.println(sonuc);
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"),sonuc);

        clickBy(By.xpath("(//android.widget.TextView[@resource-id=\"com.turkishairlines.mobile:id/itemAirport_tvBottom\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llTo"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"),"Ankara");

        clickBy(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom"));
    }

    @Step("Tarih bilgisi günün tarihinden 2 gün sonra")
    public void dateDirection()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout")));
        WebElement tarihelement=appiumDriver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout)["+getToDay()+"]"));
        tarihelement.click();

    }

    @Step("Tamam butonuna tıklanır")
    public void okButton()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_btnDone"));
    }

    @Step("Yolcu sayısı")
    public void personIncrease()
    {
        clickBy(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/calendar_grid\"]//android.widget.FrameLayout)[7]"));
    }

    @Step("Ucus ara butonuna tıklanır")
    public void searchButton()
    {
       clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch"));
    }

    @Step("Ucusların listelendiği kontrol edilir")
    public void flyControl()
    {
    }

    @Step("Ekonomik ucus secilir")
    public void economicalFlight()
    {
        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow\"])[1]"));

        clickBy(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"])[1]"));
    }

    @Step("Devam butonuna tıklanır")
    public void continuationButton()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue"));

    }

    @Step("Yolcu ekle alanı doldurulur ve devam butonuna tıklanır")
    public void addPassenger()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName"), "Deniz");

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName"),"Aladağ");

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth"),"02-08-1997");

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail"),"dnz.testapplication@gmail.com");

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN"),"48085445200");

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));

        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]"));

        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow\"])[2]"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName"),"Pınar");

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName"),"Aladağ");

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth"),"22-07-1995");

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail"),"pnr.testapplication@gmail.com");

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN"),"48091445072");

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));

        clickBy(By.id("com.turkishairlines.mobile:id/frPickPassenger_btnContinue"));

    }

    @Step("Finish")
    public void finish()
    {
        clickBy(By.id("com.turkishairlines.mobile:id/toolbarBase_tvCancel"));

    }


    public int getToDay()
    {
        Date date=new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Turkey/İstanbul"));
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return (day+7+2);
    }

    public void clickBy(By by)
    {
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated((by)));
       try {
           element.click();
       }catch (Exception e){
           System.out.println("element saniye hanım tarafından bulunamadı :-(");
       }
    }

    public void sendKeysBy(By by, String text)
    {
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated((by)));
        element.sendKeys(text);
    }


    public void waitElementVisibilityOfByid(String id)
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(id))));
        }
        catch (NoSuchElementException e){

        }
    }

    public  String getValueFromExcel(String key)
    {
        String retunrValue="";
        try {
            FileInputStream file = new FileInputStream(new File("informations.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    if (cell.getStringCellValue().equals(key)) {
                        cell = cellIterator.next();
                        retunrValue= (cell.getStringCellValue());
                    }

                }
            }
            file.close();
        }
        catch (Exception e) {
        }
        return retunrValue;
    }


}
