package Pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Invoice extends PageObject {
	
	public  Invoice (WebDriver driver) {
		super (driver);
	}
	
	@FindBy(id="add-new-invoice")
	WebElement addButton;
	
	@FindBy(css="button[id='inv-form-save-btn']")
	WebElement saveButton;
	
	@FindBy(css="div[class='v-messages__message']")
	List<WebElement> requiredMessage;
	
	@FindBy(css="div[class='flex ml-2 display-1']>strong[id='click-to-enter']")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[9]/main/div/div/div/div[1]/form/div[1]/div[1]/div")
	WebElement enterTitle;
	
	@FindBy(css="div[class='v-select__selections']")
	List<WebElement> dropDown;
	
	@FindBy(xpath ="//*[contains(text(),'Paid')]")
	WebElement paid;
	
	@FindBy(xpath ="//*[contains(text(),'Danica')]")
	WebElement toDanica;
	
	@FindBy(xpath ="//*[contains(text(),'Viaka Solutions')]")
	WebElement fromViaka;
	
	@FindBy(xpath ="//*[contains(text(),'Dinar')]")
	WebElement currencyDinar;
	
	@FindBy(css="label[for='inv-form-select-bank']")
	WebElement bank;
	
	@FindBy(xpath ="//*[contains(text(),'Kes banka')]")
	WebElement selectBank;
	
	@FindBy(id="inv-form-number")
	WebElement brInvoice;
	
	@FindBy(id="inv-form-basis")
	WebElement basis;
	
	@FindBy(id="add-content-btn")
	WebElement addNewService;
	
	@FindBy(id="inv-form-service-0")
	WebElement service;
	
	@FindBy(id="inv-form-note-0")
	WebElement note;
	
	@FindBy(id="inv-form-days-0")
	WebElement days;
	
	@FindBy(id="inv-form-hours-0")
	WebElement hours;
	
	@FindBy(id="inv-form-hours-0")
	WebElement ratePerHour;
	
	@FindBy (css=".v-alert.success div")
	WebElement saveMessage;
	
	
	public void clickOnAddInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(addButton));
		addButton.click();
		
	}
		public String selectError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(0).getText();
	}
	public String fromError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(1).getText();
	}
	public String invoiceError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(2).getText();
	}
	public String basisError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(3).getText();
	}
	public String currencyError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(4).getText();
	}
	public String selectBuisnessError() {
		wait.until(ExpectedConditions.visibilityOfAllElements(requiredMessage));
		return requiredMessage.get(5).getText();
	}
	public void draft() {
		wait.until(ExpectedConditions.visibilityOfAllElements(dropDown));
		dropDown.get(0).click();	
	}
	public void paidField() {
		paid.click();	
	}
	public void to() {
		wait.until(ExpectedConditions.visibilityOfAllElements(dropDown));
		dropDown.get(1).click();	
	}
	public void clckOnDanica() {
		toDanica.click();	
	}
	public void from() {
		wait.until(ExpectedConditions.visibilityOfAllElements(dropDown));
		dropDown.get(2).click();
	}
	public void clickOnViaka() {
		fromViaka.click();
	}
	public void currency() {
		wait.until(ExpectedConditions.visibilityOfAllElements(dropDown));
		dropDown.get(3).click();
	}
	public void clickOnCurrency() {
		currencyDinar.click();
	}
	public void bank() {
	wait.until(ExpectedConditions.elementToBeClickable(bank));
		bank.click();
	}
	public void clickOnBank() {
		wait.until(ExpectedConditions.visibilityOfAllElements(dropDown));
		selectBank.click();
	}
	public void serialNumberInvoice(String number) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inv-form-number")));
//		brInvoice.sendKeys(Keys.CONTROL, "a");
//		brInvoice.sendKeys(Keys.DELETE);
		brInvoice.sendKeys(number);
		}
	public void basisInvoice(String note) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inv-form-basis")));
		basis.sendKeys(Keys.CONTROL, "a");
		basis.sendKeys(Keys.DELETE);
		basis.sendKeys(note);
		}
	public void titleInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();
	}
	public void titleEnter(String titleNew) {
	
		enterTitle.sendKeys(titleNew);		
	}
	public void newService() {
		addNewService.click();
	}
	public void writeNewService(String nameService) {
		service.click();
		service.clear();
		service.sendKeys(nameService);	
	}
	public void writeNewNote(String contentNote) {
		note.click();
		note.sendKeys(Keys.CONTROL, "a");
		note.sendKeys(Keys.DELETE);
		note.sendKeys(contentNote);	
	}
	public void enterDays(String contentDays) {
		days.click();
		days.sendKeys(Keys.CONTROL, "a");
		days.sendKeys(Keys.DELETE);
		days.sendKeys(contentDays);
	}

	public void enterratePerHour(String contentratePerHour) {
		ratePerHour.click();
		ratePerHour.sendKeys(Keys.CONTROL, "a");
		ratePerHour.sendKeys(Keys.DELETE);
		ratePerHour.sendKeys(contentratePerHour);
	}
	public void clickOnSave() {
		//wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
		
	}
	public boolean saveMessageIsDisplay() {
		wait.until(ExpectedConditions.visibilityOf(saveMessage));
        return saveMessage.isDisplayed();
	}
}
