package com.signup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.signup.utilities.Base;

public class SignupPOM extends Base {
public SignupPOM() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(name="websubmit")
public WebElement Signup;

}
