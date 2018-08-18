package Tests;

import org.testng.annotations.Test;




import Pages.LogOut;

public class LogOutTest extends TestNG {
	
  @Test(priority=20)
  public void logOutTest() {
	  LogOut logOut=new LogOut (driver);
	  logOut.clickNavbar();
	  logOut.clickLogOut();
  }
}
