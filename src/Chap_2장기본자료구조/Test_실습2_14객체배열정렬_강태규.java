package Chap_2장기본자료구조;

import java.util.Arrays;

class PhyscData2 implements Comparable<PhyscData2> {
	String name;
	int height;
	double vision;

	public PhyscData2(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	public String toString() {
		return "(" + name + "," + height + "," + vision + ")";
	}

	@Override
	public int compareTo(PhyscData2 p) {
		return this.name.compareTo(p.name);
	}
}

public class Test_실습2_14객체배열정렬_강태규 {

	public static void main(String[] args) {
		PhyscData2[] data = { 
				new PhyscData2("홍길동", 162, 0.3), 
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7), 
				new PhyscData2("김홍길동", 172, 0.3), 
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2), 
				new PhyscData2("최길동", 169, 0.5), 
		};
		
		showData(data);
		sortData(data);
		showData(data);
	}

	static void swap(PhyscData2[] data, int i, int j) {
		PhyscData2 temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	static void sortData(PhyscData2[] data) {		
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);

				}
			}
		}

	}

	static void showData(PhyscData2[] data) {
		for (PhyscData2 d : data) {
			System.out.print(d.name + ":" + d.height + "," + d.vision + " / ");			
		}
		System.out.println();
	}

}
