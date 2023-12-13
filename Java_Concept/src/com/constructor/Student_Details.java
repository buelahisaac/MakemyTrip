package com.constructor;

public class Student_Details {
public Student_Details() {
	System.out.println("Iam a Default Constructor or Non Parameterized");
}

public Student_Details(String name) {
System.out.println("Student_Details name is " +name);	
}

public Student_Details(int id) {
	System.out.println("Student_Details Id is" +id);
}

public static void main(String[] args) {
	Student_Details s= new Student_Details();
	Student_Details s1 = new Student_Details("swetha");
	Student_Details s2 = new Student_Details("4563");

}

}
