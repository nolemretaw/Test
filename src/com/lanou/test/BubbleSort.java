package com.lanou.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a ={9,0,2,4,5,3,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int tem = a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
