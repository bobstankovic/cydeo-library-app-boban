package com.cydeo.library.exel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExel {
    String filePhat = "SampleData.xlsx";

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void exel_write()throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePhat);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");

        XSSFCell salaryCall = sheet.getRow(0).createCell(3);
        salaryCall.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(220000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(180000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(160000);

        for(int rownum = 0; rownum < sheet.getLastRowNum(); rownum++){
            if(sheet.getRow(rownum).getCell(0).toString().equals("Mary")){
                sheet.getRow(rownum).getCell(1).setCellValue("Jones");
            }
        }




        FileOutputStream fileOutputStream = new FileOutputStream(filePhat);
        workbook.write(fileOutputStream);

        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}
