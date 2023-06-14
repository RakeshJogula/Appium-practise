package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LaunchApp {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		openapp();
		
	}
	
	public static void openapp() throws MalformedURLException, InterruptedException {
		
		
		UiAutomator2Options options = new UiAutomator2Options()
			    .setUdid("emulator-5554")
			    .setApp("D:\\Rakesh - Work\\eclipse-workspace\\app\\ApiDemos-debug.apk");
		
			AndroidDriver driver = new AndroidDriver(
			    new URL("http://127.0.0.1:4723/wd/hub"), options
			);
			try {
			    System.out.print(driver.getPageSource());
			} finally {
			    driver.quit();
			}

		
	}

}
