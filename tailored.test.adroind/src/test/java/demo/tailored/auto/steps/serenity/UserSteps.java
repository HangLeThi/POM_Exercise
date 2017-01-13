package demo.tailored.auto.steps.serenity;

import demo.tailored.auto.pages.TailoredPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Steps
	TailoredPage tailoredPage;
	public void open_home_page() {
		tailoredPage.open();
	}

	public void click_on_Ok_button() {
		tailoredPage.click_on_Ok_button();
		
	}

	public void click_on_headphones() {
		tailoredPage.click_on_headPhones();
		
	}

	public void select_an_element(String Element) {
		tailoredPage.select_an_option(Element);
		
	}

	public void click_on_ok_button(String Button) {
		tailoredPage.click_on_button(Button);
		
	}

}
