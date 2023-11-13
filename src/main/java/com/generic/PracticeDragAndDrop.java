package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;

public class PracticeDragAndDrop {
	
	WebDriver driver;
	
	public void getDragAndDrop(){
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(mpf.getDragMadrid(), mpf.getDropSpain()).perform();
		ac.dragAndDrop(mpf.getDragCopenhagen(), mpf.getDropDenmark()).perform();
		ac.dragAndDrop(mpf.getDragOslo(), mpf.getDropNorway()).perform();
		ac.dragAndDrop(mpf.getDragRome(), mpf.getDropItaly()).perform();
		ac.dragAndDrop(mpf.getDragSeoul(), mpf.getDropSouthKorea()).perform();
		ac.dragAndDrop(mpf.getDragStockholm(), mpf.getDropSweden()).perform();
		ac.dragAndDrop(mpf.getDragWashington(), mpf.getDropUnitedStates()).perform();
		
	}
	
	public static void main(String[] args) {
		
		PracticeDragAndDrop obj = new PracticeDragAndDrop();
		obj.getDragAndDrop();
	}

}
