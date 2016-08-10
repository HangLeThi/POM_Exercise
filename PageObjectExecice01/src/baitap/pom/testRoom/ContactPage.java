package baitap.pom.testRoom;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {
	public Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	public ContactPage(WebDriver driver) {
		// define step on contact page
		super(driver);
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.Jdk14Logger");
	}

	public void enterName(String value) {
		APP_LOGS.debug("[info] Excecuting: |enter name");
		driver.findElement(By.name("name_field")).sendKeys(value);
	}

	public void checkInformation(boolean value) {
		// valua nếu có thì mình check, ko thì thôi

	}

	public void enterAddress(String value) {
		APP_LOGS.debug("[info] Excecuting: |enter address");
		driver.findElement(By.name("address_field")).sendKeys(value);
	}

	public void clickSendButton() {
		APP_LOGS.debug("[info] Excecuting: |send button");
		driver.findElement(By.id("submit_message")).click();
	}

	public HomePage navigateToHomePage() {
		APP_LOGS.debug("[info] Excecuting: |go to home page");
		driver.findElement(By.id("home_link")).click();
		return new HomePage(driver);
	}

	public AdoptionPage navigateToAdoptionPage() {
		driver.findElement(By.id("adoption_link")).click();
		return new AdoptionPage(driver);
	}
}
