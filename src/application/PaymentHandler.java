package application;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PaymentHandler implements Initializable{
	@FXML
	TextField AppID=new TextField();
	
	@FXML
	TextField AppID2=new TextField();
	
	@FXML
	TextField name=new TextField();
	@FXML
	TextField cnic=new TextField();
	
	@FXML
	ComboBox<String> descBox=new ComboBox<String>();
	
	@FXML
	private Text Prompt=new Text();
	
	@FXML
	Label Fee=new Label();
	
	
	@FXML
    private void Payment(ActionEvent event)  throws IOException {
		MakePaymentController p=new MakePaymentController();
		int appid=Integer.parseInt(AppID2.getText());
		p.MakePayment(appid);//PaymentSuccessful
		//System.out.println(appid+"THIS SHOULD WORK");
		Parent CalenderView = FXMLLoader.load(getClass().getResource("PaymentSuccessful.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("");
		window.show();
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
			Fee.setText("Your payment is "+ String.valueOf(fee));
		}
		else
		{
			Prompt.setText("Appointment not found");
		}
		
	}
	@FXML
	private void ProceedToPay(ActionEvent event) throws IOException { 
		Parent CalenderView = FXMLLoader.load(getClass().getResource("MakePayment.fxml"));
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
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> BoxInfo=FXCollections.observableArrayList("Credit Card","Cash","Debit Card","Bank Transfer","Mobile Payment","Others");
		descBox.setItems(BoxInfo);

		
	}
}
