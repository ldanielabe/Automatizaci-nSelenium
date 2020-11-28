package Formularios;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_Accesorios {

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
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));
		Thread.sleep(1000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[1]"));
		Thread.sleep(1000);
		//int i=0;
		//while(i>100) {
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-accesories/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button[1]"));
		w.type(By.cssSelector("[formcontrolname='code']"), "1111114");
		Thread.sleep(2000);
		w.type(By.cssSelector("[formcontrolname='name']"), "prueba ACCESORIO DANIELA ");
		Thread.sleep(2000);
		w.click(By.cssSelector("[formcontrolname='model']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-accesories/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[3]/p-dropdown/div/div[3]/div[2]/ul/li["+ Math.floor(Math.random()*14 + 1) +"]"));//1 - 15
		w.click(By.cssSelector("[formcontrolname='status']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-accesories/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[4]/p-dropdown/div/div[3]/div[2]/ul/li["+ Math.floor(Math.random()*4 + 1) +"]"));//1 - 5 
		
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-accesories/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[5]/p-selectbutton/div/div[1]"));//1 - 3 Ubicacion
		Thread.sleep(2000);
		w.type(By.cssSelector("[formcontrolname='location']"), "BASU0");
		w.type(By.cssSelector("[formcontrolname='quantity']"), "100");
		
		String btnSave="/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-accesories/p-dialog/div/div[2]/div/div/div[2]/div/button";
		Thread.sleep(2000);
		if(w.isDisplayed(By.xpath(btnSave))) {
		w.click(By.xpath(btnSave));
		}
		//i++;}
	}
}
