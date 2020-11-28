package Formularios;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_TiemposParaClientes {

	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();
	private ReadExcel readExcel;
	@Before
	 public void setUp() {
		 driver=w.getChromeConection();
		 readExcel=new ReadExcel();
	 } 
	
	
	@Test
	public void test() throws InterruptedException, IOException {

		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[3]"));//Extras
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[14]"));
		int i=7;
		String unique_code;
		 while(i<100) {
			 unique_code=readExcel.getCellValue(w.rutaExcel_comercio,"Hoja1",i,0);System.out.println(unique_code);
		Thread.sleep(1000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button"));
		Thread.sleep(800);
		
		w.type(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/div/div[5]/input"),""+ Math.floor(Math.random()*8 + 1));
		w.type(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/div/div[6]/input"),""+  Math.floor(Math.random()*24 + 1));
		w.type(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/input"), unique_code);
		while(!w.isDisplayed(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-dialog/div/div[2]/div/div/div[2]/div/button"))) {
			w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-times-commerce/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		}
		
		 i++;}
		 }

}
