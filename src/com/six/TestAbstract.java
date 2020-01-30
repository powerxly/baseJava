package com.six;

abstract class Shape{//形状类
	protected double length;
	protected double width;
	
	public Shape(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public abstract double area();
}

class Rectangle extends Shape{//矩形类继承形状类
	Rectangle(final double num,final double num1) {
		super(num, num1);
	}
	//实现抽象方法如覆盖方法一样
	public double area() {
		return length* width;
	}
}

class Triangle extends Shape{
	Triangle(final double num,final double num1) {
		super(num, num1);
	}
	//计算三角形面积
	public double area() {
		return length*width/2;
	}
}

class Square extends Shape{
	public Square(final double num,final double num1) {
		super(num, num1);
	}
	//计算长方形面积
	public double area() {
		return length*width;
	}
}

class Judge{
	public double result(Shape shape) {
		return shape.area();
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		Judge judge = new Judge();
		System.out.println("矩形的面积是："+judge.result(new Rectangle(4, 5)));
		System.out.println("三角形的面积是："+judge.result(new Triangle(4, 5)));
		System.out.println("长方形的面积是："+judge.result(new Square(4, 5)));
	}

}
