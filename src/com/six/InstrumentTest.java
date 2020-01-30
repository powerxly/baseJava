package com.six;
abstract class Instrument{//乐器类
	abstract void play();
}

class Piano extends Instrument{
	public void play() {
		System.out.println("弹奏钢琴");
	}
}

class Violin extends Instrument{
	public void play() {
		System.out.println("弹奏小提琴");
	}
}

class testPlay{
	public void testplay(Instrument ins) {
		ins.play();
	}
}
public class InstrumentTest {

	public static void main(String[] args) {
		testPlay tp = new testPlay();
		tp.testplay(new Piano());
		tp.testplay(new Violin());

	}

}
