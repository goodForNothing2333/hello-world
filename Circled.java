package com.haha.shuzu;

public class Circled {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 6;
		PassObject p = new PassObject();
		p.printAreas(c, 5);
	}
}

class Circle {
	double radius;
	public double findAreas(double radius) {
		double s;
		s = Math.PI * radius * radius;
		return s;
	}
}

class PassObject {
	public void printAreas(Circle c, int time) {
		System.out.println("Radius" + "\t" + "Area");
		for(int i = 1; i <= time; i++) {
			double area = Math.PI * i * i;
			System.out.println(i + "\t" + area);
		}
		System.out.println("当前半径为：" + c.radius);
	}
}