package com.cydeo.library.exel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelRead {

    @Test
    public void read_from_exel_file() throws IOException {
        String path = "SampleData.xlsx";
        // to read from exel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        // create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // create a sheet
        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        int numberOfRow = sheet.getPhysicalNumberOfRows();
        System.out.println("numberOfRow = " + numberOfRow);

        int lastRow = sheet.getLastRowNum();
        System.out.println("lastRow = " + lastRow);

        for(int rownum = 0; rownum < numberOfRow; rownum++){
            if(sheet.getRow(rownum).getCell(0).toString().equals("Vinod")){
                System.out.println(rownum+ " " + sheet.getRow(rownum).getCell(0));

            }
        }

        for(int rownum = 0; rownum < numberOfRow; rownum++){
            if(sheet.getRow(rownum).getCell(0).toString().equals("Linda")){
                System.out.println("row = "+ rownum+ "\nname =  " + sheet.getRow(rownum).getCell(0));
                System.out.println("last name = " + sheet.getRow(rownum).getCell(1));
                System.out.println("job ID = " + sheet.getRow(rownum).getCell(2));
            }
        }


    }

}
