package com.six.one;


class Employee{
	private String name;
	private int age;
	private double salary = 2000.0; //薪水
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {}
	public double getSalary() {
		return salary;//返回工资
		//哈哈哈
	}
	
}

class Manager extends Employee{//经理类继承自员工类
	private double bonus;
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}

public class TestInheritance {//测试类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		double sal = manager.getSalary();
		System.out.println("继承集成的薪水为:"+sal);
	}

}
