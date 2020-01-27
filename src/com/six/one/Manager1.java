package com.six.one;


class Employee1{
	private String name;
	private int age;
	private double salary = 2000.0; //薪水
	public Employee1(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee1() {}
	public double getSalary() {
		return salary;
		
	}
	
}

class Manager1 extends Employee1{//经理类继承自员工类
	private double bonus;
	private String position;
	public Manager1(String name ,int age, double salary, String position) {
		super(name,age,salary);
		this.position = position;
	}
	public void setBonus(double bonus) {this.bonus = bonus;}
	
}


