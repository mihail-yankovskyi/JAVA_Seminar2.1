package model;
//import model.Vehicle;

public class Bus extends Vehicle {
	private int numberOfSeats;
	private boolean hasBaggageDivision; 
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int seats) {
		if(seats < 0)
			this.numberOfSeats=30;
		else
			this.numberOfSeats = seats;
	}
	
	public boolean getHasBaggageDivision() {
		return hasBaggageDivision;
	}
	
	public void setHasBaggageDivision(boolean baggage) {
		this.hasBaggageDivision = baggage;
	}
	
	public Bus() {
		setNumberOfSeats(20);
		setHasBaggageDivision(true);
	}
	
	public Bus(int seats, boolean baggage) {
		setNumberOfSeats(seats);
		setHasBaggageDivision(baggage);
	}
	
	public String toString() {
		return "Number of seats: " + numberOfSeats + " .Has baggage division:  " + hasBaggageDivision;
	}
	
}
