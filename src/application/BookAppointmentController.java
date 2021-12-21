package application;

import java.util.ArrayList;

public class BookAppointmentController {
	
	  private static Clinic clinic = null; 
	  public BookAppointmentController() {
			clinic = clinic.getInstance();
		}
	  public void BookAppointment(String service,String time,String date)
	  {
//		 Appointment a= new Appointment();
//		 a.Description=this.SearchCatalogue(service);
//		 a.Time=time;
//		 a.Date=date;
//		 a.AppointmentStatus=0;
//		 a.payment.Amount=a.Description.getFee();
//		 a.payment.setPaidStatus(0);
		 
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
