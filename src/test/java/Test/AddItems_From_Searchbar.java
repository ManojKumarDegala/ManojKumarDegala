package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.ItemsAddingtoCartPage;
import PageObjects.MenuSelectionPage;
import io.appium.java_client.android.AndroidDriver;

public class AddItems_From_Searchbar extends ValidLoginTest{
	AndroidDriver driver;
	@Test(priority=6)
	public void Itemsfromsearchbar() throws Throwable {
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
		    ANC.Save();
	
	//Item Adding from QuickItems
//		QuickItemsPage Q = new QuickItemsPage();
//		Q.QuickItems();

	
   //Items Adding from SearchBar    
	    ItemsAddingtoCartPage IAC = new ItemsAddingtoCartPage();
	    String Item =  (String) prop.get("ItemName");
	    IAC.ItemsSearchBar(Item);
	   
	    

	
   
	}
}
