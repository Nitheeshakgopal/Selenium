package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//backward command
		driver.navigate().back();
		//forward command
		driver.navigate().forward();
		//refreshing the current page
		driver.navigate().refresh();
		//navigate to a new webpage
		driver.navigate().to("https://www.seleniumeasy.com//");
		
	}

}
