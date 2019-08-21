package com.test.ds;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		reverse();
	}
	
	public static void removeDublicates() {
		Integer[] num = new Integer[] {2,8,2,6,7,1,6,3,7};
		Arrays.parallelSort(num);
		int temp[] = new int[num.length]; 
		int j = 0; 
		for(int index = 0; index < num.length - 1; index++) {
			if(num[index] != num[index+1])
				temp[j++] = num[index];
		}
		temp[j++] = temp[num.length - 1];
		for(int index = 0; index < temp.length - 1; index++) {
			System.out.println(temp[index]);
		}
	}
	
	public static void reverse() {
		Integer[] a = new Integer[] {2,8,3,6,7};
		int n = a.length;
		int i, j, k; 
        for (i = 0; i < n / 2; i++) { 
            j = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = j; 
        } 
        for (k = 0; k < n; k++) { 
            System.out.print(a[k]); 
        } 
	}
}
