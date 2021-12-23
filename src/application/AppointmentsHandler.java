package application;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppointmentsHandler implements Initializable {

		//For booking Appointment
		@FXML
		ComboBox<String> descBox=new ComboBox<String>();
		
		@FXML
		TextField  timem = new TextField();
		@FXML
		TextField  timeh = new TextField();
		@FXML
		TextField  day = new TextField();
		@FXML
		TextField  month = new TextField();
		@FXML
		TextField  year = new TextField();
		
		@FXML
		TextField  name = new TextField();
		@FXML
		TextField  age = new TextField();
		@FXML
		TextField  cnic = new TextField();
		@FXML
		TextField  email = new TextField();
		
		@FXML
		private Text Prompb=new Text();
		
		//For canceling Appointment
		@FXML
		TextField AppID=new TextField();
		@FXML
		TextField name1=new TextField();
		@FXML
		TextField cnic1=new TextField();
		
		@FXML
		private Text Promptc=new Text();
		
		//For rescheduling Appointment
		@FXML
		TextField AppID2=new TextField();
		@FXML
		TextField name2=new TextField();
		@FXML
		TextField cnic2=new TextField();
				
		@FXML
		private Text Promptd=new Text();
		
		//For rescheduling booking
		@FXML
		ComboBox<String> descBox1=new ComboBox<String>();
				
		@FXML
		TextField  timem1 = new TextField();
		@FXML
		TextField  timeh1 = new TextField();
		@FXML
		TextField  day1 = new TextField();
		@FXML
		TextField  month1 = new TextField();
		@FXML
		TextField  year1 = new TextField();
				
		@FXML
		TextField  name0 = new TextField();
		@FXML
		TextField  age0 = new TextField();
		@FXML
		TextField  cnic0 = new TextField();
		@FXML
		TextField  email0 = new TextField();
				
		@FXML
		private Text Prompta=new Text();
		
		
		private static Clinic clinic = null; 
		  public AppointmentsHandler() {
				clinic = clinic.getInstance();
			}
		
		@FXML
	    private void Book_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Book_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	   
	    @FXML
	    private void Cancel_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Cancel_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void view_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("View_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void Reschedule_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("CancelAppointmentToReschedule.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void home(ActionEvent event) throws IOException {
	    	Parent HomeView = FXMLLoader.load(getClass().getResource("Main_Menu.fxml"));
			Scene HomeScene=  new Scene(HomeView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Main Menu");
			window.show();
	    }
	    
	    @FXML
	    private void AddAppointmentDetails(ActionEvent event) throws IOException
	    {
	    	BookAppointmentController b=new BookAppointmentController();
	    	String service=descBox.getValue();
	    	int Timem=Integer.parseInt(timem.getText());
	    	int Timeh=Integer.parseInt(timeh.getText());
	    	String Date=(year.getText()+"-"+month.getText()+"-"+day.getText());
	    	String Name=name.getText();
	    	int Age=Integer.parseInt(age.getText());
	    	int Cnic=Integer.parseInt(cnic.getText());
	    	String Email=email.getText();
	    	b.BookAppointment(service, Timem,Timeh, Date,Name,Age,Cnic,Email);
	    	Parent HomeView = FXMLLoader.load(getClass().getResource("AppointmentBookingSuccessful.fxml"));
			Scene HomeScene=  new Scene(HomeView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Main Menu");
			window.show();
	    		
	    }
	    @FXML
		private void getCancelled(ActionEvent event) throws IOException { 
	    	
	    	int check=0;
			int appid=Integer.parseInt(AppID.getText());
			String Name=name1.getText();
			int Cnic=Integer.parseInt(cnic1.getText());
			CancelAppointmentController c=new CancelAppointmentController();
			check=c.CancelAppointment(appid, Name, Cnic);
			if(check!=0)
			{	
				Parent CalenderView = FXMLLoader.load(getClass().getResource("AppointmentCancellationSuccessful.fxml"));
				Scene CalenderScene=  new Scene(CalenderView);
				Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
				window.setScene(CalenderScene);
				window.setTitle("");
				window.show();
			}
			else
			{
				Promptc.setText("Appointment not found");
			}
			
		}
	    @FXML
		private void CanceltoReschedule(ActionEvent event) throws IOException { 
	    	
	    	int check=0;
			int appid=Integer.parseInt(AppID2.getText());
			String Name=name2.getText();
			int Cnic=Integer.parseInt(cnic2.getText());
			CancelAppointmentController c=new CancelAppointmentController();
			check=c.CancelAppointment(appid, Name, Cnic);
			if(check!=0)
			{	
				Parent CalenderView = FXMLLoader.load(getClass().getResource("RescheduleAppointment.fxml"));
				Scene CalenderScene=  new Scene(CalenderView);
				Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
				window.setScene(CalenderScene);
				window.setTitle("");
				window.show();
			}
			else
			{
				Promptd.setText("Appointment not found");
			}
			
		}
	    
	    @FXML
	    private void RescheduleAddAppointmentDetails(ActionEvent event) throws IOException
	    {
	    	BookAppointmentController b=new BookAppointmentController();
	    	String service=descBox1.getValue();
	    	int Timem=Integer.parseInt(timem1.getText());
	    	int Timeh=Integer.parseInt(timeh1.getText());
	    	String Date=day1.getText()+"-"+month1.getText()+"-"+year1.getText();
	    	String Name=name0.getText();
	    	int Age=Integer.parseInt(age0.getText());
	    	int Cnic=Integer.parseInt(cnic0.getText());
	    	String Email=email0.getText();
	    	b.BookAppointment(service, Timem,Timeh, Date,Name,Age,Cnic,Email);
	    	Parent HomeView = FXMLLoader.load(getClass().getResource("AppointmentBookingSuccessful.fxml"));
			Scene HomeScene=  new Scene(HomeView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Main Menu");
			window.show();	
	    }

		@Override
		public void initialize(URL Location, ResourceBundle resources) {
			
			ObservableList<String> BoxInfo=FXCollections.observableArrayList("Regular Check-up","Teeth whitening","Crowning","Denture","Scaling",
																		"Invisible braces","Polishing","Root Canal","Implant","Tooth Extraction");
			descBox.setItems(BoxInfo);
			
			descBox1.setItems(BoxInfo);
			
			
		}

}
