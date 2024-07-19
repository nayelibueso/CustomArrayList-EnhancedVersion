package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
	private CustomArrayList<Integer> list;

	@BeforeEach
	void set_Up() {
		list = new CustomArrayList<Integer>();
	}

	@Test
	void test_And_Get_Size() { // Test that elements can be added to the list and size updates correctly.
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		assertEquals(15, list.getSize());
	}

	@Test
	void test_Get_Elements() { // Test that elemnts can be retreived correcctly from the list
		for (int i = 0; i < 15; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.getSize(); i++) { // Iterate over the list and asser each element is equal to its index
			assertEquals(i, list.get(i));
		}
	}

	@Test
	void test_Add_At_Index() {
		list.add(1);
		list.add(2);
		list.add(1, 3); // Add element 3 at index 1
		assertEquals(3, list.getSize());
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
		assertEquals(2, list.get(2));
	}

	@Test
	void test_Remove() { // Test an element can be removed from a specific index and that elemenys shift
							// correctly
		list.add(1);
		list.add(2);
		list.add(3);
		int removed = list.remove(1);
		assertEquals(2, removed);
		assertEquals(2, list.getSize());
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
	}

	@Test
	void test_get_Index_Out_of_Bounds_Exception() {
		Boolean exceptionThrown = false;
		try {
			list.get(0);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown, "IndexOutOfBoundsException to be thrown");
	}

	@Test
	void test_add_Index_Out_Of_Bounds_Exception() {
		Boolean exceptionThrown = false;
		try {
			list.add(1, 1);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown, "IndexOutOfBoundsException not thrown");
	}

	@Test
	void test_Remove_Index_Out_Of_Bounds_Exception() {
		Boolean exceptionThrown = false;
		try {
			list.remove(0);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown, "IndexOutOfBoundsException was not thrown");
	}
}
