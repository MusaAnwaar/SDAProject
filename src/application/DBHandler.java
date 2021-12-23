package application;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.collections.ObservableList;

public class DBHandler 
{	
	public void setFeedback(Feedback obj)
	{
		//Saving Feedback Object to DB
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public void getPatientProfiles()
	{
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		String query = "from Patient";
		Query q=session.createQuery(query);
		List<Patient> list=q.list(); 
		
		
	
		//Patient profile = (Patient)session.get(Patient.class, 1);
		session.close();
		factory.close();*/
		}
	public void PatientDBHandler(Patient obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void BookingDBHandler(Booking obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void AppointmentDBHandler(Appointment obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void DescriptionDBHandler(AppointmentDescription obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void PaymentDBHandler(Payment obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}

}
