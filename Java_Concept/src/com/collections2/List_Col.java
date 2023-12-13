package com.collections2;


import java.util.LinkedList;
import java.util.List;

public class List_Col {

	public static void main(String[] args) {
		
		List<Character> a=new LinkedList <Character>();
		a.add('A');
		a.add('B');
		a.add('D');
		a.add('Z');
		System.out.println(a);

	     a.addAll(a);
	     System.out.println(a);
	     
	     int b = a.size();
	     System.out.println(b);
	     
	       Character c = a.get(1);
	     System.out.println(c);
	     
	   a.remove(1);
	   System.out.println(a);
	   
	  int g = a.indexOf('D');
	   System.out.println(g);
	   
	   boolean j = a.contains(c);
	   System.out.println(j);
	   
	   
	   List<Float> B=new LinkedList <Float>();
		B.add(0.34f);
		B.add(3.34f);
		B.add(9.32f);
		B.add(3.456f);
		System.out.println(B);
		
		System.out.println(a);
		
		B.retainAll(a);
		System.out.println(B);
		
		//B.removeAll(a);
		//System.out.println(B);

	   
	   
	     
	  }

}
