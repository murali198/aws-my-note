package com.test.ds;

public class SortingAlgorithem {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {19, 5, 3, 22, 12, 1, 4};
		arr = selectionSort(arr);
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
	
	private static Integer[] selectionSort(Integer[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
