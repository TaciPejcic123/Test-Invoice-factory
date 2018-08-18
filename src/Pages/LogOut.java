package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut extends PageObject {
	
	public LogOut (WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"navbar-logout\"]")
	WebElement navbarLogOut;
	
	@FindBy(css="#navbar-logout-btn > div")
	WebElement clickLogOut;
	
	
	public void clickNavbar() {
		navbarLogOut.click();
	}
	public void clickLogOut() {
		clickLogOut.click();
	}

}
