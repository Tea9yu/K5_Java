package com.ruby.java.test1;

public class Armor {
	private String name;
	public int height;
	private int speed;
	private String color;
	private boolean isFly;
	public void test(int ... v) {
		System.out.println("test(int... v) 호출");
		for (int x: v) {
			System.out.println(" " + x);
		}
	}
	/*
	public void test(int a) {
		System.out.println("test(int a) 호출");
	}	
	public void test(int a, int b) {
		System.out.println("test(int a, int b) 호출");
	}
	public void test(int a, int b, int c) {
		System.out.println("test(int a, int b, int ) 호출");
	}
	*/
	public void show() {
	System.out.println(speed); //정수
	System.out.println(name); //문자열
	System.out.println(height); //정수
	}
	public void speedUp(int value) {
		System.out.println("정수 스피드 증가");
		speed += value;
	}
	public void speedUp(double value) {
		System.out.println("실수 스피드 증가");
		speed += (int)value;
	}	
	public int getSpeed() {
		return speed;
	}
	public void setName(int height) {
		String value = "홍길동";
		name = value;
		setHeight(height);
	}
	public void setName() {
		String value = "홍길동";
		name = value;
		
	}
	private void setHeight(int value) {
		if (value > 0)
		height = value;
		else {
			System.out.println("음수 안돼");
		}
	}
	public int takeOff() {
		System.out.println("비행하다");
		
		System.out.println("아이언맨");
		return 0;
	}

}
