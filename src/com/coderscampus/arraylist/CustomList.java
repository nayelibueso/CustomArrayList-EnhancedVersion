package com.coderscampus.arraylist;

public interface CustomList<T> {
	boolean add(T item);

	boolean add(int index, T item) throws IndexOutOfBoundsException;

	int getSize();

	T get(int index) throws IndexOutOfBoundsException;

	T remove(int index) throws IndexOutOfBoundsException;
}
