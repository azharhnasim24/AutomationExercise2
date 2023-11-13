package com.testng.practice;

import org.testng.annotations.Test;

public class PracticeTestNGMethods {
	
	@Test(priority=0, groups="Smoke")
	public void login() {
		System.out.println("This is login method.");
	}
	@Test(priority=1)
	public void selectItem() {
		System.out.println("This is select item method.");
	}
	@Test(priority=2)
	public void cart(){
		System.out.println("This is cart method.");
	}
	@Test(priority=3, groups="Smoke")
	public void payment(){
		System.out.println("This is payment method.");
	}
	@Test(priority=4)
	public void placeOrder(){
		System.out.println("This is place order method.");
	}
	
	public static void main(String[] args) {
		PracticeTestNGMethods obj = new PracticeTestNGMethods();
		obj.login();
		obj.selectItem();
		obj.cart();
		obj.payment();
		obj.placeOrder();
	}
}
