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
		
		/*SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating Patient
		Patient pat = new Patient();
		//pat.setId(2);;
		pat.setAge(20);
		pat.setName("Zainab");
		pat.setCnic(12);
		pat.setEmail("zainoob@yahoo.com");
		
		Patient pat2 = new Patient();
		//pat2.setId(3);;
		pat2.setAge(20);
		pat2.setName("Musa");
		pat2.setCnic(11);
		pat2.setEmail("zainoob@yahoo.com");
		//System.out.println(pat);
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(pat);
		session.save(pat2);
		session.getTransaction().commit();
		
		session.close();/*
		
		Feedback f = new Feedback();
		f.setFeedback("musa");
		f.setDateAdded(new Date());
	
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(f);
		
		session.getTransaction().commit();
		
		session.close();*/
		
		
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