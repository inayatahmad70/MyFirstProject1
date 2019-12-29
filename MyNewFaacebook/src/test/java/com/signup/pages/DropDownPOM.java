package com.signup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.signup.utilities.Base;

public class DropDownPOM extends Base{
	public DropDownPOM() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="month")
	public  WebElement birthdaymonth;
	@FindBy(id="day")
	public WebElement birthdayday;
	@FindBy(id="year")
	public WebElement birthdayyear;
	
}
