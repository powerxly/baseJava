package com.six.two;

import java.sql.Date;

import javax.print.attribute.standard.MediaSize.Other;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Person))
			return false;
		final Person other = (Person)o;
		if (this.name.equals(other.name))
			return true;
		else 
			return false;
		}
	
	public int hascode() {
		return name.hashCode() << 4^age;
	}
	
}


