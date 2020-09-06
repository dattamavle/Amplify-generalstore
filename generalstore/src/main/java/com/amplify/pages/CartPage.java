package com.amplify.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.amplify.TestBase.TestBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends TestBase {

	public CartPage() {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
	private List<AndroidElement> cartProductName;
	
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	private List<AndroidElement> cartProductPrice;

	public List<AndroidElement> getCartProductName() {
		return cartProductName;
	}

	public List<AndroidElement> getCartProductPrice() {
		return cartProductPrice;
	}
	
		
}
