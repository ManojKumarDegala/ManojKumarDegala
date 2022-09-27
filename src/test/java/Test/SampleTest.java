package Test;

	import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
	import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class SampleTest extends ValidLoginTest {

	  AndroidDriver driver;

//	  @BeforeTest
//	  public void setUp() throws MalformedURLException {
//	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//	    desiredCapabilities.setCapability("appium:Devicename", "sdk_gohone64_x86_64");
//	    desiredCapabilities.setCapability("appium:platformversion", "12");
//	    desiredCapabilities.setCapability("appium:platformName", "Android");
//	    desiredCapabilities.setCapability("appium:udid", "BYS3Y18B18001995");
//	    desiredCapabilities.setCapability("appium:automation name", "uiautomator2");
//	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
//
//	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//
//	    driver = new AppiumDriver(remoteUrl, desiredCapabilities);
//	  }

	  @Test
	  public void sampleTest() {
	//  driver.findElement(By.id("mPOS")).click();
	    
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
	   
	  driver.findElement(By.id("Open")).click();
	  
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]")).click();
	 
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.TextView")).click();
	 
	 driver.findElement(By.id("com.ns.mpos.nukkadshops:id/search_item_edt")).sendKeys("loose");
	    
	  
	 driver.findElement(By.id("com.ns.mpos.nukkadshops:id/customTextView28")).click();
	    
	 driver.findElement(By.id("com.ns.mpos.nukkadshops:id/bill_btn")).click();
	    
//	    MobileElement el9 = (MobileElement) driver.findElementById("android:id/button1");
//	    el9.click();
//	    MobileElement el10 = (MobileElement) driver.findElementById("com.ns.mpos.nukkadshops:id/complete_without_print_btn");
//	    el10.click();
//	    MobileElement el11 = (MobileElement) driver.findElementById("com.ns.mpos.nukkadshops:id/save_btn");
//	    el11.click();
//	    MobileElement el12 = (MobileElement) driver.findElementById("com.ns.mpos.nukkadshops:id/complete_without_print_btn");
//	    el12.click();
//	    MobileElement el13 = (MobileElement) driver.findElementById("com.ns.mpos.nukkadshops:id/skip_btn");
//	    el13.click();
//	    MobileElement el14 = (MobileElement) driver.findElementById("com.ns.mpos.nukkadshops:id/done_btn");
//	    el14.click();
	  }

//	  @AfterTest
//	  public void tearDown() {
//	    driver.quit();
//	  }
	}



