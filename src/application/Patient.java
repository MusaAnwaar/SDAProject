package application;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Patient {
	
	@Id
	private int id;
	
	private int age;
	
	private String name;
	
	private int cnic;
	
	private String email;
	
	public Patient(int id, int age, String name, int cnic, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.cnic = cnic;
		this.email = email;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnic() {
		return cnic;
	}
	public void setCnic(int cnic) {
		this.cnic = cnic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.age+" : "+this.cnic+" : "+this.email;
	}
	
	

   
}
