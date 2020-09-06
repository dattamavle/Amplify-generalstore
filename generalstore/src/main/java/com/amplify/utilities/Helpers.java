package com.amplify.utilities;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amplify.TestBase.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class Helpers extends TestBase {

	public Helpers() {
		super();
	}

	public static void selectFromList(List<AndroidElement> list, String name) {
		for (AndroidElement androidElement : list) {

			if (androidElement.getText().equalsIgnoreCase(name)) {
				androidElement.click();
				break;
			} else {
				continue;
			}

		}

	}

	public static void waitTillElementClickable(AndroidElement element, String elementName) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void waitTillElementSelectable(AndroidElement element, String elementName) {
		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void waitTillElementVisible(AndroidElement element, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void scrolltoElement(String text) {

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""
						+ text + "\").instance(0));"));
	}

}
