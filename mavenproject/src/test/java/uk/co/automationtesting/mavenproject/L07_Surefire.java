package uk.co.automationtesting.mavenproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class L07_Surefire {
	
	WebDriver driver;
	
	@Test
	public void testng() {
		Assert.assertEquals("demo", "demo");
	}

}
