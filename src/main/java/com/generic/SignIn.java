package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	
	@SuppressWarnings("deprecation")
	public void getSignIn() {
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions ghostbrowser = new ChromeOptions();
		ghostbrowser.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(ghostbrowser);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Highlight the login button homepage:
		Highlighter.addColor(driver, mpf.getLoginBtn1());
		mpf.getLoginBtn1().click();
		
		//Highlight email field:
		Highlighter.addColor(driver, mpf.getEmailField());
		mpf.getEmailField().sendKeys(BaseConfig.getConfigValue("email"));
		//Highlight the password field:
		Highlighter.addColor(driver, mpf.getPasswordField());
		mpf.getPasswordField().sendKeys(BaseConfig.getConfigValue("password"));
		//Highlight the login button:
		Highlighter.addColor(driver, mpf.getLoginBtn2());
		mpf.getLoginBtn2().click();
		
		//for screenshots:
		Screenshot.getScreenShot(driver, "Login_page");
		
		if(mpf.getLogoutBtn().isDisplayed()) {
			System.out.println("Login successful.");
		}
		else {
			System.out.println("Login failed.");
		}
	}

}
