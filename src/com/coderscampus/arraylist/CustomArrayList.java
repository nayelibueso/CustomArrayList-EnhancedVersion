package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer size = 0;

	@Override//
	public boolean add(T item) {
		if (size == items.length) {
			resizeArray();
		}
		items [size++] = item;
		return true;
	}
	
	@Override //New method 
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + "size: " + size);
		} if (size == items.length) {
			resizeArray();
		}
		System.arraycopy(items, index, items, index + 1, size - index);
		items [index] = item;
		size++;
		return true; 
	}


	@Override //
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override //Already exited in Assignment 5, added IndexOutofBoundsException
	public T get(int index) throws IndexOutOfBoundsException{
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index + " Size: " + size);
		}
		return (T) items[index];
	}


	@Override // New method
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= size || index <0) {
			throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
		}
		T removedItem = (T) items[index];
		int numMoved = size - index - 1;
		if(numMoved > 0 ) {
			System.arraycopy(items, index + 1, items, index, numMoved);
		}
		items[--size] = null;
		return removedItem;
	}
	
	private void resizeArray() { //
		items = Arrays.copyOf(items, items.length * 2);
	}
	
}

