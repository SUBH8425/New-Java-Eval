package Week1;

import java.util.Scanner;

public class Student {

	int roll;
	String name;
	String address;
	int marks;
	
	public Student(){};
	
	public Student(int roll, String name, String address, int marks) {

		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}

class Demo{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Student objects need to be created.");
		
		int num = scanner.nextInt();
		
		Student[] std = new Student[num]; 
		
		std[0] = new Student(1,"Pawan","UP",560);
		std[1] = new Student(2,"Murtilal","Jharkhand",780);
		std[2] = new Student(3,"Venkatesh", "Karnatak",890);
		
		
		for(int i = 0; i<std.length; i++) {
			
			System.out.println("Name : " + std[i].getName());
			System.out.println("Student Roll no : " + std[i].getRoll());
			System.out.println("Student Address : " + std[i].getAddress());
			System.out.println("Student Marks : " + std[i].getMarks());
			
			System.out.println("===========================================");
			
		}
		
		// Average total marks of all the students
		int sum = 0;
		for (int j = 0; j<std.length; j++) {
			
			sum += std[j].getMarks();
			
		}
		
		double avg = sum/std.length;
		
		System.out.println("Average total marks of all the Students." + avg);
		
	}
}