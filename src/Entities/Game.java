package Entities;

import abstracts.Entitiy;

public class Game implements Entitiy {
	private int id;
	private String name;
	private double price;
	
	public Game() {
		
	}
	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
