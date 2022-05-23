package com.day3;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	static void authenticate(String userName, String password) {
		
		Course c1 = new Course();

		if(userName.equals("Admin")  && password.equals("1234$")) {
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or Password");
		}
		
		
		
	}
	
	
	void displayCourseDetails() {
		
		int courseId = 111;
		String courseName = "Java Full Stack";
		int courseFee = 300000;
		
		System.out.println("Course Name :"+ courseName);
		System.out.println("Course Id :" + courseId);
		System.out.println("Course Fee :" + courseFee);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Course c1 = new Course();
		
//		c1.displayCourseDetails();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Username :");
		String name = scanner.next();
		System.out.println("Enter Password :");
		String pass = scanner.next();
		
		authenticate(name , pass);
		
		
	}

}
