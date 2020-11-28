package Formularios;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_ComerciosTest2 {

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
	public void test() throws InterruptedException, IOException {
		driver.manage().deleteAllCookies();
		 driver.findElement(By.cssSelector("[placeholder='Correo']")).sendKeys("testdos@wposs.com");//brayhanrendon@wposs.com
		 driver.findElement(By.cssSelector("[placeholder='Contraseña']")).sendKeys("Wposs.2020");//Cpanel#*.2019
		 driver.findElement(By.className("ui-button")).click();
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		 
		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[4]"));
		
		Thread.sleep(2000);
		int i=5000;//5000
		
		String unique_code,name,celular;
		while(i<10000) {
		Thread.sleep(3000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button[1]"));
		
		Thread.sleep(3000);
		System.out.println(1);
		w.type(By.cssSelector("[formcontrolname='contact_person']"), "NO EXISTE REGISTRO");
		 unique_code=readExcel.getCellValue(w.rutaExcel_comercio,"Hoja1",i,0);System.out.println("unique_code");
		 name=readExcel.getCellValue(w.rutaExcel_comercio,"Hoja1",i,1);System.out.println("name");
		 celular="5568797";
		 
		
		System.out.println(2);
		w.type(By.cssSelector("[formcontrolname='email']"), "testdos@wposs.com");
		w.click(By.cssSelector("[formcontrolname='selectpriority']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[6]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*3 + 1)+"]"));//Prioridad
		w.type(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[7]/div/p-autocomplete/span/input"), "Centro de la ciudad");
		w.type(By.cssSelector("[formcontrolname='nit']"), unique_code);
		w.click(By.cssSelector("[formcontrolname='selectcountry']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[1]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*37 + 1)+"]"));// 2 - 4 Municipio
		w.click(By.cssSelector("[formcontrolname='selectcity']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[2]/p-dropdown/div/div[4]/div/ul/li[1]"));
		w.type(By.cssSelector("[formcontrolname='name']"), name);
		w.type(By.cssSelector("[formcontrolname='unique_code']"), unique_code);

		w.type(By.cssSelector("[formcontrolname='phone']"),"315"+celular);
		w.type(By.cssSelector("[formcontrolname='cellphone']"), celular);
		
		w.type(By.cssSelector("[formcontrolname='schedule_attention']"), "DOMINGO A DOMINGO DE 8:00 A 20:00");
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-commerce/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		
		System.err.println(i+"- QUEDOOOOO AQUI test4::"+unique_code);
		
		i++;}
		}
	}

	
