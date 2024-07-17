package com.coderscampus.arraylist;

public class CustomArrayListTest {

	public static void main(String[] args) {
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		for (Integer i = 0; i < 15; i++) {
			list.add(i);
		}
		System.out.println("Size: " + list.getSize());
		
		for (Integer i = 0; i < list.getSize(); i++) {
			System.out.println("Element at index " + i + ": " + list.get(i));
		}
	}
	
}
