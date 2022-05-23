package com.day3;

//
////Why String is immutable in java and what is the difference between String 
////and String Builder? And Write some
////of the methods of String class at least 5 with example.
//
//
//////////////////////////////////////////////////////////////////////////////////////////
////************ANSWER*****************//
////String are immutable in java because when changing the string in a location or object
////it might change in the main location.
//
////A String will help you create a variable which can hold the value or input in the form of 
////a charactor or a line or a sentence.
//
////what a String builder mean is that it helps you to build a chain of Strings without having 
////to take extra space.
//
//
///////////////////////////////////////////////////////////////////////////////////////////
//


public class StringAndBuild {
	

	public static void main(String[] args) {
		
		String a = "hello world";
		
		System.out.println(a); // strings are immutable.
		
		a = a.concat(", Welcome to JAVA");
		System.out.println(a);
		
		a = "hi there ..."; /// String can be reassigned..
		
		System.out.println(a);
		
		
		String a1 = new String("Hello");
		String a2 = new String("Hello");
		
		if(a1==a2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String b1 = "Save Soil";
		String b2 = "Save Soil";
		
		if(b1==b2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}
