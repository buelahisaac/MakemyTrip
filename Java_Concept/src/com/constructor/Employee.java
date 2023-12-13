package com.constructor;

public class Employee  {
	
	public Employee() {
		System.out.println("Iam a Default Constructor or Non Parameterized");
	}
	
	public Employee(String name) {
	System.out.println("Employee name is " +name);	
	}
	
	public Employee(int id) {
		System.out.println("Employee Id is" +id);
	}
	
public static void main(String[] args) {
	Employee e= new Employee();
	Employee e1 = new Employee("swetha");
	Employee e2 = new Employee("4563");
	
}

}
