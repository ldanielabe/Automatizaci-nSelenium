package Formularios;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IngresarOther {

	private WebDriver driver;
	Wrapper w= Wrapper.getSingleton();

	@Before
	 public void setUp() throws InterruptedException {
		driver=w.getChromeConection();
		//JavascriptExecutor jse = (JavascriptExecutor)driver; 
		//jse.executeScript("window.open()");
	
	    
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		 driver=w.getChromeConection();
		 driver.manage().window().maximize();
		 driver.get("http://3.80.72.218:8080");
	 }
	
	@Test
	 public void login() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("[placeholder='Correo']")).sendKeys("valeriasalazar@wposs.com");
	    driver.findElement(By.cssSelector("[placeholder='Contraseña']")).sendKeys("Wposs.2019");
		driver.findElement(By.className("ui-button")).click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	 }

}
