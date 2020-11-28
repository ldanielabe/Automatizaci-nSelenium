package Formularios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GestionExtras_MallaHorarios {
	
	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();
	
	@Before
	 public void setUp() {
		 driver=w.getChromeConection();
	 } 
	
	@Test
	public void test() throws InterruptedException {
		//int i=0;
		//while(i>100) {
		Thread.sleep(5000);
		String btnConf="/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(btnConf)).click();
		Thread.sleep(2000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[1]/ul/li[2]"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar/div/div[1]/div/button[5]"));
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-schedule-mesh/div[1]/div/div/div/div[1]/div/p-fullcalendar/div/div[1]/div[2]/div/button[3]"));
		Thread.sleep(2000);
		//w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-schedule-mesh/div[1]/div/div/div/div[1]/div/p-fullcalendar/div/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[2]/table/thead/tr/td[3]"));	
		w.click(By.xpath("/html/body/app-root/div[1]/app-extras/div[1]/div/div/div/div/perfect-scrollbar[2]/div/div[1]/div/app-schedule-mesh/div[1]/div/div/div/div[1]/div/p-fullcalendar/div/div[2]/div/table/tbody/tr/td/div/div/div["+ Math.floor(Math.random()*3 + 1) +"]/div[2]/table/thead/tr/td["+ Math.floor(Math.random()*6 + 1) +"]"));
		Thread.sleep(2000);
		//User
		w.click(By.xpath("//*[@id=\"werty\"]/div[2]/div[1]/p-dropdown"));
		w.click(By.xpath("//*[@id=\"werty\"]/div[2]/div[1]/p-dropdown/div/div[3]/div[2]/ul/li["+Math.floor(Math.random()*9 + 1)+"]"));//1-10
		//Horario
		w.click(By.xpath("//*[@id=\"werty\"]/div[2]/div[2]/p-dropdown"));
		w.click(By.xpath("//*[@id=\"werty\"]/div[2]/div[2]/p-dropdown/div/div[3]/div[2]/ul/li["+Math.floor(Math.random()*5 + 1)+"]"));//1-6
		w.click(By.xpath("//*[@id=\"werty\"]/div[3]/button"));
		//i++;}
	}
}
