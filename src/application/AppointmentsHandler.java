package application;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Stage;

public class AppointmentsHandler implements Initializable {

	
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
		TextField  name = new TextField();
		@FXML
		TextField  age = new TextField();
		@FXML
		TextField  cnic = new TextField();
		@FXML
		TextField  email = new TextField();
		
		@FXML
		TextField  year = new TextField();
		
		@FXML
		Label o;
		
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
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Reschedule_Appointment.fxml"));
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

		@Override
		public void initialize(URL Location, ResourceBundle resources) {
			
			ObservableList<String> BoxInfo=FXCollections.observableArrayList("Regular Check-up","Teeth whitening","Crowning","Denture","Scaling",
																		"Invisible braces","Polishing","Root Canal","Implant","Tooth Extraction");
			descBox.setItems(BoxInfo);
			
			
		}

}
