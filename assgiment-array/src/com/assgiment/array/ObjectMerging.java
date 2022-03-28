package com.assgiment.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//2. Cho mảng A có 5k  phần tử & mảng B có 100K phần tử (dùng vòng for để thêm giá trị cho mảng). Hợp nhất 2 mảng lại với nhau.

public class ObjectMerging {
	public static void main(String[] args) {
		List<Integer> arrs1 = new ArrayList<Integer>(5000);

		int maxLengthArrs1 = 5000;
		List<Integer> arrs2 = new ArrayList<Integer>(100000);
		List<Integer> arrMerged = null;
		int maxLengthArrs2 = 100000;
//   add gia tri mang 1
		initValue(arrs1, maxLengthArrs1);
//   add gia tri mang 2
		initValue(arrs2, maxLengthArrs2);
		arrMerged = merge(arrs1, arrs2);
		showMang(arrMerged);
		System.out.println("size cua arrMerged: " + arrMerged.size());
	}

	public static void initValue(List<Integer> arrs, int maxLength) {
		for (int i = 0; i < maxLength; i++) {
			arrs.add(new Random().nextInt());
		}
	}

	public static void showMang(List<Integer> arrs) {
		for (int i = 0; i < arrs.size(); i++) {
			System.out.println(arrs.get(i));
		}

	}

	/*
	 * Step1: tao Ham gop 2 mang lai
	 * Step2: tham so can truyen vao la size mang 1 va  size mang 2
	 * Step3: Dung vong lap for de gop 2 mang lai, duyet tu 0 den t size cua mang 2
	 * 
	 */
	public static List<Integer> merge(List<Integer> arrs1, List<Integer> arrs2) {
		if (arrs1.size() > arrs2.size()) {
			for (int i = 0; i < arrs2.size(); i++) {
				arrs1.add(arrs2.get(i));
			}
			return arrs1;
		} else {
			for (int i = 0; i < arrs1.size(); i++) {
				arrs2.add(arrs1.get(i));
			}
			return arrs2;
		}

	}
}
