package application;

import java.io.IOException;

//import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClinicHandler {

	@FXML
	Button login;

	@FXML
	Button Re_login;
	
	@FXML
	Button Home;
	
	@FXML
	TextArea feedback;

	@FXML
	Button Submit;
	
/*	@FXML
	TextField []  tf ;
*/	
	@FXML
	TextField  user_n = new TextField();
	
	@FXML
	TextField pass_w = new TextField();
	
	@FXML
	TextField  appointment_id = new TextField();
	
	@FXML
	TextField patient_id = new TextField();
	
	
/*	@FXML
	TextField InvDisp= new TextField();
*/
	//hello from zainab
	String str1 = "a";
	String str2 = "a";
	String str3 = "1";
	String str4 = "2";
	
	
	private static Clinic clinic;

	public ClinicHandler() {
		clinic = clinic.getInstance();
	}
    @FXML
    private void LogIn() throws IOException {
    	//clinic.fill();
      
    	String username = user_n.getText();
        String password = pass_w.getText();
        if (username.equals(str1) && password.equals(str2)) {
    		Stage stage = (Stage) login.getScene().getWindow();
   	     
    	    stage.close();
    	    
    	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
    	     getResource("Main_Menu.fxml")));
    		 Stage primaryStage1 = new Stage();
    		 primaryStage1.setScene(quizScene);
    		 primaryStage1.show();
        }
        
        else {
    		Stage stage = (Stage) login.getScene().getWindow();
      	     
    	    stage.close();

    	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
    	     getResource("Re_Login.fxml")));
    		 Stage primaryStage1 = new Stage();
    		 primaryStage1.setScene(quizScene);
    		 primaryStage1.show();
        }
        
    }
    
   
    
    @FXML
    private void  Appointmentoptions(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("AppointmentOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    
    @FXML
    private void  PrescriptionOptions(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("PrescriptionOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
   
    @FXML
    private void  Prescribe_patient(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("PrescriptionOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    @FXML
    private void  Edit_prescription(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("PrescriptionOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
   
    @FXML
    private void  View_prescription(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("PrescriptionOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    
    @FXML
    private void  ProfileOptions(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("ProfileOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    @FXML
    private void  ViewStaffProfiles(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("ProfileOptions.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    @FXML
    private void  ViewPatientProfile(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("PatientView.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    @FXML
    private void  Give_Feedback(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Give_Feedback.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
    }
    
    @FXML
    private void Enter_Feedback(ActionEvent event) throws IOException {
    	String feedbackk=feedback.getText();
    	clinic.setFeedback(feedbackk);
    	System.out.print(feedbackk);
    }
    @FXML
    private void Cancelled() throws IOException {
    	String p_id = patient_id.getText();
        String app_id = appointment_id.getText();
        if (p_id.equals(str3) && app_id.equals(str4)) {
			Stage stage = (Stage) Submit.getScene().getWindow();
	 	     
		    stage.close();
	
		     Scene quizScene = new Scene(FXMLLoader.load(getClass().
		     getResource("Cancellation.fxml")));
			 Stage primaryStage1 = new Stage();
			 primaryStage1.setScene(quizScene);
			 primaryStage1.show();
        }
        
        else {
			Stage stage = (Stage) Submit.getScene().getWindow();
	 	     
		    stage.close();
	
		     Scene quizScene = new Scene(FXMLLoader.load(getClass().
		     getResource("Re_Cancel.fxml")));
			 Stage primaryStage1 = new Stage();
			 primaryStage1.setScene(quizScene);
			 primaryStage1.show();
        }
    }
    
    @FXML
    private void Make_Payment(ActionEvent event) throws IOException {
    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Make_payment.fxml"));
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
    
    
    


}