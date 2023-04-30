package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistationPage;
import PageObjects.Homepage;

public class TC_001_AccountRegistationTest extends BaseClass {

@Test(groups= {"Regression","Master"})

   void test_accountregistation()
   {
	logger.debug("Applications logs......");
	logger.info("*** starting TC_001_AccountRegistationTest ***");
	try
	{
	Homepage hp=new Homepage(driver);
	hp.clickkmyaccount();
	logger.info("*** clicked on my account ***");
	hp.clickmyregistaion();
	logger.info("*** clicked on my registation ***");
	AccountRegistationPage regpage=new AccountRegistationPage(driver);
	logger.info("*** providing customer data ***");
	regpage.setFirstName(randomeString().toUpperCase());
	
	regpage.setLastName(randomeString().toUpperCase());
	
	regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
	
	
	//String password=("test@123");
	//regpage.setPassword("test@123");
	regpage.setPassword( randomAlphaNumeric());
	
	regpage.setPrivacyPolicy();
	logger.info("*** clicked on Continue ***");
	regpage.clickContinue();
	
	String confmsg=regpage.getConfirmationMsg();
	logger.info("*** checking conformation message ***");
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	catch(Exception e)
	{
		logger.error("*** test fail ***");
		Assert.fail();
	}
	logger.info("*** finished TC_001_AccountRegistationTest ***");
	
}
	
	
   }

