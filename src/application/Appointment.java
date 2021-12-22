package application;

public class Appointment {
    AppointmentDescription Description;
    Payment payment;
    Booking booking;
    int AppointmentID;//p.key
    int Timem;
    int Timeh;
    String Date;
    int AppointmentStatus;

    
	
    public Appointment(AppointmentDescription description, Payment payment, Booking booking, int appointmentID,
			int timem, int timeh, String date, int appointmentStatus) {
		Description = description;
		this.payment = payment;
		this.booking = booking;
		AppointmentID = appointmentID;
		Timem = timem;
		Timeh = timeh;
		Date = date;
		AppointmentStatus = appointmentStatus;
	}
	
	public Appointment() {
		this.payment=new Payment();
		this.booking=new Booking();
		this.Description= new AppointmentDescription();
		int AppointmentID=0;//p.key
		int Timem=0;
		int Timeh=0;
		String Date="";
		int AppointmentStatus=0;

	}
	public void setAppointmentDetails(AppointmentDescription description, Payment payment, Booking booking, int appointmentID,
			int timem, int timeh, String date, int appointmentStatus) {
		Description = description;
		this.payment = payment;
		this.booking = booking;
		AppointmentID = appointmentID;
		Timem = timem;
		Timeh = timeh;
		Date = date;
		AppointmentStatus = appointmentStatus;
	}
    public int getAppointmentStatus() {
		return AppointmentStatus;
	}
	public void setAppointmentStatus(int appointmentStatus) {
		AppointmentStatus = appointmentStatus;
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


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
