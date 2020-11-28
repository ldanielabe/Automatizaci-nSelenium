package Formularios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtra_MarcasTerminal {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath(btnConf)).click();
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));//Extras
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[7]"));//MArcas de terminal
		int i=0;
		while(i<w.gestionBodega_marca.length) {
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminal-brands/div/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button"));
		w.type(By.cssSelector("[formcontrolname='name']"), w.gestionBodega_marca[i]);
		Thread.sleep(1500);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminal-brands/p-dialog/div/div[2]/div/div/div/div/div/form/div/div/div/div[2]/div/button"));
		Thread.sleep(2000);
		i++;}
	}
}
