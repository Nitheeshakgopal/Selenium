package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
		
		
	}

}
