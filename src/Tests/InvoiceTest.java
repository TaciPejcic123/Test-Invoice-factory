package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Invoice;

public class InvoiceTest extends TestNG {
  @Test(priority=12)
  public void emptyInvoice() throws InterruptedException {
	  
	  Invoice invoice=new Invoice(driver);
	  Thread.sleep(2000);
	  invoice.clickOnAddInvoice();
	  Thread.sleep(2000);
	  invoice.clickOnSave();
	  Assert.assertEquals(invoice.selectError(), "The client field is required.");
	  Assert.assertEquals(invoice.fromError(), "The business field is required.");
	  Assert.assertEquals(invoice.invoiceError(), "The Invoice number field is required.");
	  Assert.assertEquals(invoice.basisError(), "The Basis field is required.");
	  Assert.assertEquals(invoice.currencyError(), "The currency field is required.");
	  Assert.assertEquals(invoice.selectBuisnessError(), "The bank field is required.");
	  
  }
  @Test(priority=13)
  public void fillInInvoice() throws InterruptedException {
	  Invoice invoiceFill=new Invoice(driver);
	  
	  invoiceFill.draft();
	  invoiceFill.paidField();
	  invoiceFill.to();
	  invoiceFill.clckOnDanica();
	  invoiceFill.from();
	  invoiceFill.clickOnViaka();
	  invoiceFill.currency();
	  invoiceFill.clickOnCurrency();
	  Thread.sleep(3000);
	  invoiceFill.bank();
	  invoiceFill.clickOnBank();
	  invoiceFill.serialNumberInvoice("34567");
	  invoiceFill.basisInvoice("prekovremeni rad");
	  invoiceFill.titleInvoice();
	  invoiceFill.titleEnter("Mala basta cveca");
	  invoiceFill.newService();
	  invoiceFill.writeNewService("Naplata");
	  invoiceFill.writeNewNote("Usluge dostave");
	  invoiceFill.enterDays("5");
	  invoiceFill.enterratePerHour("1000");
	  invoiceFill.clickOnSave();
	  Assert.assertTrue(invoiceFill.saveMessageIsDisplay());  
	  
	  //treba verifikacija da je sacuvan pomocu poruke koja se prikaza
	  
  }
}
