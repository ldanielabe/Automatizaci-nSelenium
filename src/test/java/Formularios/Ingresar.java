package Formularios;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ingresar {

	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();

	@Before
	 public void setUp() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		 driver=w.getChromeConection();
		 driver.manage().window().maximize();
		 driver.get("https://dev-pcorebcp.wposs.com/ingresar");
		 Thread.sleep(5000);
		 //http://3.80.72.218/ 
	 }
	
	@Test
	 public void login() {
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/perfect-scrollbar/div/div[1]/app-inicio/div[3]/div/div[2]/div/div[2]/span/input")).sendKeys("correo");
		 driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div/perfect-scrollbar/div/div[1]/app-inicio/div[3]/div/div[2]/div/div[3]/span/input")).sendKeys("contraseña");
		 driver.findElement(By.className("ui-button")).click();
		 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	 }

}
