package com.six;

abstract class Animal{
	public void sleep() {
		System.out.println("睡觉睡觉");
	}
	abstract void eat();
}

class Rabbit extends Animal{
	public void eat() {
		System.out.println("兔子吃草");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("老虎吃肉");
	}
}

class Judeg{
	public void test(Animal animal) {
		animal.eat();
		animal.sleep();
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judeg tt = new Judeg();
		tt.test(new Rabbit());
		tt.test(new Tiger());
	}

}
