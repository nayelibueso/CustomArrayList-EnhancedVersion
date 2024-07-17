package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer size = 0;
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			resizeArray();
		}
		items [size++] = item;
		return true;
	}

	private void resizeArray() {
		items = Arrays.copyOf(items, items.length * 2);
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index + "Size: " + size);
		}
		return (T) items[index];
	}
	
}

