package com.assgiment.array;

import java.util.Random;

//1.Cho một mảng A co�? 10k ô nhơ�?. Thêm 9k5 gia�? trị int vào mảng trên (Sử dụng for).Hãy sắp xếp mảng theo thứ tự tăng dần, sau đó chèn phần tử a vào vị trí k mà vẫn đảm bảo mảng là tăng dần.

public class Additon {
//	static int demmang;
	// step1: initValue cho 9500 ô nhớ
	// step2: sắp xếp mảng theo giá trị tăng dần( thuật toán tự ch�?n )
	// step3: add giá trị a vào vị trí k
	// step4: sắp xếp lại mảng
	private static int maxNumOfValue = 5;// số lượng các giá trị trong mảng
	private static final String THONGBAODAY = "Danh sach da day. Khong the tiep tuc thuc hien.";
	private static final String THONGBAOVITRISAI = "Hien tai vi tri ban co the chen gia tri vao phai nam trong khoang tu 1 den "
			+ (maxNumOfValue + 1);

	public static void main(String[] args) {
		int[] arrs = new int[10000];
		int soChenVao = 123;
		int viTriChen = 7;
		// add mảng
		initValue(arrs);
//      sắp xếp tăng dần
		sapXepTang(arrs);
//       chèn mảng
		chen(arrs, soChenVao, viTriChen);
//      in mảng
		showMang(arrs);
	}

	// ham in ra
	public static void showMang(int[] arrs) {
		for (int i = 0; i < maxNumOfValue; i++) {
			System.out.println(arrs[i]);
		}
	}

	// ham add
	public static void initValue(int[] arrs) {// add vao mang
		for (int i = 0; i < maxNumOfValue; i++) {
			arrs[i] = new Random().nextInt();
		}
	}

	// ham' sap xep tang dan selection sort
	public static void sapXepTang(int[] arrs) {
		int min;
		int vitrimin;
		for (int i = 0; i < maxNumOfValue - 1; i++) {
			min = arrs[i];
			vitrimin = i;
			for (int j = i + 1; j < maxNumOfValue; j++) {
				if (arrs[j] < min) {
					min = arrs[j];
					vitrimin = j;
				}
			}
			arrs[vitrimin] = arrs[i];
			arrs[i] = min;
		}
	}

	public static void chen(int[] arrs, int soChenVao, int viTriChen) {
		if (maxNumOfValue >= arrs.length) {
			System.out.println(THONGBAODAY);
			return;
		}
		if(viTriChen-1>maxNumOfValue) {
			System.out.println(THONGBAOVITRISAI);
			return;
		}
		if (viTriChen-1 == maxNumOfValue) {//Neu vi tri chen = vi tri cuoi cung hien tai cua mang
			arrs[viTriChen-1] = soChenVao;
			maxNumOfValue++;
			return;
		} 
		for (int i = maxNumOfValue; i > viTriChen - 1; i--) {
				arrs[i] = arrs[i - 1];
		}
		arrs[viTriChen - 1] = soChenVao;
		maxNumOfValue++; // khi chèn vào 1 số thì số lượng các phần tử đã add sẽ tăng thêm 1

	}
}
