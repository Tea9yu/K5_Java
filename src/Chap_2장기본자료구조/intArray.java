package Chap_2장기본자료구조;

import java.util.Random;
import java.util.Scanner;

public class intArray {
	
	static void sort(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
	}
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
		
	}

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner std = new Scanner(System.in);
		System.out.println("배열수:: ");
		int num = std.nextInt();
		int []a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = rnd.nextInt(100);
		}
		for(int n: a)
			System.out.print(n + " ");
		int result = maxOf(a);
		System.out.println();
		sort(a);
		for(int n: a)
			System.out.print(n + " ");
		

	}

}
