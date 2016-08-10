package baitap.pom.testRoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends AbstractPage {

	public AboutPage(WebDriver driver) {
		super(driver);
	}

	public AdoptionPage navigateToAdoptionPage() {
		driver.findElement(By.id("adoption_link")).click();
		return new AdoptionPage(driver);
	}

	public TermPage navigateToTermPage() {
		driver.findElement(By.id("footer_term")).click();
		return new TermPage(driver);
	}
}
