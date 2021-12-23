package application;

import java.util.ArrayList;

public class MakePaymentController {
	
	 private static Clinic clinic = null; 
	  public MakePaymentController() {
			clinic = clinic.getInstance();
		}
	  public int getFee(int appID,String name,int cnic)
	  {
		  int Fee=0;
		  ArrayList<Appointment> AppSchedule=new ArrayList<Appointment>();
		  AppSchedule=clinic.getAppointmentSchedule();
		  for(int i=0;i<AppSchedule.size();i++)
		  {
			  if(AppSchedule.get(i).getAppointmentID()==appID)
			  {
				  if(name.compareTo(AppSchedule.get(i).getBooking().getPatient().getName())==0)
				  {
					  if(AppSchedule.get(i).getBooking().getPatient().getCnic()==cnic)
					  {
						  Fee=AppSchedule.get(i).getPayment().getAmount();
					  }
				  }
			  }
				  
		  }
		  return Fee;
		  
	  }

}
