package cs20b_project1;

public class Car extends Vehicle {

	//Variables
	private int passengerCount;
	private Engine engine;
	
	//Constructors (Overloading Constructor)
	public Car() {}
	public Car (int passengerCount, Engine engine, String make, String model, String color, int year) {
		
		this.setPassengerCount(passengerCount);
		this.setEngine(engine);
	}
	
	//Getters & Setters
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//To-String Method
	public String toString() {
		StringBuilder str=new StringBuilder();
	   	str.append(super.toString() + "engine: ");
		str.append(this.getEngine() +"\n");  
		str.append(this.getPassengerCount());
		//Return Results
		return str.toString();
	}
}
