package com.seleniumPractice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("data");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("srikala");
		row1.createCell(1).setCellValue("btech");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("shailaja");
		row2.createCell(1).setCellValue("btech");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("shivani");
		row3.createCell(1).setCellValue("Mtech");
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created....");
		
		
		
	}

}
