package com.setDemo.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(3);
		myList.add(2);
		myList.add(4);
		myList.add(5);
		System.out.println("Given List Is - " + myList);
		Set<Integer> mySet = new HashSet<>(myList);
		// mySet.addAll(myList);
		System.out.println("OutPut Set Is -" + mySet);

	}

}
