package com.six;


class Employee2{
	private String name;
	private int age;
	private double salary = 2000.0; //薪水
	public void displayInfo() {
		System.out.println("name = " + name + ",age = " + age);
	}
	
	public Employee2(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

public class Manager2 extends Employee2 {
	private double bonus;
	private String position;
	public Manager2(String name,int age,double salary,String position) {
		super(name, age, salary);
		this.position = position;
		super.displayInfo();
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public static void main(String[] args){
		Manager2 mg = new Manager2("zxx", 22, 3600.00, "manager");
	}
	
}



