package com.signup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.signup.utilities.Base;

public class GenderSelectionPOM extends Base{
	public GenderSelectionPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="u_0_a")
	public WebElement Male;
	
}
