package edu.ch07_Test;

// 점, 선, 사각형

public abstract class Geomesty {
	
	private int[] xArr = new int[4];
	private int[] yArr = new int[4];
	
	int [] getXArr() {return xArr; }
	int [] getYArr() {return yArr; }
	
	void addPoint(int x, int y) {
		
		if(xArr == null) {
			xArr = new int[1];
			yArr = new int[1];
			xArr[0] = x;
			yArr[0] = y;
		}
		else {
			int tlen = xArr.length;
			int [] txArr = new int[tlen+1];
			int [] tyArr = new int[tlen+1];
			for (int i = 0 ; i < xArr.length ; i++) {
				txArr[i] = xArr[i];
				tyArr[i] = yArr[i];
			}
			txArr[tlen] = x;
			tyArr[tlen] = y;
			xArr = txArr;
			yArr = tyArr;
		}
	}
	
	public abstract double getLength();
	public abstract double getArea();
	
	public void printPoint() {
		for (int i = 0 ; i < xArr.length ; i++) {
			System.out.println(xArr[i] + "," + yArr[i]);
		}
	}

}
