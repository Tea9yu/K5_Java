package Chap_2장기본자료구조;

//교재 60 - 실습 2-6
//2번 실습
import java.util.Random;
public class 정수배열정렬 {
public class 실습2_6정수배열정렬 {
	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		for (int num: data) {
			System.out.print(num+" ");
		}
		/*
		sortData(data);
		System.out.println();
		for (int num: data) {
			System.out.print(num+" ");
		}
		*/
		reverse(data);//역순으로 재배치 - 정렬 아님 
		System.out.println();
		for (int num: data) {
			System.out.print(num+" ");
		}
		reverseSort(data);//역순으로 재배치 - 정렬 아님 
		System.out.println();
		for (int num: data) {
			System.out.print(num+" ");
		}
	}
	static void inputData(int []data) {

	}
	static void swap(int[]arr, int ind1, int ind2) {
	
	}
	static void sortData(int []arr) {

	}
	static void reverse(int[] a) {

	}
	static void reverseSort(int []arr) {

	}
	
	}
}
