package com.testinium;
import com.testinium.base.BaseTest;
import com.thoughtworks.gauge.Step;
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

import static com.testinium.Lab.getValueFromExcel;

public class StepImplementation extends BaseTest {

    @Step("start")
    public void start()
    {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        //appiumDriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        clickBy(By.id("com.turkishairlines.mobile:id/frPrivacy_btnAccept"));
    }

    @Step("Bilet al <button> tıklanır")
    public void ticket(String button)
    {
        clickBy(By.id(button));
    }

    @Step("Tek yön <ucus> secilir")
    public void oneDirection(String ucus)
    {
        clickBy(By.id(ucus));
    }

    @Step("Yön bilgisi <nereden> , <nereye>")
    public void directionInformation(String nereden , String nereye)
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llFrom"));

        nereden=getValueFromExcel("From");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"),nereden);

        clickBy(By.xpath("(//android.widget.TextView[@resource-id=\"com.turkishairlines.mobile:id/itemAirport_tvBottom\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llTo"));

        nereye=getValueFromExcel("To");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"),nereye);

        clickBy(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom"));
    }

    @Step("Tarih bilgisi <button> günün tarihinden 2 gün sonra ya seçilir")
    public void dateDirection(String button)
    {
        clickBy(By.id(button));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout")));
        WebElement tarihelement=appiumDriver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout)["+getToDay()+"]"));
        tarihelement.click();
    }

    @Step("Tamam butonuna <button> tıklanır")
    public void okButton(String button)
    {
        clickBy(By.id(button));
    }

    @Step("Yolcu sayısı <button> olarak seçilir")
    public void personIncrease(String button)
    {
        clickBy(By.xpath(button));
    }

    @Step("Ucus ara <button> tıklanır")
    public void searchButton(String button)
    {
        clickBy(By.id(button));
    }


    @Step("Ucusların listelendiği kontrol edilir")
    public void flyControl()
    {
    }

    @Step("Ekonomik ucus için <button1>, <button2> secilir")
    public void economicalFlight(String button1, String button2)
    {
        clickBy(By.xpath(button1));
        clickBy(By.xpath(button2));
    }

    @Step("Devam <button> tıklanır")
    public void continuationButton(String button)
    {
        clickBy(By.id(button));

    }

    @Step("1. Yolcu <firstname>,  <lastname>, <birthday>, <email>, <tc>")
    public void addPassenger(String firstname, String lastname, String birthday, String email, String tc)
    {
        clickBy(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow"));

        firstname=getValueFromExcel("FirstName");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName"), firstname);

        lastname=getValueFromExcel("LastName");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName"),lastname);

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth"),birthday);

        email=getValueFromExcel("Email");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail"),email);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        tc=getValueFromExcel("Tc");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN"),tc);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));

    }

    @Step("2. Yolcu <firstname>, <lastname>, <birthday>, <email>, <tc>")
    public void secondPassenger(String firstname, String lastname,String birthday, String email, String tc)
    {
        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]"));

        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow\"])[2]"));

        firstname=getValueFromExcel("FirstNameTwo");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName"),firstname);

        lastname=getValueFromExcel("LastNameTwo");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName"),lastname);

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth"),birthday);

        email=getValueFromExcel("EmailTwo");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddEmail"),email);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        tc=getValueFromExcel("TcTwo");
        sendKeysBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN"),tc);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));

        clickBy(By.id("com.turkishairlines.mobile:id/frPickPassenger_btnContinue"));


    }

    @Step("Cancel <button> click")
    public void finish(String button)
    {
        clickBy(By.id(button));

    }


    public int getToDay()
    {
        Date date=new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Turkey/İstanbul"));
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return (day+7+2);
    }

    @Step("<by> elementine tıkla")
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
    public void sendKeysClick(By by, String text)
    {
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated((by)));
        element.click();
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
            FileInputStream file = new FileInputStream(new File("information.xlsx"));
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
                        if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
                            retunrValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        }
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
