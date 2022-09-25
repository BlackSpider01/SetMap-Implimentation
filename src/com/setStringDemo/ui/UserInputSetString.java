package com.setStringDemo.ui;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserInputSetString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string using space");
		String s= sc.nextLine();
		
		String [] arr = s.split(" ");
		System.out.println("your entered string is");
		//List<String> lst = new ArrayList<>();
		for(String i: arr) {
			
			System.out.println(i);
			
		}
		Set<String> st= new TreeSet<String>();
		for(String j: arr) {
			st.add(j);
		}
		System.out.println("output String is:- "+ st);
				
		
	
		
		
	}
	

}
