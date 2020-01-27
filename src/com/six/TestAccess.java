package com.six;

class T{
	private int i = 10;
	int j =100;
	protected int k = 1000;
	public int m = 10000;
}
public class TestAccess {
	public static void main(String [] arg) {
	    T t = new T();
	    //不能访问私有的System.out.println(t.i);
	    System.out.println(t.j);
	    System.out.println(t.k);
	    System.out.println(t.m);
	}
}
