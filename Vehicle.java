package cs20b_project1;

public class Vehicle {
//Variables
	private String make;
	private String model;
	private int year;
	private String color;
	
	//Constructor
	public Vehicle() {}
	
	//Getters & Setters
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if (year < 1920 || year > 2018) {
			System.out.println("Year make is out of bounds");
		} else {
		this.year = year;
		}
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//To-String Method
	public String toString() {
		StringBuilder str=new StringBuilder();
		str.append(this.getYear()+", ");
	   	str.append(this.getMake()+", ");
	   	str.append(this.getModel()+", ");
	   	str.append(this.getColor()+"\n");
	    //Return Results
	   	return str.toString();
	}
}
