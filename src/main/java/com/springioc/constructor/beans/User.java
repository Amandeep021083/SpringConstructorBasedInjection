package com.springioc.constructor.beans;

public class User {

	private String name;
	private Car car;

	public User(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", car=" + car.toString() + "]";
	}

}
