package Mccm.Pega.DMPRealTime.PegaTest;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Mccm.Pega.DMP.RealTime.LoginPageDMPRealTime;
import Mccm.Pega.DMP.RealTime.PegaMarktDMPRealTime;
import Mccm.Pega.Outbound.PegaMain.HomePage;
import Mccm.Pega.Outbound.PegaMain.HomePageDetails;
import Mccm.Pega.Outbound.PegaMain.LoginPage;
import Mccm.Pega.Outbound.PegaTestBase.TestBase;
import Mccm.Pega.QAUtil.TestUtil;

public class PegamarktDMPrealtimeTest extends TestBase {

	private static final String priorty = null;

	LoginPageDMPRealTime loginpageDMPrealtime;
	PegaMarktDMPRealTime pegamarktDMPrealtime;
	TestUtil testutil;
	HomePage  homepage;
	LoginPage loginpage;


	public PegamarktDMPrealtimeTest()
	{
		super();
	}
	@BeforeMethod

	public void setup() throws InterruptedException {
		initialization();
		loginpageDMPrealtime = new LoginPageDMPRealTime();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));  
		//  pegamarktDMPrealtime = loginpageDMPrealtime.login(prop.getProperty("username"), prop.getProperty("password")); 
		testutil=new TestUtil();
		pegamarktDMPrealtime  = new PegaMarktDMPRealTime();
	//	pegamarktDMPrealtime=loginpageDMPrealtime.Pegamrklunch3();
		 driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);

	}



	@Test (priority=1)
	public void VerifyDMPrealtimeRunSuccessfully() throws InterruptedException, AWTException { 

		loginpageDMPrealtime.Pegamrklunch3();
		pegamarktDMPrealtime.pegamarkting();
		testutil.WindowHandling();
		 driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		pegamarktDMPrealtime.ExpandPegMrkPage1();
		pegamarktDMPrealtime.CampaignImage();
		pegamarktDMPrealtime.Campaigns();
		testutil.SwitcToFrame(1);
		testutil.RobertAction();
		pegamarktDMPrealtime.Create();
		pegamarktDMPrealtime.MultiChannelCampaign(); 
		testutil.SwitcTodefaultContent();
		testutil.SwitcToFrame(2);
		pegamarktDMPrealtime.Campaigncode();
		pegamarktDMPrealtime.Build();
		pegamarktDMPrealtime.MrktStrtgyConfig();
		pegamarktDMPrealtime.SrchMrkStrtgy();
		pegamarktDMPrealtime.AddMrkStrtgy();
		pegamarktDMPrealtime.Applay();
		pegamarktDMPrealtime.javaexictor2();
		pegamarktDMPrealtime.Engagementconfig();
		pegamarktDMPrealtime.Realtimecontainers();
		pegamarktDMPrealtime.Calender();
		pegamarktDMPrealtime.Currentdate();
		pegamarktDMPrealtime.ConfigureContainers();
		pegamarktDMPrealtime.SrchConfigEngagment();
		pegamarktDMPrealtime.AddConfigureContainers();
		pegamarktDMPrealtime.Javascriptserch();
		pegamarktDMPrealtime.ApplayEngagement();
		pegamarktDMPrealtime.SaveCampgn();
		pegamarktDMPrealtime.RunCampgn();
		pegamarktDMPrealtime.ConfirmCampgn();
		// pegamarktDMPrealtime.RefreshCampgn();

	}
	@AfterMethod

	public void teardown() {

	   driver.quit();


		System.out.println("DMP Real Time Containers Test Cases Executed");
	}

}
