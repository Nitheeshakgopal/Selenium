package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au/ref=nav_bb_logo");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.close();
		
		
		

	}

}
