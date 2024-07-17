package com.coderscampus.arraylist;

public interface CustomList<T> {

	boolean add (T item); //Adds an item to the list and should return true if it adds sucesfully.
	boolean add (int index, T item) throws IndexOutOfBoundsException; //NM:Should add a new item to CustomList at the specified inf=dex (which shifts everything to the right.
	int getSize(); //Returns the number of elements in the list 
	T get(int index)throws IndexOutOfBoundsException; //Returns the element at the specified index (new IndexOutOfBounds Exception added)
	T remove (int index) throws IndexOutOfBoundsException;//NM: SHould remove an item form the CustomList at the specified index/ DO not leave empty Null, all items to the right will shuffel to the left.
}
