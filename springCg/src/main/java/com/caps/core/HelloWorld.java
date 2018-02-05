package com.caps.core;

public class HelloWorld {
	private String name;
	private String mobileno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public void printHello()
	{
		System.out.println("String 3 : Hello : " + name + "\nYour Mobile no. is : "+ mobileno);
	}
}
