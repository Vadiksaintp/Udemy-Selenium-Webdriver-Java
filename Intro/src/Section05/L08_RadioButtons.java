package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L08_RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vilichev\\OneDrive - Capgemini\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		//[for='demo-priority-low']
		//[for='demo-priority-normal']
		//[for='demo-priority-high']
		
		driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
