package com.amplify.testcases;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amplify.TestBase.TestBase;
import com.amplify.pages.CartPage;
import com.amplify.pages.StartShopingPage;
import com.amplify.utilities.Helpers;

public class VerifyPurchaseProcess extends TestBase {
	
	public VerifyPurchaseProcess() {
		super();
	}
	
	StartShopingPage startShopingPage;
	CartPage cartPage;
	HashMap<String,String> expectedProductList=new HashMap<String,String>();
	HashMap<String,String> actualCartProductList=new HashMap<String,String>();
	
	@Test
	public void toVerifyPurchaseProduct() throws MalformedURLException, InterruptedException
	{
		initialisation();
		startShopingPage=new StartShopingPage();
		Helpers.waitTillElementClickable(startShopingPage.getCountryListTab(), "countryListdropdown");
		startShopingPage.getCountryListTab().click();
		Helpers.scrolltoElement("Argentina");
		Helpers.selectFromList(startShopingPage.getCountryList(), "Argentina");
		Helpers.waitTillElementVisible(startShopingPage.getName(), "Name");
		startShopingPage.getName().sendKeys("Hello");
		startShopingPage.getSelectFemale().click();
		startShopingPage.getLetsShopButton().click();
		Helpers.scrolltoElement("Air Jordan 4 Retro");
		int product1=Helpers.getElementPositionFromList(startShopingPage.getProductNameList(), "Air Jordan 4 Retro");
		String product1price=startShopingPage.getProductPriceList().get(product1).getText();
		startShopingPage.getAddToCartList().get(product1).click();
		Helpers.scrolltoElement("Air Jordan 1 Mid SE");
		int product2=Helpers.getElementPositionFromList(startShopingPage.getProductNameList(), "Air Jordan 1 Mid SE");
		String product2price=startShopingPage.getProductPriceList().get(product2).getText();
		expectedProductList.put("Air Jordan 4 Retro", product1price);
		expectedProductList.put("Air Jordan 1 Mid SE", product2price);
		startShopingPage.getAddToCartList().get(product2).click();
		startShopingPage.getCartIcon().click();
		cartPage=new CartPage();
		Helpers.scrolltoElement(cartPage.getCartProductPrice().get(0).getText());
		actualCartProductList.put(cartPage.getCartProductName().get(0).getText(), cartPage.getCartProductPrice().get(0).getText());
		actualCartProductList.put(cartPage.getCartProductName().get(1).getText(), cartPage.getCartProductPrice().get(1).getText());
		Assert.assertEquals(actualCartProductList, expectedProductList, "Actual product details and expected product details are not matching"); 
		
	}

}
