package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends PageObject{
	
	public LogInPage (WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="login-form-email")
	WebElement userName;
	
	@FindBy (id="login-pass")
	WebElement pass;
	
	@FindBy (id="login-form-btn")
	WebElement buttonLogIn;
	
	@FindBy(css="div[class='v-messages__message']")
	List<WebElement> notificationsEmail;
	
	 @FindBy (className="body-2")
	WebElement invalidCredentials;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/div")
	WebElement invalideEmail;
	
	@FindBy(css="div[class='v-messages__message']")
	WebElement litlePass;
	
	@FindBy(css="div[class='v-messages__message']")
		WebElement longpass;
	
    @FindBy (css="h4[class='invoice-factory-header-title ml-3']")
	WebElement verficationHomePage;
	
	public void enterEmail(String email, String password)  {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-form-email")));
		userName.sendKeys(email);
		pass.sendKeys(password);
		
	}
	public void clickOnLogin() {
		buttonLogIn.click();
	}
	public String errormessageEmail() {
		return notificationsEmail.get(0).getText();
	}
	public String errormessagePass() {
		return notificationsEmail.get(1).getText();
	}
	 public boolean invalidCredDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(invalidCredentials));
        return invalidCredentials.isDisplayed();
	}
	public String invalidMessageEmail1() {
		return invalideEmail.getText();	
	}
	public String litlePassword() {
		return litlePass.getText();
	}
	public String longPassword() {
		wait.until(ExpectedConditions.visibilityOf(longpass));	
		return longpass.getText();
	}
	public void del(){
		userName.sendKeys(Keys.CONTROL, "a");
		userName.sendKeys(Keys.DELETE);
		pass.sendKeys(Keys.CONTROL, "a");
		pass.sendKeys(Keys.DELETE);
		
	}
	public boolean homePageVery() {
		wait.until(ExpectedConditions.visibilityOf(verficationHomePage));
		return verficationHomePage.isDisplayed();
		
	}

}
