package com.generic;

public class Animal {
	
	  static int a = 40;
	  static int b = 90;
	  static int c = a+b;
	
	private String animalName = "Dog";
	
	
	public static void main(String[] args) {
//		//Instantiation:
		Animal obj = new Animal();
		System.out.println(obj.animalName);		
	}

}
