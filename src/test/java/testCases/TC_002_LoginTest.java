package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;


public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void test_Login()
	{
		logger.info("Starting TC_002_LoginTest");
		
		try
		{				
			Homepage hp=new Homepage(driver);
			logger.info("*** clicked on home page***");
			hp.clickkmyaccount();
			logger.info("*** clicked on my account***");			
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			logger.info("*** providing login datails***");
			lp.setEmail(rb.getString("email")); // valid email, get it from properties file
			
			lp.setPassword(rb.getString("password")); // valid password, get it from properties file
			
			lp.clickLogin();
			
			MyAccountPage macc=new MyAccountPage(driver);
			
			boolean targetpage=macc.isMyAccountPageExists();
						
			Assert.assertEquals(targetpage, true,"invalid login data");
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");
		
	}
	
	
}


