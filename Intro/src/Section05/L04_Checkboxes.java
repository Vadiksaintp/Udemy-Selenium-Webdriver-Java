package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vilichev\\OneDrive - Capgemini\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		System.out.println(
				driver.findElement(By.cssSelector("input#cb_red")).isSelected()
				);
		
		//input#cb_green
		
		System.out.println(
				driver.findElement(By.cssSelector("input#cb_green")).isSelected()
				);
		
		
		
		
		
		

	}

}
