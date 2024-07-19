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
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + "size: " + size);
		}
		if (size == items.length) {
			resizeArray();
		}
		System.arraycopy(items, index, items, index + 1, size - index);
		items[index] = item;
		size++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index + " Size: " + size);
		}
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
		}
		T removedItem = (T) items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size - 1] = null;
		size--;
		return removedItem;
	}

	private void resizeArray() { 
		items = Arrays.copyOf(items, items.length * 2);
	}

}
