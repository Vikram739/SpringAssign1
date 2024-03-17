package com.mortal.springCar;

public class Car {
	private String name;
	private String color;
	private String fuelType;
	private double milage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fuelType=" + fuelType + ", milage=" + milage + "]";
	}
		
}
