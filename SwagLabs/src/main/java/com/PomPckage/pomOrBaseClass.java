package com.PomPckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pomOrBaseClass {
	public WebDriver driver;
	public WebDriverWait wait=null;
	
	//Declaration fore all the pages
	//For login--username,password and login button locators
	@FindBy(xpath="//input[@id='user-name']") 
    protected WebElement usernameField;
    @FindBy(xpath="//input[@id='password']")
    protected WebElement passwordField;
    @FindBy(xpath="//input[@id='login-button']")
    protected WebElement loginButton;
    
    //to perform add Sauce Labs Bolt T-Shirt(product)
    @FindBy(xpath="//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    protected WebElement SauceLabsBoltT_Shirt;
    
    //To print pricetag pricetag locator
    @FindBy(xpath="//div[@class='inventory_details_price']")
    protected WebElement priceTag;
    
    //click on addtocart and add to cart icon
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    protected WebElement add_to_cart;
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    protected WebElement cart_icon;
    
    //locator of expected condition
    @FindBy(xpath="//span[@class='title']")
    protected WebElement yourCart;
    
    //checkout button
    @FindBy(xpath="//button[@id='checkout']")
    protected WebElement checkOutButton;
    
    //checkOut information 1.firstName 2.lastname 3.zip code
    @FindBy(xpath="//span[@class='title']")
    protected WebElement checkOutInfo;
    @FindBy(xpath="//input[@id='first-name']")
    protected WebElement firstNameField;
    @FindBy(xpath="//input[@id='last-name']")
    protected WebElement lastNameField;
    @FindBy(xpath="//input[@id='postal-code']")
    protected WebElement zipCodeField;
    @FindBy(xpath="//input[@id='continue']")
    protected WebElement continueButton;
    
    //checkOut overview
    @FindBy(xpath="//span[@class='title']")
    protected WebElement checkOutOverview;
    
    //finishButton,thank you message,dispached
    @FindBy(xpath="//button[@id='finish']")
    protected WebElement finishButton;
    @FindBy(xpath="//h2[@class='complete-header']")
    protected WebElement thankYou;
    @FindBy(xpath="//div[@class='complete-text']")
    protected WebElement dispatched;
    
    //backHome
    @FindBy(xpath="//button[@id='back-to-products']")
    protected WebElement backHome;
    
    //burgerButton -logOut
    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    protected WebElement burgerButton;
    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    protected WebElement logOutButton;
    
    
    
    
    //Initialization
    public pomOrBaseClass(WebDriver wd , WebDriverWait wait) {
    	this.driver=wd;
    	this.wait=wait;
    	PageFactory.initElements(wd, this);
    	
    }
    
    //Utilization
    
    

}
