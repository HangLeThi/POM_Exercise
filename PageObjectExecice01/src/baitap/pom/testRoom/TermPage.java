package baitap.pom.testRoom;

import org.openqa.selenium.WebDriver;

public class TermPage extends AbstractPage {

	public TermPage(WebDriver driver) {
		super(driver);
	}
public void closeTermPage(){
	driver.quit();
}
}
