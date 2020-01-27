package com.six;
class Equipment{
	public void support() {
		System.out.println("通电功能");
	}
}

class ColorTv extends Equipment{
	public void support() {
		System.out.println("电视机通电，看电视");
	}
}

class Computer extends Equipment{
	public void support() {
		System.out.println("电脑通电，编java程序");
	}
}
class Icebox extends Equipment{
	public void support() {
		System.out.println("冰箱通电，可以冷冻食物");
	}
}

class Discriminate{
	//描述在使用哪个电器
	public void judge(Equipment equi) {
		equi.support();
	}
}

public class TestDynamicBinding {

	public static void main(String[] args) {
		// 动态绑定实现
		Discriminate dis =  new Discriminate();
		dis.judge(new ColorTv());
		dis.judge(new Computer());
		dis.judge(new Icebox());
	}

}
