package Formularios;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionBodega {

	
	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();
	private ReadExcel readExcel;
	
	@Before
	 public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=w.getChromeConection();
		driver.manage().window().maximize();
		driver.get("http://3.80.72.218:8080");
		readExcel=new ReadExcel();
	} 
	
	@Test
	public void test() throws InterruptedException {
		
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.cssSelector("[placeholder='Correo']")).sendKeys("danielabuitrago@wposs.com");//brayhanrendon@wposs.com
		 driver.findElement(By.cssSelector("[placeholder='Contraseña']")).sendKeys("wposs.123");//Cpanel#*.2019
		 driver.findElement(By.className("ui-button")).click();
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		 
		 
		 String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		 String btnGestionBodegas="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]";
		 Thread.sleep(5000);
		 w.click(By.xpath(btnConf));
		 w.click(By.xpath(btnGestionBodegas));
		 int i=0;
		 while(i<w.gestionExtras_Municipios.length) {
		 Thread.sleep(2000);
		 w.click(By.cssSelector("[label='Registrar']"));
		 Thread.sleep(800);
		 w.type(By.cssSelector("[formcontrolname='name']"),"Bodega dieciseis "+w.gestionExtras_Municipios[i]);
		 w.click(By.cssSelector("[formcontrolname=\"type\"]"));
		 w.click(By.xpath("/html/body/app-root/div[1]/app-find-all/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[1]/p-dropdown/div/div[4]/div/ul/li[1]"));
		 w.type(By.cssSelector("[formcontrolname='responsable']"),"Laura Buitrago");
		 w.click(By.cssSelector("[formcontrolname='country']"));
		 w.click(By.xpath("/html/body/app-root/div[1]/app-find-all/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[4]/p-dropdown/div/div[4]/div/ul/li["+(i+1)+"]"));
		 w.click(By.cssSelector("[formcontrolname='city']"));
		 w.click(By.xpath("/html/body/app-root/div[1]/app-find-all/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[5]/p-dropdown/div/div[4]/div/ul/li[1]"));
		 w.click(By.cssSelector("[formcontrolname='state']"));
		 w.click(By.xpath("/html/body/app-root/div[1]/app-find-all/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[6]/p-dropdown/div/div[4]/div/ul/li[1]"));
		 w.type(By.cssSelector("[formcontrolname='email']"),"laura@wposs.com");
		 w.type(By.cssSelector("[formcontrolname='phone']"),"31459805"+i);
		 //assertEquals(3, 3);
		 w.type(By.cssSelector("[formcontrolname='position']"),"Gerente");
		 
		 String btnSave="/html/body/app-root/div[1]/app-find-all/p-dialog/div/div[2]/div/div/div[2]/div/button";
		
	     w.click(By.xpath(btnSave));
	     Thread.sleep(1000);
	     i++;}
		 
		 
	}
}
