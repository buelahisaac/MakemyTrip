package com.Base;

public class App {

	public static void main(String[] args) {
		String Z = "Welcome to my Sweet Home";
		
		  //int s=Z.length();
		  //System.out.println(s);
		  
		  //boolean b=Z.equals("Welcome");
		  //System.out.println(b);
		  
		  
		  //String e = Z.toUpperCase();
		  //System.out.println(e);
		  
		  //boolean g = Z.startsWith("my");
		 //System.out.println(g);
		 
		 //boolean h =Z.endsWith("Home");
		 //System.out.println(h);
		 
		 //boolean v=Z.contains("z");
		 //System.out.println(v);
		
		
		int b=Z.indexOf("o");
		System.out.println(b);
		
		
		char d=Z.charAt(9);
		System.out.println(d);
		
		String e=Z.replace("Sweet", "New");
		System.out.println(e);
		
		
		String f= Z.substring(11);
		System.out.println(f);
		
		boolean g = Z.isEmpty();
		System.out.println(g);
		
		
		
		String car =Z.trim();
		System.out.println(car);
		
		
				 
		 
	}
}
