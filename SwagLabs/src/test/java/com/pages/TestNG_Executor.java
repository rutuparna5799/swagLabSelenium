package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.PomPckage.*;
public class TestNG_Executor {
WebDriver driver;
WebDriverWait wait;
@Test
  public void f() throws IOException, InterruptedException{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\RutuparnaPriyadarshi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		allPages ap= new allPages(driver,wait);
		ap.logIn();
		ap.clickToAddSauceLabBoltTshirt();
		ap.printPriceTag();
		ap.addToCart();
		ap.shoppingCart();
		ap.checkOut();
		ap.checkOutInformation();
		ap.validateUrl();
		ap.clickONFinishButton();
		ap.backToHome();
		ap.logOut();
	  
  }
}
