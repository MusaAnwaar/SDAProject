package application;

public class Appointment {
    AppointmentDescription Description;
    Payment payment;
    Booking booking;
    int AppointmentID;//p.key
    String Time;
    String Date;
    int AppointmentStatus;

    
	
    public Appointment(AppointmentDescription description, Payment payment, Booking booking, int appointmentID,
			String time, String date, int appointmentStatus) {
		Description = description;
		this.payment = payment;
		this.booking = booking;
		AppointmentID = appointmentID;
		Time = time;
		Date = date;
		AppointmentStatus = appointmentStatus;
	}
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	public void setAppointmentDetails(AppointmentDescription description, Payment payment, Booking booking, int appointmentID,
			String time, String date, int appointmentStatus) {
		Description = description;
		this.payment = payment;
		this.booking = booking;
		AppointmentID = appointmentID;
		Time = time;
		Date = date;
		AppointmentStatus = appointmentStatus;
	}
    

    public int getAppointmentStatus() {
		return AppointmentStatus;
	}
	public void setAppointmentStatus(int appointmentStatus) {
		AppointmentStatus = appointmentStatus;
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

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
