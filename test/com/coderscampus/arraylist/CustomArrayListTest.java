package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
//Code will not be needed anymore as this was the manual way to test merhods. 
//	public static void main(String[] args) {
//		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
//		for (Integer i = 0; i < 15; i++) {
//			list.add(i);
//		}
//		System.out.println("Size: " + list.getSize());
//		
//		for (Integer i = 0; i < list.getSize(); i++) {
//			System.out.println("Element at index " + i + ": " + list.get(i));
//		}
//	}
	
	private CustomArrayList<Integer> list;
	
	@BeforeEach //This annotetion designates a method that should be run before each test metod in the test class.
	void set_Up () {
		list = new CustomArrayList<Integer>();
	}
	
	@Test 
	void test_And_Get_Size () { //Test that elements can be added to the list and size updates correctly. 
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		assertEquals(15, list.getSize());
	}
	
	@Test 
	void test_Get_Elements () { //Test that elemnts can be retreived correcctly from the list
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		for (int i = 0; i < list .getSize(); i++) { //Iterate over the list and asser each element is equal to its index
			assertEquals(i, list.get(i));
		}
	}
	
	@Test
	void test_Add_At_Index () {
		list.add(1);
		list.add(2);
		list.add(1, 3); //Add element 3 at index 1
		assertEquals(3, list.getSize());
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
		assertEquals(2, list.get(2));
	}
	
	@Test
	void test_Remove () {
		list.add(1);
		list.add(2);
		list.add(3);
		int removed = list.remove(1);
		assertEquals(2, removed);
		assertEquals(2, list.getSize());
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
	}
	
}
