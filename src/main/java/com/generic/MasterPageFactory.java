package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), ' Signup / Login')]")
	private WebElement loginBtn1;

	public WebElement getLoginBtn1() {
		return loginBtn1;
	}
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailField ;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	private WebElement loginBtn2;
	
	//Practice Drag and Drop:
	
	@FindBy(xpath="//div[contains(text(), 'Oslo') and @id='box1']")
	private WebElement dragOslo;
	
	@FindBy(xpath="//div[contains(text(), 'Stockholm') and @id='box2']")
	private WebElement dragStockholm;
	
	@FindBy(xpath="//div[contains(text(), 'Madrid') and @id='box7']")
	private WebElement dragMadrid;
	
	@FindBy(xpath="//div[contains(text(), 'Rome') and @id='box6']")
	private WebElement dragRome;
	
	@FindBy(xpath="//div[contains(text(), 'Seoul') and @id='box5']")
	private WebElement dragSeoul;
	
	@FindBy(xpath="//div[contains(text(), 'Copenhagen') and @id='box4']")
	private WebElement dragCopenhagen;
	
	@FindBy(xpath="//div[contains(text(), 'Washington') and @id='box3']")
	private WebElement dragWashington;
	
	@FindBy(xpath="//div[contains(text(), 'Denmark')]")
	private WebElement dropDenmark;
	
	@FindBy(xpath="//div[contains(text(), 'South Korea')]")
	private WebElement dropSouthKorea;
	
	@FindBy(xpath="//div[contains(text(), 'Sweden')]")
	private WebElement dropSweden;
	
	@FindBy(xpath="//div[contains(text(), 'Italy')]")
	private WebElement dropItaly;
	
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement dropUnitedStates;
	
	@FindBy(xpath="//div[contains(text(), 'Spain')]")
	private WebElement dropSpain;
	
	@FindBy(xpath="//div[contains(text(), 'Norway')]")
	private WebElement dropNorway;
	
	//Practice Alert
	
	@FindBy(xpath="//a[contains(text(), 'Alert with OK & Cancel')]")
	private WebElement alertOkandCancel;
	
	public WebElement getAlertOkandCancel() {
		return alertOkandCancel;
	}

	public WebElement getAlertBtn2() {
		return alertBtn2;
	}

	@FindBy(xpath="//button[contains(text(), 'click the button to display a confirm box')]")
	private WebElement alertBtn2;
	
	public WebElement getDragOslo() {
		return dragOslo;
	}

	public WebElement getDragStockholm() {
		return dragStockholm;
	}

	public WebElement getDragMadrid() {
		return dragMadrid;
	}

	public WebElement getDragRome() {
		return dragRome;
	}

	public WebElement getDragSeoul() {
		return dragSeoul;
	}

	public WebElement getDragCopenhagen() {
		return dragCopenhagen;
	}

	public WebElement getDragWashington() {
		return dragWashington;
	}

	public WebElement getDropDenmark() {
		return dropDenmark;
	}

	public WebElement getDropSouthKorea() {
		return dropSouthKorea;
	}

	public WebElement getDropSweden() {
		return dropSweden;
	}

	public WebElement getDropItaly() {
		return dropItaly;
	}

	public WebElement getDropUnitedStates() {
		return dropUnitedStates;
	}

	public WebElement getDropSpain() {
		return dropSpain;
	}

	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	@FindBy(xpath="//a[contains(text(), 'Logout')]")
	private WebElement logoutBtn;

}
