package application;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {
	
	@OneToOne
	@JoinColumn(name="appdesc_id")
    AppointmentDescription Description;
    
    @OneToOne	
    @JoinColumn(name="paymentID")
    Payment payment;
    
    @OneToOne
    @JoinColumn(name="bookingID")
    Booking booking;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AppointmentID;//p.key
    
    private int Timem;
    private int Timeh;
    
    //@Temporal(TemporalType.DATE)
    private String AppDate;
    
    
    private int AppointmentStatus;

    
	
    public Appointment(AppointmentDescription description, Payment payment, Booking booking, int appointmentID,
		int timem, int timeh, String date, int appointmentStatus) {
		this.Description = description;
		this.payment = payment;
		this.booking = booking;
		AppointmentID = appointmentID;
		Timem = timem;
		Timeh = timeh;
		AppDate = date;
		AppointmentStatus = appointmentStatus;
	}
	
	public Appointment() {
		this.payment=new Payment();
		this.booking=new Booking();
		this.Description= new AppointmentDescription();
		int AppointmentID=0;//p.key
		int Timem=0;
		int Timeh=0;
		String AppDate="";
		int AppointmentStatus=0;

	}
	public void setAppointmentDetails(AppointmentDescription description, Payment payment,Booking booking,
			int timem, int timeh, String date, int appointmentStatus) {
		this.Description = description;
		this.payment = payment;
		this.booking = booking;
		//AppointmentID = appointmentID;
		Timem = timem;
		Timeh = timeh;
		AppDate = date;
		AppointmentStatus = appointmentStatus;
		
		DBHandler ins = new DBHandler();
		ins.AppointmentDBHandler(this);
	}

	public AppointmentDescription getDescription() {
		return Description;
	}

	public void setDescription(AppointmentDescription description) {
		Description = description;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getAppointmentID() {
		return AppointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		AppointmentID = appointmentID;
	}

	public int getTimem() {
		return Timem;
	}

	public void setTimem(int timem) {
		Timem = timem;
	}

	public int getTimeh() {
		return Timeh;
	}

	public void setTimeh(int timeh) {
		Timeh = timeh;
	}

	public String getAppDate() {
		return AppDate;
	}

	public void setAppDate(String appDate) {
		AppDate = appDate;
	}

	public int getAppointmentStatus() {
		return AppointmentStatus;
	}

	public void setAppointmentStatus(int appointmentStatus) {
		AppointmentStatus = appointmentStatus;
	}
	
}
