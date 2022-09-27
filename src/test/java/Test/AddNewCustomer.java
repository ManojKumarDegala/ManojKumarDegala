package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import PageObjects.AddNewCustomerPage;
import PageObjects.MenuSelectionPage;

public class AddNewCustomer extends ValidLoginTest{
	
	@Test(priority=4)
	public void AddnewCust() throws Throwable{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");	
		  Properties prop=new Properties();
		  prop.load(fis);	
		 
		
		//Menu Selection 
		  MenuSelectionPage MSP = new MenuSelectionPage();
			MSP.Billing();
			String bill	= MSP.Billing.getText();
			Assert.assertEquals(bill,"Billing");
			Reporter.log(bill, true);
		
		
	   //Customer adding
				AddNewCustomerPage ANC = new AddNewCustomerPage();

				ANC.AddNewCustomer();
				String cust	= ANC.AddNewCustomer.getText();
				Assert.assertEquals(cust,"Add New Customer");
				Reporter.log(cust, true);
				String CName =  (String) prop.get("CustName");
				ANC.CustName(CName);
				String CMobile =  (String) prop.get("CustMobile");
				ANC.CustMobile(CMobile);
//            AndroidBy list= (AndroidBy)driver.findElement(By.id("com.ns.mpos.nukkadshops:id/customTextView21"));
//			@SuppressWarnings("deprecation")
//			AndroidBy	Listitem =(AndroidBy)driver.findElement(MobileBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"Address\"));"));
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				HashMap<String, String> scrollObject = new HashMap<String, String>();
//				scrollObject.put("direction", "down");
//				//scrollObject.put("element", ((RemoteWebElement) element).getId());
//				js.executeScript("mobile: scroll", scrollObject);
			
				
			//	System.out.println(Listitem.getLocation());
			//	Listitem.click();
			//	ANC.Loyalty();
				ANC.Save();
	}	
		
}


