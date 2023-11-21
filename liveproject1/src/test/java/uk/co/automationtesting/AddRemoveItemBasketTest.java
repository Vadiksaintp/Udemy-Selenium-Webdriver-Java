package uk.co.automationtesting;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}	
		
		@Test
		public void addRemoveItem() throws IOException {
			
			ExtentManager.log("Starting AddRemoveItemBasketTest...");
			
			// creating an object of the automationtesting.co.uk webpage
			Homepage home = new Homepage();
			
			
			//handle cookie visibility using JSE - added 20230217
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink()); 
			home.getTestStoreLink().click();
			
			// creating an object of the test store homepage
			ShopHomepage shopHome = new ShopHomepage();
			ExtentManager.pass("Reached the shop homepage");
			shopHome.getProdOne().click();

			// creating an object of the shop products page (when a product has been selected)
			ShopProductPage shopProd = new ShopProductPage();
			ExtentManager.pass("Reached the shop product page");
			Select option = new Select(shopProd.getSizeOption());
			option.selectByVisibleText("M");
			ExtentManager.pass("Have successfully selected product size");
			shopProd.getQuantIncrease().click();
			ExtentManager.pass("Have successfully selected quantity");
			shopProd.getAddToCartBtn().click();
			ExtentManager.pass("Have successfully added product tp basket");

			// creating an object of the cart content panel (once an item was added)
			ShopContentPanel cPanel = new ShopContentPanel();
			cPanel.getContinueShopBtn().click();
			shopProd.getHomepageLink().click();
			shopHome.getProdTwo().click();
			shopProd.getAddToCartBtn().click();
			cPanel.getCheckoutBtn().click();
			
			ShoppingCart cart = new ShoppingCart();
			cart.getDeleteItemTwo().click();
			
			waitForElementInvisible(cart.getDeleteItemTwo(), 10);
			
			System.out.println(cart.getTotalAmount().getText());
			
			try {
				//using this assertion to make sure the total amount is what we are expecting
				Assert.assertEquals(cart.getTotalAmount().getText(), "$45.23");
				ExtentManager.pass("The total amount matches the expected amount.");
			} catch (AssertionError e){
				Assert.fail("Cart amount did not match the expected amount, it found" + cart.getTotalAmount().getText() + " expected $45.23");
				ExtentManager.fail("The total amount did not match the expected amount.");
			}	
		}
	}	


