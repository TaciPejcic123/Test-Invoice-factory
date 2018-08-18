package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LogInPage;

public class LogInPageTest extends TestNG {

	@Test(priority = 0)

	public void withOutData() throws InterruptedException {
		LogInPage logIn = new LogInPage(driver);
		driver.get("http://app.invoice-factory.source-code.rs");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.errormessageEmail(), "The email field is required.");
	    Assert. assertEquals(logIn.errormessagePass(),"The password field is required."); 

	}

	@Test(priority = 1)
	public void correctEmail() {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterEmail("tacipejcic@gmail.com", "sdsdfsa");
		logIn.clickOnLogin();
		Assert.assertTrue(logIn.invalidCredDisplayed());

	}

	@Test(priority = 2)
	public void corectPass() {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterEmail("taci@.gmail.com", "qwe123");
		logIn.clickOnLogin();
		Assert.assertTrue(logIn.invalidCredDisplayed());
	}

	@Test(priority = 3)
	public void invalideEmail1() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail("tacipejcicgmail.com", "qwe123");
		logIn.clickOnLogin();
		Assert.assertTrue(logIn.invalidCredDisplayed());

	}

	@Test(priority = 4)
	public void invalideEmail2() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail("tacipejcicATgmail.com", "qwe123");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.invalidMessageEmail1(), "The email field must be a valid email.");

	}

	@Test(priority = 5)
	public void spaceEmail() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail(" tacipejcicATgmail.com", " qwe123");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.invalidMessageEmail1(), "The email field must be a valid email.");

	}

	@Test(priority = 6)
	public void emailWithoutCom() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail(" tacipejcic@gmail", "qwe123");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.invalidMessageEmail1(), "The email field must be a valid email.");

	}

	@Test(priority = 7)
	public void emailWithoutGmail() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail(" tacipejcic@.com", "qwe123");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.invalidMessageEmail1(), "The email field must be a valid email.");

	}

	@Test(priority = 8)
	public void emailWithSpecialChar() {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail(" tacipe#$*jcic@gmail.com", "qwe123");
		logIn.clickOnLogin();
		Assert.assertEquals(logIn.invalidMessageEmail1(), "The email field must be a valid email.");

	}
	 @Test (priority=9)
	 public void shorterPass() {
	 LogInPage logIn=new LogInPage(driver);
	 logIn.del();
	 logIn.enterEmail("tacipejcic@gmail.com", "qwe12");
	 logIn.clickOnLogin();
	 Assert.assertEquals(logIn.litlePassword(),"The password field must be at least 6 characters.");
	
	 }
	 @Test (priority=10)
	 public void longPass() {
	 LogInPage logIn=new LogInPage(driver);
	 logIn.del(); 
	 logIn.enterEmail("tacipejcic@gmail.com", "qwe12trbfjkdfkjrtreei839ukdgjfk");
	 logIn.clickOnLogin();
	 Assert.assertEquals(logIn.longPassword(),"The password field may not be greater than 20 characters.");
	
	 }

	@Test(priority = 11)

	public void happyLog() throws InterruptedException {
		LogInPage logIn = new LogInPage(driver);
		logIn.del();
		logIn.enterEmail("", "");
		logIn.clickOnLogin();
		Assert.assertTrue(logIn.homePageVery());

	}

}
