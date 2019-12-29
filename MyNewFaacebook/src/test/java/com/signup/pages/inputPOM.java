package com.signup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.signup.utilities.Base;
import com.signup.utilities.CustomUtilities;



public class inputPOM extends Base {
	public inputPOM() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this);
	}
	
	
	
	@FindBy(name="firstname")
	public WebElement Firstname;
		
	@FindBy(id="u_0_h")
	public WebElement Lastname;
	@FindBy(id="u_0_p")
	public WebElement password;
	@FindBy(id="u_0_k")
	public WebElement Number;
}
