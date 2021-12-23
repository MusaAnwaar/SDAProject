package application;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int age;
	
	private String name;
	
	private int cnic;
	
	private String email;
	
	/*@OneToMany
	private List<Booking> bookings;*/
	
	
	public Patient(int id, int age, String name, int cnic, String email, List<Booking> Bookings) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.cnic = cnic;
		this.email = email;
		//this.bookings = Bookings;
	}
	public Patient() {
		//this.bookings =new Booking();
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
	

	/*public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.age+" : "+this.cnic+" : "+this.email;
	}
	
	

   
}
