package com.javaconcepts;

public class Methodoverloading {
	
	
	int i =10;
	 private void student(String name,int mark) {
		 System.out.println("student Name and mark are "+name+","+mark);
	 }
	 
	 private void student(int mark,String name) {
		 System.out.println("student mark and name are "+mark+","+name);
		 }
	 private void student(String name) {
		 System.out.println("student mark is"+name);
		}
	 
		
public static void main(String[] args) {
	//classname objrefName=new classname();
	
	Methodoverloading s=new Methodoverloading();
	s.student("Buel",988);
	s.student(988,"Abi");
	}

}
