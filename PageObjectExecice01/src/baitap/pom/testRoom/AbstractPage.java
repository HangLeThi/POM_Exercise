package baitap.pom.testRoom;

import org.openqa.selenium.WebDriver;

//class AbstractPage chua hanh dong tro ve trang chu
//khai bao doi tuong webDriver thuoc doi tuong web driver
// de nhung doi tuong sau ke thua dc tu khoa driver thi pai khai bao tu khoa Protected
public class AbstractPage {
	protected WebDriver driver;

	// viet ham khoi tao
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}

	// hanh dong tro ve trang hompage
	public HomePage navigateToWebApp() {
		driver.navigate().to("http://thetestroom.com/webapp/index.html");
		 return new HomePage(driver);
	}

}
