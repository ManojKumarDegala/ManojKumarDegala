package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.BaseClass;

public class GrnPage {
	
	public GrnPage(){
		
		PageFactory.initElements(BaseClass.driver, this);
			
	}
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
  public WebElement ManageInventory;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[3]/android.widget.TextView")
  public WebElement GRN;
  
  @FindBy(id= "com.ns.mpos.nukkadshops:id/menu_add_grn")
  public WebElement ADDGRN;
  
  @FindBy(id= "com.ns.mpos.nukkadshops:id/invoice_number_edt")
  public WebElement invoice_number;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/invoice_date_layout")
  public WebElement invoice_date;
  
  @FindBy(xpath="//android.view.View[@content-desc=\"02 September 2022\"]")
  public WebElement Select_date;
  
  @FindBy(id="android:id/button1")
  public WebElement OK;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/po_available_checkbox")
  public WebElement Po_availbox;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/enter_po_edt")
  public WebElement Po_edit;
  
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/gst_type_edt")
  public WebElement GSTtype;
  
  @FindBy(xpath="\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout")
  public WebElement SelectGST;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/supplier_name_edt")
  public WebElement Supplier;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/edit_text")
  public WebElement Select_Supplier;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
  public WebElement Select_Supplier_Name;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/next_button")
  public WebElement Next_button;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/fab_search_item")
  public WebElement Search_items;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/add_new_item_btn")
  public WebElement Add_new_item_btn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/food_check_box")
  public WebElement Food_check_box;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/loose_check_box")
  public WebElement Loose_check_box;
  
  
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/app_compact_auto_complete_textview_category")
  public WebElement Category;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
  public WebElement Select_Category;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/app_compact_auto_complete_textview_sub_category")
  public WebElement SubCategory;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
  public WebElement Select_SubCategory;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/go")
  public WebElement Go;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.View")
  public WebElement Select_Product;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/qty")
  public WebElement QTY;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cp_excl")
  public WebElement CP_Excl;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cp_incl")
  public WebElement CP_Incl;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/qty")
  public WebElement Qty;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/free_qty")
  public WebElement Free_Qty;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/scheme_disc_per")
  public WebElement Scheme_DiscountPer;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/scheme_disc_amt")
  public WebElement Scheme_DiscountAmt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/key_disc_per")
  public WebElement Key_disc_per;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/key_disc_amt")
  public WebElement Key_disc_amt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cash_disc_per")
  public WebElement Cash_disc_per;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cash_disc_amt")
  public WebElement Cash_disc_amt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/toal_discount")
  public WebElement Total_discount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/taxable_amt")
  public WebElement Taxable_amt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/tax_amt")
  public WebElement Tax_amt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cess")
  public WebElement Cess;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/total_excl")
  public WebElement TotalAmount_Excl;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/total_incl")
  public WebElement TotalAmount_incl;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/next_button")
  public WebElement Next_btn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/mrp_edt")
  public WebElement Mrp_edit;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/sp_edt")
  public WebElement Sp_edt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/wsp_price")
  public WebElement Wsp_price;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/special_price")
  public WebElement Special_Price;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_sp_discount")
  public WebElement Markdown_sp_discount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_sp_rupees")
  public WebElement Markdown_sp_rupees;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_wsp_discount")
  public WebElement Markdown_wsp_discount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_wsp_rupees")
  public WebElement Markdown_wsp_rupees;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_special_price_discount")
  public WebElement Markdown_Spl_price_discount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/markdown_special_price_rupees")
  public WebElement Markdown_Spl_price_rupees;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/online_check")
  public WebElement CheckBox;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/barcode")
  public WebElement Barcode;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/prev_button")
  public WebElement Previous_btn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/next_button")
  public WebElement Next_butn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/expiry_date_tv")
  public WebElement Expire_date;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/cal_expiry")
  public WebElement Cal_expiry_date;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/packed_date")
  public WebElement Packed_date;
  
  @FindBy(xpath="//android.view.View[@content-desc=\"08 September 2022\"]")
  public WebElement Select_packed_date;
  
  @FindBy(id="android:id/button1")
  public WebElement Ok_btn_Packed_dt;
  
  @FindBy(id="android:id/button2")
  public WebElement Cancel_btn_Packed_dt;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/duration")
  public WebElement Duration;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/time_period_spinner")
  public WebElement Time_period;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout")
  public WebElement Days;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/expiry_cal_save_btn")
  public WebElement Expiry_cal_Svbtn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/batch_no")
  public WebElement Batch_no;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/save_button")
  public WebElement Save_butn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/prev_button")
  public WebElement Previous_bttn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/additional_disc1")
  public WebElement Add_disc1;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/additional_disc2")
  public WebElement Add_disc2;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/total_discount_key")
  public WebElement Total_dic_key;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/amount_paid_key")
  public WebElement Amount_Paid_key;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/other_expenses_amount_paid_key")
  public WebElement Other_Expen_amt_paid;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/select_payment")
  public WebElement Select_payment_mode;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/payment_modes_spinner")
  public WebElement Select_payment_type;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
  public WebElement Cash;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/amount_edit")
  public WebElement Enter_amount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/date_edit")
  public WebElement Select_Paymt_date;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/notes_edit")
  public WebElement Notes;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/select_other_expenses")
  public WebElement Other_expenses;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/autoComplete")
  public WebElement Types_other_expenses;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/amount_edt")
  public WebElement Enter_Amount;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/fab_add")
  public WebElement Add_button;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/save_button")
  public WebElement Save_btn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/complete_button")
  public WebElement Complete_Btn;
  
  @FindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Pending GRN\"]/android.widget.TextView")
  public WebElement Pending_grn;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/date_filter_icon")
  public WebElement Date_filter;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
  public WebElement Today;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
  public WebElement Yestarday;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
  public WebElement Thisweek;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout")
  public WebElement Thismonth;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout")
  public WebElement Custom;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/month_navigation_previous")
  public WebElement Previous_month;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/month_navigation_next")
  public WebElement Next_month;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/confirm_button")
  public WebElement Confirm_button;
  
  @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/android.view.ViewGroup")
  public WebElement Tapon_List;
  
  @FindBy(id="com.ns.mpos.nukkadshops:id/save_button")
  public WebElement Return;
  
  
  
  
  

}
