package Formularios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void read(String urlExcel,String nameSheet ) throws IOException {
		File file=new File(urlExcel);
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook newWorklBook=new XSSFWorkbook(inputStream);
		XSSFSheet newSheet=newWorklBook.getSheet(nameSheet);
		int rowCount=newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		
		for (int i = 0; i <rowCount; i++) {
			XSSFRow row=newSheet.getRow(i);
			for (int j = 0; j <row.getLastCellNum(); j++) {
				System.out.println("Row:::"+row.getCell(j).getStringCellValue()+"||");
			}
		}
		
	}
	
	
	public String getCellValue(String urlExcel,String nameSheet, int rowNumber, int cellNumber) throws IOException {
		File file=new File(urlExcel);
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook newWorklBook=new XSSFWorkbook(inputStream);
		XSSFSheet newSheet=newWorklBook.getSheet(nameSheet);
		XSSFRow row=newSheet.getRow(rowNumber);//fila
		XSSFCell cell=row.getCell(cellNumber);
		
		return cell.getStringCellValue();
	}
}
