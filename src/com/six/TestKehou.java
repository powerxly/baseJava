package com.six;

import javax.net.ssl.SSLEngineResult.Status;

abstract class Animal{
	abstract void status();
	public void attrLs() {
		System.out.println("陆生动物");
	}3
	
}

class QingWa extends Animal{
	public void attr() {
		System.out.println("狗是陆生动物、胎生动物");
	}
	public void status() {
		System.out.println("一般状态摇尾巴");
	}
	public void status(String i) {
		if (i=="高兴") {
			System.out.println(i+"状态汪汪叫");
		}
		else {
			System.out.println(i+"状态呜呜叫");
		}	
	}
}

class Cat extends Animal{
	
}

class Dog extends Animal{
	
}
public class TestKehou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
