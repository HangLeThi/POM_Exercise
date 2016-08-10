package baitap.pom.testRoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdoptionPage extends AbstractPage {

	public AdoptionPage(WebDriver driver) {
		super(driver);

	}

	public AdoptionPage NavigateAdoptionPage() {
		driver.navigate().to("http://thetestroom.com/webapp/adoption.html");
		return new AdoptionPage(driver);
	}

	public ContactPage NavigateToContactPage() {
		driver.findElement(By.name("nav_contact")).click();
		return new ContactPage(driver);
	}

	public AboutPage NavigateToAboutPage() {
		driver.findElement(By.name("nav_about")).click();
		return new AboutPage(driver);
	}
}
