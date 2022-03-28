package com.assgiment.array;

import java.util.Random;

//3. Cho môòt maÒng 100K phâÌn tıÒ (DuÌng for ğêÒ thêm giaì triò cho maÒng). sãìp xêìp maÒng theo giaì triò giaÒm dâÌn
public class Sort {
	private static final char TRUE = 0;
	private static final char FALSE = 0;

	public static void main(String[] args) {
		int[] arrs = new int[100000];
	for (int i = 0; i < arrs.length; i++) {
		arrs[i] = new Random().nextInt();
		}
		add(arrs);
		 1.bubbleSort   total run time: 16
		long startTime = System.currentTimeMillis();
	bubbleSort2(arrs);
		long endTime = System.currentTimeMillis();
	in(arrs);
		System.out.println("total run time: " + (endTime - startTime) / 1000);
		 2.insertionSort total run time: 3
		long startTime2 = System.currentTimeMillis();
		insertionSort(arrs);
		long endTime2 = System.currentTimeMillis();
		in(arrs);
		System.out.println("total run time: " + (endTime2 - startTime2) / 1000);
		// 3.selectionSort total run time: 1
		long startTime2 = System.currentTimeMillis();
		selectionSort(arrs);
		long endTime2 = System.currentTimeMillis();
		in(arrs);
		System.out.println("total run time: " + (endTime2 - startTime2) / 1000);
		long startTime2 = System.currentTimeMillis();
		selectionBach(arrs);
		long endTime2 = System.currentTimeMillis();
		in(arrs);
		System.out.println("total run time: " + (endTime2 - startTime2) / 1000);
	}

	public static void bubbleSort(int[] arrs1) {
		for (int i = 1; i < arrs1.length; i++) { // length-1
			int temp;

			for (int j = 0; j < arrs1.length - 1; j++) {
				if (arrs1[j] < arrs1[j + 1]) {
					temp = arrs1[j];
					arrs1[j] = arrs1[j + 1];
					arrs1[j + 1] = temp;

				}
			}
		}
	}

	public static void bubbleSort2(int[] arrs1) {
		int temp;
		boolean flag;
		flag = true;
		while (flag == true) {
			flag = false;
			for (int j = 0; j < arrs1.length - 1; j++) {
				if (arrs1[j] < arrs1[j + 1]) {
					temp = arrs1[j];
					arrs1[j] = arrs1[j + 1];
					arrs1[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public static void in(int[] arrs1) {
		for (int i = 0; i < arrs1.length; i++) {
			System.out.println(arrs1[i]);
		}
	}

	public static void insertionSort(int[] arrs1) {
		for (int i = 1; i < arrs1.length; i++) {// chon ra phan tu de so sanh
			int key = arrs1[i];
			for (int j = i - 1; j >= 0 && arrs1[j] < key; j--) {
				arrs1[j + 1] = arrs1[j];
				arrs1[j] = key;
			}
		}
	}

	public static void selectionSort(int[] arrs1) {
		int max, vitrimax;
		for (int i = 0; i < arrs1.length - 1; i++) {
			max = arrs1[i];
			vitrimax = i;
			for (int j = i + 1; j < arrs1.length; j++) {
				if (arrs1[j] > max) {
					max = arrs1[j];
					vitrimax = j;
				}
			}
			// doi vi tri arrs[max] voi arrs[i]
			arrs1[vitrimax] = arrs1[i];
			arrs1[i] = max;
		}

	}

	public static void selectionBach(int[] arrs1) {
		for (int i = 0; i < arrs1.length - 1; i++) {
			for (int j = i + 1; j < arrs1.length; j++) {
				if (arrs1[i] < arrs1[j]) {
					int temp = arrs1[i];
					arrs1[i] = arrs1[j];
					arrs1[j] = temp;
				}
			}
		}
	}

	public static void add(int[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = new Random().nextInt();
		}
	}
//	public static void quickSort(int[] arrs1) {
//		void sort1(int[] arr) {
//			
//		}
//	}
}
