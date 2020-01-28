package com.six;

public class TestStatic {
	static {
		System.out.println("我是语句块输出");
	}
	public TestStatic() {
		System.out.println("我是构造器");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("构造器调用前");
		TestStatic tc = new TestStatic();
		System.out.println("构造器调用后");
	}

}
