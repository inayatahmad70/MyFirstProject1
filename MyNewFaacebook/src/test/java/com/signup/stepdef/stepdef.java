package com.signup.stepdef;

import org.openqa.selenium.support.ui.Select;

import com.signup.pages.DropDownPOM;
import com.signup.pages.GenderSelectionPOM;
import com.signup.pages.SignupPOM;

import com.signup.pages.inputPOM;
import com.signup.utilities.Base;
import com.signup.utilities.CustomUtilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef extends Base{
		
	  
	inputPOM IP=new inputPOM();
	DropDownPOM DD=new DropDownPOM();
	GenderSelectionPOM GS=new GenderSelectionPOM();
	SignupPOM SB=new SignupPOM();
    		
    		
    		

@Given("^put url Facebook\\.com$")
public void put_url_Facebook_com() throws Throwable {
	
	
driver.get("https://www.facebook.com");
}

@Then("^user should verify the title$")
public void user_should_verify_the_title() throws Throwable {
 
}

@Then("^user should be able to put \"([^\"]*)\" in firstname field$")
public void user_should_be_able_to_put_in_firstname_field(String Firstname) throws Throwable {
	
	IP.Firstname.sendKeys(Firstname);
}

@Then("^user should be able to put \"([^\"]*)\" in lastname field$")
public void user_should_be_able_to_put_in_lastname_field(String Lastname) throws Throwable {
   IP.Lastname.sendKeys(Lastname);
}

@And("^user should be able to put \"([^\"]*)\" number in number field$")
public void user_should_be_able_to_put_number_in_number_field(String Number) throws Throwable {
  IP.Number.sendKeys(Number);
}

@Then("^user should be able to put \"([^\"]*)\" in password field$")
public void user_should_be_able_to_put_in_password_field(String password) throws Throwable {
 IP.password.sendKeys(password);   
}

@Given("^user should select \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\" from DOB$")
public void user_should_select_from_DOB(String birthdaymonth, String birthdayday, String birthdayyear) throws Throwable {
Select DropDownPOMM = new Select (DD.birthdaymonth);
DropDownPOMM.selectByVisibleText(birthdaymonth);
Select DropDownPOMD = new Select (DD.birthdayday);
DropDownPOMD.selectByVisibleText(birthdayday);
Select DropDownPOMY = new Select (DD.birthdayyear);
DropDownPOMY.selectByVisibleText(birthdayyear);

}

@Given("^user should be able to click on \"([^\"]*)\" button$")
public void user_should_be_able_to_click_on_button(String Male) throws Throwable {
	
	GS.Male.click();
}
@Given("^user should be able to click on \"([^\"]*)\" botton$")
public void user_should_be_able_to_click_on_botton(String Signup) throws Throwable {
    
	SB.Signup.click();
	
}
}
