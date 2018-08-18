package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditDelPreviwe extends PageObject {
	public  EditDelPreviwe(WebDriver driver) {
		super (driver);
	}
	@FindBy(css="#app > div.application--wrap > main > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div.flex.xs1 > div > div.v-menu.v-menu--inline > div>button[type='button']")
			//"button[id='context-293']")
	WebElement optionsButton;
	
	@FindBy(css="div[class*='active'] a[id*='context-edit']")	
	WebElement clickOnEdit;
	
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
	
	@FindBy(id="inv-form-save-btn")
	WebElement editSave;
	@FindBy (css=".v-alert.success div")
	WebElement editMessage;
	
	@FindBy(css="div[class*='active'] a[id*='context-preview']")
	WebElement preview;
    @FindBy(css="div[class='v-toolbar__title']")
    WebElement previewMessage;
    
    @FindBy(css="div[class*='menuable__content__active'] div[class*='activator'] button div")
    List <WebElement> deletInvoice;
    @FindBy(css="div[class*='active'] div[class*='confirm-delete-dialog'] div[class|='v-card__actions'] button[id*='yes']")
    WebElement confurmDel;
   
    @FindBy(xpath="//*[@id=\"app\"]/div[8]/div/div/nav/div/a/div/i") 
    WebElement backPreview;
	
	public void clickOptionsButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id*='context']")));
		optionsButton.click();
	}
	public void editIvoice() {
		clickOnEdit.click();
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
	public void saveEdit() {
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("editSave")));
		editSave.click();
		}
	public boolean editMessageIsDisplay() {
		wait.until(ExpectedConditions.visibilityOf(editMessage));
        return editMessage.isDisplayed();
	}
    public void clickPreview() {
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*='active'] a[id*='context-preview']")));
        	preview.click();
        }
    public boolean previewmessageIsDisplay() {
        	wait.until(ExpectedConditions.visibilityOf(previewMessage));
        	 return previewMessage.isDisplayed();
        	
        }
        
    public void delMessage() throws InterruptedException {
        	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*='flex'] button[id*='context-delete']")));
		    Thread.sleep(1000);
        	deletInvoice.get(0).click();
        	Thread.sleep(1000);
        	confurmDel.click();
        	
        }
    public void back() {
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='v-btn__content']>i[data-v-4d40556a]")));
        	 backPreview.click();
        	
        }
        
}

