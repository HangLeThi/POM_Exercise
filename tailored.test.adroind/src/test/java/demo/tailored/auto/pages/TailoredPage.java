package demo.tailored.auto.pages;

import javax.inject.Inject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://tailored.to/en-gb")
public class TailoredPage extends PageObject {

	protected WebDriver driver;

	@Inject 
	public TailoredPage(WebDriver driver) {
		this.driver=driver;
		
	}

	@Test
	public void click_on_Ok_button() {
		driver.findElement(By.className("icon-text__content")).click();
	}

	@Test
	public void click_on_headPhones() {
		driver.findElement(By.className("home-page__item-info")).click();
	}

	@Test
	public void select_an_option(String Element) {
		driver.findElement(By.xpath(Element)).click();
	}

	@Test
	public void click_on_button(String Button) {
		driver.findElement(By.xpath(Button)).click();

	}

}
