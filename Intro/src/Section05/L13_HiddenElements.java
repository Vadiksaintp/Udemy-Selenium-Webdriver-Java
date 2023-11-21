package Section05;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;


public class L13_HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vilichev\\OneDrive - Capgemini\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/hiddenElements.html");
		
		System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isDisplayed());
		
		System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());
		
		
	}

}
