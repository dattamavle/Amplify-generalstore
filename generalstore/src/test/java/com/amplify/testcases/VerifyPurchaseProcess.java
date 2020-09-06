package com.amplify.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.amplify.TestBase.TestBase;
import com.amplify.pages.StartShopingPage;
import com.amplify.utilities.Helpers;

public class VerifyPurchaseProcess extends TestBase {
	
	public VerifyPurchaseProcess() {
		super();
	}
	
	StartShopingPage startShopingPage;
	@Test
	public void toverifyPurchaseProduct() throws MalformedURLException
	{
		initialisation();
		startShopingPage=new StartShopingPage();
		Helpers.waitTillElementClickable(startShopingPage.getCountryListTab(), "countryListdropdown");
		startShopingPage.getCountryListTab().click();
		Helpers.scrolltoElement("Argentina");
		Helpers.selectFromList(startShopingPage.getCountryList(), "Argentina");
	}

}
