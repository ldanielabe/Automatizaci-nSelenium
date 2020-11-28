package Formularios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_Terminales {

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
		 driver.findElement(By.cssSelector("[placeholder='Correo']")).sendKeys("test3@wposs.com");//brayhanrendon@wposs.com
		 driver.findElement(By.cssSelector("[placeholder='Contraseña']")).sendKeys("Wposs.2020");//Cpanel#*.2019
		 driver.findElement(By.className("ui-button")).click();
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		 
		
		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));//Extras
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[12]"));//Terminal
		Thread.sleep(2000);
		int i=1167;
		String num;
		while(i<10000) {
		num=readExcel.getCellValue(w.rutaExcel_terminal,"Hoja1",i,0);
		
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-datatable/div/div[1]/p-header/div/div/div/div/div[1]/button[1]"));
		w.type(By.cssSelector("[formcontrolname='num']"), "1023457-"+i);
		w.type(By.cssSelector("[formcontrolname='imei']"),num );
		w.click(By.cssSelector("[formcontrolname='location']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[1]/p-dropdown/div/div[4]/div/ul/li[2]"));
		w.type(By.cssSelector("[formcontrolname='code']"), "Basu0");
		
		w.type(By.cssSelector("[formcontrolname='serial']"), "0000000"+i);
		w.click(By.cssSelector("[formcontrolname='brand']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[6]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*25 + 1)+"]"));
		w.click(By.cssSelector("[formcontrolname='model']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[7]/p-dropdown/div/div[4]/div/ul/li"));
		w.click(By.cssSelector("[formcontrolname='tecnology']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[8]/p-multiselect/div/div[4]/div[2]/ul/li["+Math.floor(Math.random()*2 + 1)+"]"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[8]/p-multiselect/div/div[4]/div[2]/ul/li[4]"));
		
		w.click(By.cssSelector("[formcontrolname='status']"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[10]/p-dropdown/div/div[4]/div/ul/li["+Math.floor(Math.random()*9 + 1)+"]"));
		w.type(By.cssSelector("[formcontrolname='seal']"), num);
		Thread.sleep(2000);
		w.type(By.cssSelector("[formcontrolname='key']"), num);
		
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[13]/p-calendar/span/button"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[13]/p-calendar/span/div/div[1]/div[2]/table/tbody/tr[2]/td[1]"));
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[14]/p-calendar/span/button"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[1]/div/div/div/form/div[14]/p-calendar/span/div/div[1]/div[2]/table/tbody/tr[2]/td[1]"));
		w.type(By.cssSelector("[formcontrolname='mes']"), "12");
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[2]/div/div/div[2]/div/button"));
		Thread.sleep(800);
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-terminals/p-dialog/div/div[3]/p-footer/button"));
	i++;}
	}

}
