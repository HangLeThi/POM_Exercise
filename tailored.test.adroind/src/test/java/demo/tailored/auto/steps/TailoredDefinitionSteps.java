package demo.tailored.auto.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.tailored.auto.steps.serenity.UserSteps;

public class TailoredDefinitionSteps extends PageObject {
	
	@Steps
	UserSteps userSteps;
	@Given("^I am on Tailored Page$")
	public void i_am_on_Tailored_Page() throws Throwable {
	    userSteps.open_home_page();
	}

	@When("^I click on Ok button$")
	public void i_click_on_Ok_button() throws Throwable {
	   userSteps.click_on_Ok_button();
	}

	@When("^I click on Headphones$")
	public void i_click_on_Headphones() throws Throwable {
	  userSteps.click_on_headphones(); 
	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String Element) throws Throwable {
	  userSteps.select_an_element(Element);  
	}

	@When("^I click \"([^\"]*)\"$")
	public void i_click(String Button) throws Throwable {
	   userSteps.click_on_ok_button(Button);
	}

	@Then("^the result page is displayed$")
	public void the_result_page_is_displayed() throws Throwable {
	    
	}
}
