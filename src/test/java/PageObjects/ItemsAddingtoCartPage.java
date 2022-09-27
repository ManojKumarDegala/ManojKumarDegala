package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class ItemsAddingtoCartPage {
	AndroidDriver driver;
	
	public ItemsAddingtoCartPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}

	@FindBy(id="com.ns.mpos.nukkadshops:id/search_item_edt")
	public WebElement Item;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/customTextView28")
	public WebElement selectitem;
	
	
	
	public void ItemsSearchBar(String ItemName) {
		Item.sendKeys(ItemName);
	}
	
	public void SelectItem() {
		selectitem.click();
	}
	
	public void ItemsSearchbar(String Item) throws Throwable {
		Reporter.log("Item Searching Started", true);
		ItemsSearchBar(Item);
		Reporter.log("Item clicked Successfully", true);
//		Actions act = new Actions(driver);
//		act.moveToElement(selectitem).click().build().perform();
	    SelectItem();
	    Reporter.log("Item added Successfully", true);
	}
	

	
}
	
	
	


