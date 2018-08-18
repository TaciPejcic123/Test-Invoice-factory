package Pages;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Filter extends PageObject {
	public Filter(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="div[role='combobox'] label[for='filter-client']")
	      
	WebElement selectClient;

	@FindBy(css="div[class*='active'] a[class*='v-list']")
	List<WebElement> clickClients;
	
	@FindBy(xpath ="//*[contains(text(),'Jox Joxi')]")
	WebElement joxJoxi;
	
	 @FindBy(xpath="//*[@id=\"app\"]/div[12]/main/div/div/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[1]/div")
	 WebElement fDate;
	@FindBy(css="button[id='inv-status-btn-2018-SEDrtyr2']")
	WebElement status;
	
	@FindBy(css="#app > div.application--wrap > main > div > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > div")
		WebElement noInvoicemessage;
	
	@FindBy(css="#inv-client-2018-SRR1")
	WebElement validSarch;
	@FindBy (css="button[id='filter-reset']>.v-btn__content>i[data-v-6fb6e43e]")
	WebElement refrechButton;
	
	@FindBy(css="button[id='filter-period']>.v-btn__content>i[aria-hidden='true']")
	WebElement filterPeriod;
	
	@FindBy(css="button[id='this-month']>.v-btn__content")
	WebElement thisMonth;
	@FindBy(css="button[id='last-month']>.v-btn__content")
	WebElement lastMonth;
	@FindBy(css="button[id='reset-dates']>.v-btn__content")
	WebElement resetDates;
	
	
	
	public void clickClient() {
		wait.until(ExpectedConditions.visibilityOf(selectClient));
		selectClient.click();	
	}
	public void chooseClientInvalid() {
		clickClients.get(2).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		public boolean messageIsDisplay() {
        	wait.until(ExpectedConditions.visibilityOf(noInvoicemessage));
        	 return noInvoicemessage.isDisplayed();
        }
		public void chooseClientValid() {
			clickClients.get(5).click();
		}
		public String validSearchInvoice() {
			return  validSarch.getText();
		}
		
		public void refrech() {
			refrechButton.click();
		}
		
		public void period()  {
			
			filterPeriod.click();
		}
		public void thisMonthPeriod(){
			
			thisMonth.click();
		}
		public void lastMonthPeriod() {
			lastMonth.click();
		}
		
		public void resetDatesPeriod() {
			resetDates.click();
		}
}
	
	



