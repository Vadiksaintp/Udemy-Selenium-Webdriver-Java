package Section12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L04_Login extends L04_BasePage {
	
	
		
	
		@Test
		public void signin() throws InterruptedException, IOException {
			
			driver = getDriver();
			driver.get(getUrl());
			
			driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
			driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("john@gmail.com");
			driver.findElement(By.cssSelector("section input[name='password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("button#submit-login")).click();
			
			takeSnapShot(driver);
			
			
			System.out.println("user has logged in");
			Thread.sleep(2000);
		}
	
}
