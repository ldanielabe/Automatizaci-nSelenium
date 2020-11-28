package Formularios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public void write(String urlExcel,String nameSheet,String[] dataToWrite ) throws IOException {
		File file=new File(urlExcel);
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook newWorklBook=new XSSFWorkbook(inputStream);
		XSSFSheet newSheet=newWorklBook.getSheet(nameSheet);
		int rowCount=newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		XSSFRow row=newSheet.getRow(0);
		XSSFRow newRow=newSheet.createRow(rowCount+1);
		for (int i = 0; i <row.getLastCellNum(); i++) {
			XSSFCell newCell=newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);
		}
		inputStream.close();
		FileOutputStream outputStream=new FileOutputStream(file);
		newWorklBook.write(outputStream);
		outputStream.close();
	}
	
	
	public void writeCellValue(String urlExcel,String nameSheet,int rowNumber,int cellNumber,String resultText) throws IOException {
		File file=new File(urlExcel);
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook newWorklBook=new XSSFWorkbook(inputStream);
		XSSFSheet newSheet=newWorklBook.getSheet(nameSheet);
		XSSFRow row=newSheet.getRow(rowNumber);
		XSSFCell firstCell=row.getCell(cellNumber-1);
		System.out.println("First cell value is:"+firstCell.getStringCellValue());
		XSSFCell nextCell=row.createCell(cellNumber);
		nextCell.setCellValue(resultText);
		System.out.println("NEXT cell:"+nextCell.getStringCellValue());
		FileOutputStream outputStream=new FileOutputStream(file);
		newWorklBook.write(outputStream);
		outputStream.close();
	}
	
}
