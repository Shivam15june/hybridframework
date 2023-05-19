package com.testcases;

import org.openqa.selenium.WebDriver;

import com.utility.BrowserFactory;

public class testcase1 {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserFactory.startApplication(driver, "Chrome", "https://the-internet.herokuapp.com/upload");

		BrowserFactory.quitBrowser(driver);
	}

}
