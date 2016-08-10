package baitap.pom.testRoomExecution;

import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baitap.pom.testRoom.AboutPage;
import baitap.pom.testRoom.AdoptionPage;
import baitap.pom.testRoom.ContactPage;
import baitap.pom.testRoom.HomePage;
import baitap.pom.testRoom.TermPage;

public class TestRoomDemo {
	// khai bao doi tuong webdriver

	WebDriver driver;
	HomePage homePage;
	ContactPage contactPage;
	AdoptionPage adoptionPage;
	AboutPage aboutPage;
	TermPage termPage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"E:/SeleniumUsers/geckodriver-v0.10.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", 
	            //   "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		//driver =new ChromeDriver();
		homePage = new HomePage(driver);
		contactPage = new ContactPage(driver);
		adoptionPage = new AdoptionPage(driver);
		aboutPage = new AboutPage(driver);
		termPage=new TermPage(driver);
	}

	@Test
	public void TestSteps() throws InterruptedException {
		driver.get("http://thetestroom.com/webapp/index.html");
		driver.manage().window().maximize();
		homePage.navigationToContactPage();
		Thread.sleep(50);
		//contactPage.navigateToAdoptionPage();
		Thread.sleep(50);
		//adoptionPage.NavigateToAboutPage();
		//aboutPage.navigateToTermPage();
	
		//termPage.closeTermPage();
		//adoptionPage.NavigateToAboutPage();
		//Thread.sleep(50);
		//aboutPage.navigateToAdoptionPage();
		Thread.sleep(50);
		//adoptionPage.NavigateToContactPage();
		//Thread.sleep(50);
		// homePage.navigateToHomePage();
		// homePage.navigationToTermPage();
		// homePage.navigationToContactPage();
		contactPage.enterName("vdssdsdf");
		contactPage.enterAddress("gggg");
		contactPage.clickSendButton();
		//Thread.sleep(5);
		contactPage.navigateToHomePage();
		homePage.navigationToContactPage();
	}

		@Ignore
	public void end() {
		driver.quit();
	}
}
