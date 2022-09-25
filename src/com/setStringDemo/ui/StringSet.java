package com.setStringDemo.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringSet {

	public static void main(String[] args) {
		List<String> stringL = new ArrayList<>();
		stringL.add("abc");
		stringL.add("abc");
		stringL.add("ab");
		stringL.add("a");
		stringL.add("Ab");
		System.out.println("String Added Is :- " + stringL);
		Set<String> str = new HashSet<>();
		// Set<String> str = new TreeSet<>();
		str.addAll(stringL);
		System.out.println("output String is:- " + str);

	}

}
