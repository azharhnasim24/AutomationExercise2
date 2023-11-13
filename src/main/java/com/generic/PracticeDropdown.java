package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropdown {
	
	WebDriver driver;
	
	public void getDropdownMenu() throws InterruptedException {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Select sc = new Select(driver.findElement(By.xpath("//select\"")));
		
		//select Cyprus by visible text method
		sc.selectByVisibleText("Cyprus");
		
		Thread.sleep(3000);
		//select Algeria by Index method
		sc.selectByIndex(3);
		
		Thread.sleep(3000);
		//select Bangladesh by value method
		sc.selectByValue("BGD");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		PracticeDropdown obj = new PracticeDropdown();
		obj.getDropdownMenu();
		
	}

}
