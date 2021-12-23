package application;
	
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




public class Main extends Application
{

	@Override
    public void start(Stage stage) throws Exception {
		
		
		/*session.save(pat);
		session.save(pat2);
		session.getTransaction().commit();*/
		
		//session.close();/*
		
	
		//System.out.println(factory);
		//System.out.println(factory.isClosed());
		
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("MEDICSi Health Care");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}