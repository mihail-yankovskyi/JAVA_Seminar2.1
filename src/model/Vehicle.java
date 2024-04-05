package model;
import model.EnergyType;

public class Vehicle {
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private int quantity;
	private EnergyType eType;
	
	private static int counter = 0;
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = counter;
		counter++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCode() {
		return vehicleCode;
	}
	
	public void setCode() {
		this.vehicleCode = id +"_"+ title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		if(price < 0) {
			this.price = 10000;
		} else {
			this.price = price;
		}
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 1;
		} else {
			this.quantity = quantity;
		}
	}
	
	public EnergyType getEnergyType() {
		return eType;
	}
	
	public void setEnergyType(EnergyType eType) {
		this.eType = eType;
	}
	
	public Vehicle() {
		setId();
		setTitle("Porshe");
		setCode();
		setPrice(100000);
		setEnergyType(EnergyType.petrol);
	}
	
	public Vehicle(String title, int quantity, float price, EnergyType eType) {
		setId();
		setTitle(title);
		setCode();
		setQuantity(quantity);
		setPrice(price);
		setEnergyType(eType);
	}
	
	public String toString() {
		return id + " " + title + " " + quantity + " " + price + " " + eType;
	}
	
	
	
	
}

