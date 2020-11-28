package Formularios;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_SimCard {

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
	
		Thread.sleep(3000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));//Extras
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[12]"));//SimCArd
		
		int i=4081;
		while(i<10000) {
		Thread.sleep(5000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button[1]"));
		w.type(By.cssSelector("[formcontrolname='code']"), "Basu0");
		Thread.sleep(1000);
		w.click(By.cssSelector("[formcontrolname='location']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[1]/p-dropdown/div/div[4]/div/ul/li[1]"));
		
		w.type(By.cssSelector("[formcontrolname='serial']"), readExcel.getCellValue(w.rutaExcel_sim,"Hoja1",i,0));
		w.click(By.cssSelector("[formcontrolname='brand']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[5]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*(9 - 2) + 2)+"]"));//2,3
		w.click(By.cssSelector("[formcontrolname='status']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[6]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*4 + 1)+"]"));
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		Thread.sleep(3000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-sim-card/p-dialog/div/div[3]/p-footer/button"));
		Thread.sleep(1000);
		i++;}
	}

}
