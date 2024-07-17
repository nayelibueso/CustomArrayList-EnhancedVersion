package com.coderscampus.arraylist;

public interface CustomList<T> {

	boolean add (T item); //Adds an item to the list
	
	int getSize(); //Returns the number of elements in the list 
	
	T get(int index); //Returns the element at the specified index
}
