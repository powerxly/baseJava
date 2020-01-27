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
//	public void testCPinter(int id) {
//		if (id == 1) {
//		//测试彩色打印机是否工作
//		CPrinter cprinter = new CPrinter();
//		cprinter.paint();
//		}else {
//			//测试黑白打印机是否工作
//			WPrinter wprinter = new WPrinter();
//			wprinter.paint();
//		}
//	}
//	//测试彩色打印机是否工作
//	public void testPinter(CPrinter cprinter) {
//		cprinter.paint();
//	}
//	//测试黑白打印机是否工作
//	public void testPinter(WPrinter wprinter) {
//		wprinter.paint();
//	}
	//测试打印机是否工作
	public void testPinter(Printer printer) {
		printer.paint();
	}
	
}


public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintHandle tp = new PrintHandle();
//		CPrinter cp = new CPrinter();
//		tp.testPinter(cp);
//		WPrinter wp = new WPrinter();
//		tp.testPinter(wp);
//		Printer cp = new CPrinter();
//		tp.testPinter(cp);
//		Printer wp = new WPrinter();
//		tp.testPinter(wp);
		tp.testPinter(new WPrinter());
		tp.testPinter(new CPrinter());
		
	}

}
