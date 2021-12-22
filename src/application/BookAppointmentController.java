package application;

import java.util.ArrayList;

public class BookAppointmentController {
	
	  private static Clinic clinic = null; 
	  public BookAppointmentController() {
			clinic = clinic.getInstance();
		}
	  public void BookAppointment(String service,int timem,int timeh,String date,String name,int age,int cnic,String email)
	  {
		 Appointment a= new Appointment();
		 a.Description=this.SearchCatalogue(service);
		 a.setTimeh(timeh);
		 a.setTimem(timem);
		 a.Date=date;
		 a.setAppointmentStatus(0);
		 a.payment =new Payment(); 
		 a.payment.Amount=a.Description.getFee();
		 a.payment.setPaidStatus(0);
		 a.booking=new Booking();
		 a.booking.setBookingStatus(1);
		 a.getBooking().setBookingRefCode(0);
		 /*a.getBooking().setDateBooking(date);*/
		 a.getBooking().setPatientDetails(age, name, cnic, email);
	  }
	  public AppointmentDescription SearchCatalogue(String service)
	  {
		  AppointmentDescription a= new AppointmentDescription();
		  AppointmentDescription b= new AppointmentDescription();
		  ArrayList<AppointmentDescription> AppointmentCatalogue=new ArrayList<AppointmentDescription>();
		  AppointmentCatalogue=clinic.getAppointmentCatalogue();
		  for(int i=0;i<AppointmentCatalogue.size();i++)
		  {
			  a=AppointmentCatalogue.get(i);
			  if(a.Name.compareTo(service)==0)
			  {
				  b=a;
			  }
		  }
		  return b;
	  }

}
