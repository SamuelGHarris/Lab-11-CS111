/**
* CS 111 Section No. 002
* Lab Assignment 11
* @author Samuel Harris
**/

import java.lang.reflect.Array;

public class MyArrayList<T> {

	private Object[] arr;
	private int index;
	private static final int maxSize = 5;

	public MyArrayList() {
		arr = (T[]) new Object[maxSize];
		index = 0;
	}

	public MyArrayList(int size_input) {
		arr = (T[]) new Object[size_input];
		index = 0;
	}

	public void display() {
		if (index == 0) {
			System.out.println("The list is empty.");
		} else {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public boolean empty() {
		boolean result = false;
		if (index == 0) {
			result = true;
		}
		return result;
	}

	public void remove(T value) {
		if (index == 0) {
			System.out.println("The list is empty.");
		} else {
			for (int i = 0; i <= index; i++) {
				if (arr[i].equals(value)) {
					arr[i] = arr[index - 1]; // Places the last item in the empty slot.
					index--;
				}
			}
		}
	}

	public void add(T item) {
		if (index == arr.length) {
			Object[] tmpArr = (T[]) new Object[arr.length * 2];
			for (int i = 0; i < index; i++) {
				tmpArr[i] = arr[i];
			}
			arr = tmpArr;
		}
		arr[index] = item;
		index++;
	}

	public void clear() {
		index = 0;
	}

	public boolean full() {
		return (index == arr.length);
	}

	public int size() {
		return (index);
	}
}