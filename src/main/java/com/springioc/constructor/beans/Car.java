package com.springioc.constructor.beans;

public class Car {
	private String name;
	private String cost;

	public Car(String name, String cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", cost=" + cost + "]";
	}

	

}
