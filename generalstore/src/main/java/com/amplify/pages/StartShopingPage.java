package com.amplify.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.amplify.TestBase.TestBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StartShopingPage extends TestBase {

	public StartShopingPage() {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private AndroidElement countryListTab;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<AndroidElement> countryList;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private AndroidElement name;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
	private AndroidElement selectMale;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private AndroidElement selectFemale;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private AndroidElement letsShopButton;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	private List<AndroidElement> productNameList;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
	private List<AndroidElement> addToCartList;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
	private List<AndroidElement> productPriceList;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private AndroidElement cartIcon;
	

	
	public AndroidElement getCountryListTab() {
		return countryListTab;
	}

	public AndroidElement getName() {
		return name;
	}

	public AndroidElement getSelectMale() {
		return selectMale;
	}

	public AndroidElement getSelectFemale() {
		return selectFemale;
	}

	public AndroidElement getLetsShopButton() {
		return letsShopButton;
	}

	public List<AndroidElement> getProductNameList() {
		return productNameList;
	}

	public List<AndroidElement> getAddToCartList() {
		return addToCartList;
	}

	public List<AndroidElement> getProductPriceList() {
		return productPriceList;
	}

	public AndroidElement getCartIcon() {
		return cartIcon;
	}

	public List<AndroidElement> getCountryList() {
		return countryList;
	}
	
}
