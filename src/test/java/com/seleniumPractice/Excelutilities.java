package com.seleniumPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {

	
		
		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFRow row;
		public static XSSFCell cell;
		public static CellStyle style;
		
		
		public static int getRowCount(String xlfile,String xlsheet) throws IOException
		{
			
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(xlsheet);
			int RowCount=ws.getLastRowNum();
			wb.close();
			fi.close();
			return RowCount;
			
			
			
		}
		
		public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
		{
			
			fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(xlsheet);
			row=ws.getRow(rownum);
			int cellcount=row.getLastCellNum();
			wb.close();
			fi.close();
			return cellcount;
			
			
			
		}
		
        public static String getCelldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
        {
        	fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(xlsheet);
			row=ws.getRow(rownum);
        	cell=row.getCell(colnum);
        	
        	String data;
        	try
        	{
        		DataFormatter formatter=new DataFormatter();
        		data=formatter.formatCellValue(cell);
        	}
        	
        	catch(Exception e)
        	{
        		
        		data="";
        		
        	}
        	
        	wb.close();
        	fi.close();
        	return data;
        	
        	
        }
		
		
        public static void SetCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
        {
        	fi=new FileInputStream(xlfile);
			wb=new XSSFWorkbook(fi);
			ws=wb.getSheet(xlsheet);
			row=ws.getRow(rownum);
        	cell=row.createCell(colnum);
        	cell.setCellValue(data);
        	
        	
        }
        
        
  

}
