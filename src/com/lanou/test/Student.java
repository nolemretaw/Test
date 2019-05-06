package com.lanou.test;

public class Student {
	private static String name;
	private static int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		Student.name = name;
		Student.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Student.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		Student.age = age;
	}

	public static  void show() {
		System.out.println(name+"/"+age);
	}
}
