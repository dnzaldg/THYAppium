package com.testinium;
import com.testinium.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class StepImplementation extends BaseTest {

    @Step("Homepage opens <button>")
    public void start(String button)
    {
        clickBy(By.id(button));
    }

    @Step("Click Buy ticket <button>")
    public void ticket(String button)
    {
        clickBy(By.id(button));
    }

    @Step("One way <flight> is selected")
    public void oneDirection(String flight)
    {
        clickBy(By.id(flight));
    }

    @Step("Departure <from> is selected and <button> is clicked, destination <to> is selected and <buttonTwo> is clicked")
    public void directionInformation(String from , String button, String to, String buttonTwo) throws IOException {
        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llFrom"));

        from=getValueFromExcel(1,1);
        sendKeysBy(By.id(button),from);

        clickBy(By.xpath("(//android.widget.TextView[@resource-id=\"com.turkishairlines.mobile:id/itemAirport_tvBottom\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frDashboard_llTo"));

        to=getValueFromExcel(2,1);
        sendKeysBy(By.id(buttonTwo),to);

        clickBy(By.id("com.turkishairlines.mobile:id/itemAirport_tvBottom"));
    }

    @Step("Date information is either selected 2 days after the current date <button>")
    public void dateDirection(String button)
    {
        clickBy(By.id(button));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout")));
        WebElement tarihelement=appiumDriver.findElement(By.xpath("(//android.widget.ListView[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]//android.widget.FrameLayout)["+getToDay()+"]"));
        tarihelement.click();
    }

    @Step("Click the OK button <button>")
    public void okButton(String button)
    {
        clickBy(By.id(button));
    }

    @Step("The number of passengers is selected as 2 <button>")
    public void personIncrease(String button)
    {
        clickBy(By.xpath(button));
    }

    @Step("Search flight <button> is clicked")
    public void searchButton(String button)
    {
        clickBy(By.id(button));
    }


    @Step("Ucusların listelendiği kontrol edilir")
    public void flyControl()
    {
    }

    @Step("Click <button1>, <button2> for economic flight")
    public void economicalFlight(String button1, String button2)
    {
        clickBy(By.xpath(button1));
        clickBy(By.xpath(button2));
    }

    @Step("Click on the <button> button")
    public void continuationButton(String button)
    {
        clickBy(By.id(button));

    }

    @Step("1.passenger information: <firstname> <button1>,  <lastname> <button2>, <birthday> <button3>, <email> <button4>, <tc> <button5>")
    public void addPassenger(String firstname,String button1, String lastname,String button2, String birthday,String button3, String email,String button4, String tc,String button5) throws IOException {

       clickBy(By.id("com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow"));

        firstname=getValueFromExcel(3,1);
        sendKeysBy(By.id(button1), firstname);

        lastname=getValueFromExcel(4,1);
        sendKeysBy(By.id(button2),lastname);

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id(button3),birthday);

        email=getValueFromExcel(6,1);
        sendKeysBy(By.id(button4),email);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        tc=getValueFromExcel(7,1);
        sendKeysBy(By.id(button5),tc);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));

    }

    @Step("2.passenger information: <firstname> <button1>,  <lastname> <button2>, <birthday> <button3>, <email> <button4>, <tc> <button5>")
    public void secondPassenger(String firstname,String button1, String lastname,String button2, String birthday,String button3, String email,String button4, String tc,String button5) throws IOException {
        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerlistheader_imArrow\"])[2]"));

        clickBy(By.xpath("(//android.widget.ImageView[@resource-id=\"com.turkishairlines.mobile:id/frPickPassengerListItemAdd_ivArrow\"])[2]"));

        firstname=getValueFromExcel(8,1);
        sendKeysBy(By.id(button1),firstname);

        lastname=getValueFromExcel(9,1);
        sendKeysBy(By.id(button2),lastname);

        clickBy(By.id("com.turkishairlines.mobile:id/form_checkbox_right"));

        sendKeysBy(By.id(button3),birthday);

        email=getValueFromExcel(11,1);
        sendKeysBy(By.id(button4),email);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_left\"])[2]"));

        tc=getValueFromExcel(12,1);
        sendKeysBy(By.id(button5),tc);

        clickBy(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.turkishairlines.mobile:id/form_checkbox_right\"])[3]"));

        clickBy(By.id("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger"));



    }

    @Step("Save button <button> is clicked")
    public void saveButton(String button)
    {
        clickBy(By.id(button));
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


    public  String getValueFromExcel(int row, int cell) throws IOException
    {
            FileInputStream file = new FileInputStream(new File("information.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();
            String val = formatter.formatCellValue(sheet.getRow(row).getCell(cell));
            return val;
    }
}
