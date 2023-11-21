package uk.co.automationtesting.mavenproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class L08_Profile {
	
	WebDriver driver;
	
	@Test
	public void testng() {
		System.out.println("this is from the TESTNG method!");
	}
	
	@Test
	public void example() {
		System.out.println("this is from the EXAMPLE method!");
	}

}
