package baitap.pom.testRoom;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	public Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	public HomePage(WebDriver driver) {
		super(driver);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	}

	// ***xay dung nhung step tren trang homepage
	// khai bao phuong thuc den contact page
	public ContactPage navigationToContactPage() {
		APP_LOGS.debug("[info] Excecuting: |open contact Page");
		driver.findElement(By.name("nav_contact")).click();
		return new ContactPage(driver);
	}

	public AdoptionPage navigationToAdoptionPage() {
		driver.findElement(By.id("adoption_link")).click();
		return new AdoptionPage(driver);
	}

	public TermPage navigationToTermPage() {
		driver.findElement(By.id("footer_term")).click();
		return new TermPage(driver);
	}
}
