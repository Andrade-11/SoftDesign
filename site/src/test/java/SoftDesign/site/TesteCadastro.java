package SoftDesign.site;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCadastro {
		
	@Test
	public void Validations() {
		 public static void main1(String []args)throws Exception{
			 WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        driver.get("https://portal.softdesign-rs.com.br/");
		        driver.findElement(By.id("user_login")).sendKeys("gabriel.andrade");
		        driver.findElement(By.id("wp-submit")).click();
		        String alertMessage = driver.switchTo().alert().getText();
		        System.out.println(alertMessage);
		      if (alertMessage.equals("First name Should not contain Special Characters")){
		            System.out.println("Error displayed: First name Should not contain Special Characters");
		            driver.switchTo().alert().dismiss();
		        } else{
		            System.out.println("Accepted");
		        }
		        driver.findElement(By.id("user_login")).sendKeys("gabriel.andrade");
		        driver.findElement(By.id("wp-submit")).click();
		         if (alertMessage.equals("First name Should not contain Special Characters")){
		                System.out.println("Error displayed: First name Should not contain Special Characters");
		                driver.switchTo().alert().dismiss();
		            } else{
		                System.out.println("Accepted");
		            }
		        driver.quit();
		    }   
		}
	}
	
	
	@Test
	public void SucessfulLogin() {
		 public static void main(String[] args) {  
			  System.setProperty("webdriver.chrome.driver", " path of driver "); 
			  WebDriver driver=new ChromeDriver(); 
			  driver.manage().window().maximize(); 
			  driver.get("https://portal.softdesign-rs.com.br/"); 
			  WebElement username=driver.findElement(By.id("user_login")); 
			  WebElement password=driver.findElement(By.id("user_pass")); 
			  WebElement login=driver.findElement(By.xpath("Log in")); 
			  username.sendKeys("gabrielndrade"); password.sendKeys("dgt356"); 
			  login.click(); 
			  String actualUrl="https://portal.softdesign-rs.com.br/"; 
			  String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
			  System.out.println("Test passed"); } else { System.out.println("Test failed"); } }   }
	

	}
}
