package Formularios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
public class GestionIncidencias_CrearIncidencia {

	Wrapper w= Wrapper.getSingleton();
	
	@Before
	 public void setUp() {
		
	 } 
	
	
	@Test
	public void test() throws InterruptedException {
	int i=0;
	while(i>100) {
		Thread.sleep(10000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[3]"));//Gestion incidencias
		Thread.sleep(4000);
		w.click(By.xpath("/html/body/app-root/div[1]/app-topbar/div[1]/div[2]/p-scrollpanel/div/div[1]/div/div/app-menu/ul/li[2]/ul/li[3]/ul/li[2]"));//crear
	
		Thread.sleep(2000);
		w.type(By.cssSelector("[formcontrolname='codigoComercio']"), "123456789");
		w.click(By.cssSelector("[formcontrolname='tipoIncidencia']"));
		w.click(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div/form/div/div[3]/span/p-dropdown/div/div[3]/div[2]/ul/li[1]"));
	
		w.click(By.cssSelector("[formcontrolname='codigoUnico']"));
		w.click(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div/form/div/div[4]/span/p-dropdown/div/div[3]/div[2]/ul/li[3]"));
		
		w.type(By.cssSelector("[formcontrolname='contacto']"), "DANIELA BUITRAGO");
		Thread.sleep(2000);
		
				
		w.type(By.cssSelector("[formcontrolname='serial']"), "123455");
		w.type(By.cssSelector("[formcontrolname='horarioAtencion']"), "8am a 12 pm y de 2pm a 5pm de lunes a sabado");
		w.click(By.cssSelector("[formcontrolname='motiveSelected']"));
		w.click(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div/form/div/div[13]/span/p-dropdown/div/div[3]/div[2]/ul/li[1]"));
		w.click(By.cssSelector("[formcontrolname='estadoSelected']"));
		w.click(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div/form/div/div[15]/span/p-dropdown/div/div[3]/div[2]/ul/li[1]"));//1-2
		w.type(By.cssSelector("[formcontrolname='serial']"), "123455");
		w.type(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/div/div/div/span/textarea"), "TEST REALIZADO POR EL AREA QA DANIELA BUITRAGO");
		w.click(By.xpath("/html/body/app-root/div[1]/app-save-incidence/div[1]/div/div/div/div/div[2]/button"));
	}
	}

}
