package Formularios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtra_Tipificaciones {

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
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[15]"));//Tipificaciones
		int i=0;
		while(i<w.gestionBodega_repuestos.length) {
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-typifications/div/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button"));
		Thread.sleep(500);
		w.click(By.cssSelector("[formcontrolname='tipo']"));
		Thread.sleep(500);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-typifications/p-dialog/div/div[2]/div/div/div[1]/div/div/form/div/div/div/div[1]/p-dropdown/div/div[4]/div/ul/li[2]"));
		Thread.sleep(800);
		w.type(By.cssSelector("[formcontrolname='name']"),w.gestionBodega_repuestos[i]+" dañado");
		
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-typifications/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		i++;}
		}
}
