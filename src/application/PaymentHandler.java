package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PaymentHandler {
	
	@FXML
	Button Pay;
	@FXML
	TextField AppID=new TextField();
	@FXML
	TextField name=new TextField();
	@FXML
	TextField cnic=new TextField();
	@FXML 
	Label Fee=new Label();
	
	@FXML
	private Text Prompt=new Text();
	
	@FXML
    private void Payment(ActionEvent event)  throws IOException {
		Stage stage = (Stage) Pay.getScene().getWindow();
 	     
	     stage.close();
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("PaymentSuccessful.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
    }
	@FXML
	private void getFee(ActionEvent event) throws IOException { 
		int appid=Integer.parseInt(AppID.getText());
		String Name=name.getText();
		int Cnic=Integer.parseInt(cnic.getText());
		MakePaymentController p=new MakePaymentController();
		int fee=p.getFee(appid, Name, Cnic);
		
		if(fee!=0)
		{	
			System.out.println(fee);
			Fee.setText(String.valueOf(fee));
			Parent CalenderView = FXMLLoader.load(getClass().getResource("MakePayment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
		}
		else
		{
			Prompt.setText("Appointment not found");
		}
		
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
