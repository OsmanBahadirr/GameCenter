package Entities;

import abstracts.Entitiy;

public class Gamer implements Entitiy{
	private int id;
	private String name;
	private String lastName;
	private String nick;
	private String identityNumber;
	private String birthYear;
	
	public Gamer() {
		
	}
	public Gamer(int id, String name, String lastName,String nick, String identityNumber,String birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.nick = nick;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
}
