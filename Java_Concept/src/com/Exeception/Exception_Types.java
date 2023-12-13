package com.Exeception;

import java.util.ArrayList;
import java.util.List;

public class Exception_Types {
	public static void main(String[] args) {

		try {

			String s = "Java";

			char charAt = s.charAt(4);
			System.out.println(charAt);

		} catch (Exception e) {	
			//e.printStackTrace();
			System.out.println("logical error");
		}
		try {
			int a = 10;
			int b = 0;

			System.out.println(a / b);

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("another error in arithematic");
		}

		finally {
			System.out.println("all done");

		}
		System.out.println("running");
	}
}
