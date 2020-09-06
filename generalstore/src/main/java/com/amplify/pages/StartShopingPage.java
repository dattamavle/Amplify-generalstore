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

	public AndroidElement getCountryListTab() {
		return countryListTab;
	}

	public List<AndroidElement> getCountryList() {
		return countryList;
	}
	


}
