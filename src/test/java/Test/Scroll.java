package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.MenuSelectionPage;
import io.appium.java_client.MobileBy;

@SuppressWarnings("deprecation")
public class Scroll extends ValidLoginTest {
	@Test(priority=13)
	public void ScrollDown() throws Throwable {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");	
		  Properties prop=new Properties();
		  prop.load(fis);	
		 // Thread.sleep(3000); 
		
		//Menu Selection 
		  MenuSelectionPage MSP = new MenuSelectionPage();
			MSP.Billing();
			String bill	= MSP.Billing.getText();
		//	Thread.sleep(2000);
			Assert.assertEquals(bill,"Billing");
			Reporter.log(bill, true);
		
		
	   //Customer adding
				AddNewCustomerPage ANC = new AddNewCustomerPage();

				ANC.AddNewCustomer();
				String cust	= ANC.AddNewCustomer.getText();
				//Thread.sleep(2000);
				Assert.assertEquals(cust,"Add New Customer");
				Reporter.log(cust, true);
			//	Thread.sleep(2000);
				String CName =  (String) prop.get("CustName");
				ANC.CustName(CName);
				String CMobile =  (String) prop.get("CustMobile");
				ANC.CustMobile(CMobile);
			//	Thread.sleep(5000);
		
		
		try {
		    String scrollableList="com.ns.mpos.nukkadshops:id/customTextView11";
		    String elementClassName="android.widget.TextView";
		    String anyText="Enable Customer for Loyalty Points";

		    driver.findElement(MobileBy.AndroidUIAutomator(
		                    "new UiScrollable(new UiSelector().description(\"" + scrollableList + "\")).getChildByText("
		                            + "new UiSelector().className(\"" + elementClassName + "\"), \"" + anyText + "\")"));
		    }catch (Exception e){
		            System.out.println("Cannot scroll further");
		}
	
		ANC.Loyalty();
		ANC.Save();
	}
	
	

}
