package Chap3;

import java.util.Scanner;

public class Test32 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		System.out.println("-".repeat(20));
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(arr[i]);
//		}
//
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		System.out.println("국어 점수 :");
		arr[0] = sc.nextInt();
		
		System.out.println("영어 점수 :");
		arr[1] = sc.nextInt();
		
		System.out.println("수학 점수 :");
		arr[2] = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		int avg = (arr[0] + arr[1] + arr[2])/3;
		System.out.println("평균은" + avg);
		
		System.out.println("전통적인 for");
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
			
	
	
	}

}
