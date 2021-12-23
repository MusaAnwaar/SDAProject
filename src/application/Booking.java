package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookingRefCode;//p.key
	
	@OneToOne
	@JoinColumn(name="pid")
    Patient patient;
	
	/*@OneToOne(mappedBy = "Appointment")
	@JoinColumn(name="app_id")
	Appointment appointment;*/
    
    @Column(name="Status")
    private int BookingStatus;
    
    @Temporal(TemporalType.DATE)
    private Date DateBooking;

    
	public Booking() {
		this.patient=new Patient();
		//this.appointment=new Appointment();
		BookingRefCode=0;//p.key
		BookingStatus=0;
		//DateBooking=0;
	}
	
	

	public Booking(int bookingRefCode, Patient patient, Appointment appointment,int bookingStatus, Date dateBooking) {
		super();
		BookingRefCode = bookingRefCode;
		this.patient = patient;
		//this.appointment = appointment;
		BookingStatus = bookingStatus;
		DateBooking = dateBooking;
	}

	


	public int getBookingRefCode() {
		return BookingRefCode;
	}



	public void setBookingRefCode(int bookingRefCode) {
		BookingRefCode = bookingRefCode;
	}



/*	public Appointment getAppointment() {
		return appointment;
	}



	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}*/



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public int getBookingStatus() {
		return BookingStatus;
	}



	public void setBookingStatus(int bookingStatus) {
		BookingStatus = bookingStatus;
	}



	public Date getDateBooking() {
		return DateBooking;
	}



	public void setDateBooking(Date dateBooking) {
		DateBooking = dateBooking;
	}



	public void setBookingDetails(int bookingStatus, Date dateBooking)
    {
        BookingStatus = bookingStatus;
        DateBooking = dateBooking;
        
                
        DBHandler ins = new DBHandler();
        ins.BookingDBHandler(this);
        
    }
    
    public void setPatientDetails(int age, String name, int cnic, String email) {

		this.patient.setAge(age);
		this.patient.setName(name);
		this.patient.setCnic(cnic);
		this.patient.setEmail(email);
		DBHandler ins = new DBHandler();
		ins.PatientDBHandler(patient);
	}
}
