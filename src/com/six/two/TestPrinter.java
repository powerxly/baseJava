package com.six.two;


class Printer{
	public void paint() {
		System.out.println("默认打印机无色");
	}
}
/* 彩色打印机 */
class CPrinter extends Printer{
	public void paint() {
		System.out.println("打印彩色字");
	}
}
/* 黑白打印机 */
class WPrinter extends Printer{
	public void paint() {
		System.out.println("打印黑白字");
	}
}
/* 控制打印输出 */
class PrintHandle{
	public void testCPinter(int id) {
		if (id == 1) {
		//测试彩色打印机是否工作
		CPrinter cprinter = new CPrinter();
		cprinter.paint();
		}else {
			//测试黑白打印机是否工作
			WPrinter wprinter = new WPrinter();
			wprinter.paint();
		}
	}
}


public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintHandle tp = new PrintHandle();
		tp.testCPinter(1);
		tp.testCPinter(2);
		
	}

}
