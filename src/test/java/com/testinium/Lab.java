package com.testinium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

public class Lab {
    public static void main(String[] args) {
        System.out.println(getValueFromExcel("to"));

    }
    public static String getValueFromExcel(String key)
    {
        String retunrValue="";
        try {
            FileInputStream file = new FileInputStream(new File("deneme1.xlsx"));
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
