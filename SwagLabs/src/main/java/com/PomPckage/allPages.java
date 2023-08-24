package com.PomPckage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class allPages extends pomOrBaseClass{

	public allPages(WebDriver wd,WebDriverWait wait) {
		super(wd, wait);
		
		// TODO Auto-generated constructor stub
	}
	Actions actions = new Actions(driver);

//  logIn page
	public void logIn() throws IOException, InterruptedException {
		FileReader file=new FileReader("./TestData/TestData.properties");
		Properties p=new Properties();
		p.load(file);
//		driver.get(p.getProperty("baseurl"));
//		driver.get(driver.get)
		usernameField.sendKeys(p.getProperty("unm1"));
		Thread.sleep(3000);
		passwordField.sendKeys(p.getProperty("pwd1"));
		Thread.sleep(3000);
		loginButton.click();
		Thread.sleep(3000);
	}
		
//  2.click to perform add Sauce Labs Bolt T-Shirt(product)
	public void clickToAddSauceLabBoltTshirt() throws InterruptedException{
		SauceLabsBoltT_Shirt.click();
		Thread.sleep(4000);
			//3.user should be redirected to another URL and must validate the URL
			//driver.navigate().to("https://www.saucedemo.com/inventory-item.html?id=1");
			 String currentUrl=driver.getCurrentUrl();
			 String expectedURL="https://www.saucedemo.com/inventory-item.html?id=1";
			if(currentUrl.equals(expectedURL)) {
				System.out.println("valid URL");
			}
			else {
				System.out.println("Invalid Url");
			}
			
		}
	
//  4.user should print the price tag for the product.
	public void printPriceTag() {
		String Price_tag=priceTag.getText();
		System.out.println("The price is: "+Price_tag);
	}
	
// 	5.click to perform add to cart user should see the cart icon is populated with 1.
	public void addToCart() throws InterruptedException {
		add_to_cart.click();
		Thread.sleep(4000);
		String cartCount=cart_icon.getText();
		System.out.println("user can see the cart icon is populated with 1,"+cartCount);
	}
	
//  6.Click to shopping cart icon//user should see one product is added successfully.
	public void shoppingCart() throws InterruptedException {
		Thread.sleep(4000);
		cart_icon.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) yourCart));
		//test
		//Assert.assert(driver.getTitle().equals("Single Page Apps for GitHub Pages"));
		//Assert.assertTrue(driver.equals(yourCart),"Your Cart");
		
	}
	
//  7.Click to checkout button
	public void checkOut() throws InterruptedException {
		Thread.sleep(4000);
		checkOutButton.click();
		//8.Validate Checkout: Your Information. //will add Assert 
		   String chkInfo=checkOutInfo.getText();
		   String expectedChkInfo="Checkout: Your Information";
		   Assert.assertEquals(chkInfo, expectedChkInfo);
	}
	

//	9.Validate the checkout information- first name/last name/zip-postal code fill with correct credentials and click continue.
	public void checkOutInformation() throws IOException, InterruptedException {
		FileReader file=new FileReader("./TestData/TestData.properties");
		Properties p=new Properties();
		p.load(file);
		firstNameField.sendKeys(p.getProperty("firstName"));
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		lastNameField.sendKeys(p.getProperty("LastName"));
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		zipCodeField.sendKeys(p.getProperty("zipCode"));
		Thread.sleep(2000);
		continueButton.click();	
	}
	
//  10.Validate the user should redirect to another URL and validate Checkout: Overview 
	public void validateUrl() throws InterruptedException {
		Thread.sleep(3000);
		String currentUrl=driver.getCurrentUrl();
		 String expectedURL="https://www.saucedemo.com/checkout-step-two.html";
		if(currentUrl.equals(expectedURL)) {
			System.out.println("valid URL");
		}
		else {
			System.out.println("Invalid Url");
		}
		//validate checkOut information with assertion
	String chkOverview=checkOutOverview.getText();
	String chkoutOverview="Checkout: Overview";
	Assert.assertEquals(chkOverview,chkoutOverview);
			
	}
	
//  11.	Click to finish button.
	public void clickONFinishButton() throws InterruptedException {
		Thread.sleep(3000);
		finishButton.click();
	 //  12.Finally, user should see Checkout: Complete! And thank you for your order!
		String thankyouMessage=thankYou.getText();
		String expectedMessage="Thank you for your order!";
		Assert.assertEquals(thankyouMessage, expectedMessage);
	//  13.Validate (Your order has been dispatched and will arrive just as fast as the pony can get there!)
		String dispatchedMessage=dispatched.getText();
		String expectedDispatchedMessage="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		Assert.assertEquals(dispatchedMessage, expectedDispatchedMessage);
		
	}
	
//  14.Clicking to back home user should come to dashboard page.
	public void backToHome() throws InterruptedException {
		Thread.sleep(10000);
		backHome.click();
		String currentUrl=driver.getCurrentUrl();
		 String expectedURL="https://www.saucedemo.com/inventory.html";
		if(currentUrl.equals(expectedURL)) {
			System.out.println("navigate to the dashboard page");
		}
		else {
			System.out.println("Invalid Url");
		}
	}
	
//  15.Click to burger menu and click to logout
	public void logOut() throws InterruptedException {
		Thread.sleep(3000);
		burgerButton.click();
		Thread.sleep(3000);
		logOutButton.click();
		
	}
		
	}
