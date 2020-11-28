package Formularios;

import java.awt.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GestionExtras_ProductividadCampo {

	
	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();
	
	@Before
	 public void setUp() {
		 driver=w.getChromeConection();
	 } 
	
	
	@Test
	public void test() throws InterruptedException {

		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));//Extras
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[10]"));//Productividad de campo
		
		int i=20;//41
		while(i<41) {
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/div/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button"));
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[1]/p-dropdown"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[1]/p-dropdown/div/div[4]/div/ul/li[ "+27+"]"));////1-38
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[2]/p-dropdown"));//(max - min)) + min; Math.floor(Math.random()*(9-2) + 2)
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[2]/p-dropdown/div/div[4]/div/ul/li["+i+"]"));
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[3]/input")).sendKeys("12");
		Thread.sleep(1500);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-field-technical-productivity/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		Thread.sleep(1000);
		i++;
		}

	}
}
