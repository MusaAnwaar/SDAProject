package application;

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
import java.util.ResourceBundle;

public class PatientViewHandler implements Initializable{

    @FXML
    private TableColumn<Patient, Integer> CNICColumn;

    @FXML
    private TableColumn<Patient,String> EmailColumn;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<Patient> PersonView;

    @FXML
    private Button modifyButton;

    @FXML
    private TableColumn<Patient, Integer> PatientIDColumn;

    @FXML
    private TableColumn<Patient,String> NameColumn;

    @FXML
    private TableColumn<Patient, Integer> AgeColumn;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label titleLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Patient> person = FXCollections.observableArrayList(
        new Patient(12,20,"Moosa", 12345678,"moosa@gmail.com"),
                new Patient(22,21,"Zainab", 45565556, "zainab@gmail.com"),
                new Patient(33,60,"Rafia", 57543535, "rafia@gmail.com")
            );

        //int id, int age, String name, String cnic, String email

        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        PatientIDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        AgeColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        CNICColumn.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        EmailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        //add your data to the table here.
        PersonView.setItems(person);
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
