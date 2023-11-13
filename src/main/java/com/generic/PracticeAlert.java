package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PracticeAlert {
	
	WebDriver driver;
	
	public void getAlert() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		mpf.getAlertOkandCancel().click();
		mpf.getAlertBtn2().click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	}
	
	public static void main(String[] args) {
		
		PracticeAlert obj = new PracticeAlert();
		obj.getAlert();
	}

}
