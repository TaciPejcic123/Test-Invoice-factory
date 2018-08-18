package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.EditDelPreviwe;


public class EditDelPreviweTest extends TestNG {
  @Test(priority=14)
  public void editInvoice() throws InterruptedException {
	  EditDelPreviwe editDelPre= new  EditDelPreviwe(driver);
	  
	  editDelPre.clickOptionsButton();
	  editDelPre.editIvoice();
	 // editDelPre.newService();
	  editDelPre.writeNewService("Naplata");
	  editDelPre.writeNewNote("Usluge dostave");
	  editDelPre.enterDays("5");
	  editDelPre.enterratePerHour("1000");
	  //Thread.sleep(2000);
	  editDelPre.saveEdit();
	  Assert.assertTrue(editDelPre.editMessageIsDisplay());  
  }
  @Test(priority=15)
  public void chekpreview() {
	  EditDelPreviwe editDelPre= new  EditDelPreviwe(driver);
	  editDelPre.clickOptionsButton();
	  editDelPre.clickPreview();
	  editDelPre.previewmessageIsDisplay();
	  editDelPre.back();
	  
  }
  @Test (priority=16)
  public void deleteInvic() throws InterruptedException {
	  EditDelPreviwe editDelPre= new  EditDelPreviwe(driver);
	Thread.sleep(2000);
	  editDelPre.clickOptionsButton();
	  editDelPre.delMessage();
	  
	  
  }
}
