package Formularios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_Distritos {

	private WebDriver driver;
	Wrapper wrapper= Wrapper.getSingleton();
	
	@Before
	 public void setUp() {
		 driver=wrapper.getChromeConection();
	 } 
	
	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(btnConf)).click();
		wrapper.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));//extras
		wrapper.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[5]"));
		
		int i=0;
		while(i<wrapper.VICHADA.length) {
			Thread.sleep(2800);
		wrapper.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-cities/div/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button"));
		wrapper.click(By.cssSelector("[formcontrolname='pais']"));
		//wrapper.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-cities/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[1]/p-dropdown/div/div[4]/div/ul/li["+ Math.floor(Math.random()*3 + 2) +"]")); //2 - 4
		Thread.sleep(800);
		wrapper.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-cities/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[1]/p-dropdown/div/div[4]/div/ul/li[29]"));
		Thread.sleep(1000);
		wrapper.type(By.cssSelector("[formcontrolname='name']"), wrapper.VICHADA[i]);
		
		wrapper.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-cities/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		Thread.sleep(3000);
		i++;}
	}

}
