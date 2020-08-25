package SoftDesign.site;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCadastro {
		
	@Test
	public void LoginField() {
		WebDriver driver = new FirefoxDriver();
    	driver.get("https://portal.softdesign-rs.com.br/");
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/component");
		
		
		driver.findElement(By.id("elementsform:name")).sendKeys("Gabriel");
		driver.findElement(By.id("elementsform:name")).sendKeys("Gabriel!@@#$%");
		driver.findElement(By.id("elementsform:name")).sendKeys("Gabrielzinho99");
		driver.quit();
	}
	
	@Test
	public void PasswordField() {
		WebDriver driver = new FirefoxDriver();
    	driver.get("https://portal.softdesign-rs.com.br/");
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/component");
		
		driver.findElement(By.id("elementsform:password")).sendKeys("aiosgjoiagjioasjgoiasjgioahsigbsaigbiashioa");
		driver.findElement(By.id("elementsform:password")).sendKeys("joemoe2498");
		driver.findElement(By.id("elementsform:password")).sendKeys("j");
		driver.findElement(By.id("elementsform:password")).sendKeys("moe!@#$%");
		 
		Assert.assertTrue(driver.findElement(By.id("elementsform:password")));
		
		driver.quit(); 
	}
	@Test
	public void SucessfulLogin() {
		WebDriver driver = new FirefoxDriver();
    	driver.get("https://portal.softdesign-rs.com.br/");
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/component");
		
		driver.findElement(By.id("elementsform:name")).sendKeys("Gabriel-Andrade");
		driver.findElement(By.id("elementsform:password")).sendKeys("21234dt2");
		
		driver.quit();
	}
}
