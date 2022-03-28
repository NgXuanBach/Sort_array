package com.assgiment.array;

import java.util.Random;

//2. Cho ma�ng A co� 5k  ph��n t�� & ma�ng B co� 100K ph��n t�� (du�ng vo�ng for ��� th�m gia� tri� cho ma�ng). H��p nh��t 2 ma�ng la�i v��i nhau.
public class PrimitiveMerging {
	public static void main(String[] args) {

		int[] arrs1 = new int[5000];
		int[] arrs2 = new int[100000];
		int[] arrs3 = new int[arrs1.length + arrs2.length];
		long startTime = System.currentTimeMillis();
		add(arrs1);
		showMang(arrs1);
		
		System.out.println("in mang 2");
		add(arrs2);
		// in mang 2 
		showMang(arrs2);
		for (int i = 0; i < (arrs1.length + arrs2.length); i++) {
			if (i < arrs1.length) {
				arrs3[i] = arrs1[i];
			} else {// >=arrs1.length
				arrs3[i] = arrs2[i - arrs1.length];
			}
		}
		long endTime = System.currentTimeMillis();
		// in mang 3
		showMang(arrs3);
		System.out.println("total run time: " + (endTime - startTime) / 1000);

	}

	public static void add(int[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = new Random().nextInt();
		}
	}



	public static void showMang(int[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}

	}

}
