package application;

import javafx.beans.property.SimpleStringProperty;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppointmentsViewHandler implements Initializable{

    @FXML
    private TableColumn<Appointment, Integer> AppID;

    @FXML
    private TableColumn<Appointment,String> AppDate;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<Appointment> AppointmentsView;
    
    @FXML
    private TableView<String> TimeView;
    
    @FXML
    private TableView<String> PatientNameView;
    
    @FXML
    private TableView<String> BookingStatusView;

    @FXML
    private Button modifyButton;

    @FXML
    private TableColumn<String, String> AppTime;

    @FXML
    private TableColumn<String,String> PatientName;

    @FXML
    private TableColumn<String, String> BookedStatus;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label titleLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		//Put in DB handler
		Session session = factory.openSession();
		String query = "from Appointment";
		Query q=session.createQuery(query);
		
		
		
		List<Appointment> list=q.list(); 
		List<String> list1=new ArrayList();
		List<String> list2=new ArrayList();
		List<String> list3=new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).booking.getBookingStatus()==0)
			{
				list1.add("NotBooked");
			}
			else
			{
				list1.add("Booked");
			}
		}
		for(int i=0;i<list.size();i++)
		{
			list2.add(list.get(i).getBooking().getPatient().getName());
		}
		for(int i=0;i<list.size();i++)
		{
			list3.add(String.valueOf(list.get(i).getTimeh())+":"+String.valueOf(list.get(i).getTimem()));
		}
		
		ObservableList<Appointment> appointments = FXCollections.observableArrayList(q.list());
		ObservableList<String> time = FXCollections.observableArrayList(list3);
		ObservableList<String> names = FXCollections.observableArrayList(list2);
		ObservableList<String> bookings = FXCollections.observableArrayList(list1);

        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
		AppID.setCellValueFactory(new PropertyValueFactory<>("AppointmentID"));
		AppDate.setCellValueFactory(new PropertyValueFactory<>("AppDate"));
		AppTime.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
		PatientName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
		BookedStatus.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
        //add your data to the table here.
        AppointmentsView.setItems(appointments);
        TimeView.setItems(time);
        PatientNameView.setItems(names);
        BookingStatusView.setItems(bookings);
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
    void handleDeleteButton(ActionEvent event) {

    }

    @FXML
    void handleModifyButton(ActionEvent event) {

    }

    @FXML
    void handleSearchButton(ActionEvent event) {
    }
}
