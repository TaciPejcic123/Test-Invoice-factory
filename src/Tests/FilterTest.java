package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Filter;

public class FilterTest extends TestNG {
  @Test(priority=17)//there is not invois with this name
  public void selectClientInvalid() {
	  Filter selectC=new Filter(driver);
	  selectC.clickClient();
	  selectC.chooseClientInvalid();
	  Assert.assertTrue(selectC.messageIsDisplay());    
  }
  @Test(priority=17)
  public void selectClientValid() {
	  Filter selectC=new Filter(driver);
	  selectC.clickClient();
	  selectC.chooseClientValid();
	  Assert. assertEquals(selectC.validSearchInvoice(),"Jox Joxi");
  }
	  @Test(priority=18)
	  public void refrechOption() {
		  Filter selectC=new Filter(driver);
		  selectC.refrech();
	  }
	  @Test(priority=19)
	  public void thisMonthPeriod() {
		  Filter selectC=new Filter(driver);
		  selectC.period();
		  selectC.thisMonthPeriod();
		  Assert.assertTrue(selectC.messageIsDisplay());
		  selectC.period();
		  selectC.lastMonthPeriod();
		  selectC.period();
		  selectC.resetDatesPeriod();
		  
		  
	  }
  
}
