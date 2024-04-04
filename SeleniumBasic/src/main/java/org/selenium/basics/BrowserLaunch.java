package org.selenium.basics;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		//load driver for chrome, variable driver has the browser
		//ChromeDriver is a class
	WebDriver driver=new ChromeDriver();
	//launching the url
	driver.get("https://demowebshop.tricentis.com/");
	//command to maximize the window
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	//close the window
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	
	
	
	
	
	}

}
