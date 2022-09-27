package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.BaseClass;

public class TransactionsPage {
	public TransactionsPage() {
		
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	@FindBy(xpath = "//*[@text='CR/2223/001']")
	public WebElement OrderNo;
	
	@FindBy(xpath = "//*[@text='Refund']")
	public WebElement Refund;
	
	@FindBy(xpath = "//*[@text='Cancel']")
	public WebElement Cancel;
	
	@FindBy(xpath = "//*[@text='Details']")
	public WebElement Details;
	
	
	

}
