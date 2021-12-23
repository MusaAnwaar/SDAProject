package application;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Sr")
	private int fno;
	
	private String feedback;
	
	@Column(name="date_Added")
	@Temporal(TemporalType.DATE)
	private Date DateAdded;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int fno, String feedback, Date dateAdded) {
		super();
		this.fno = fno;
		this.feedback = feedback;
		DateAdded = dateAdded;
	}

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Date getDateAdded() {
		return DateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		DateAdded = dateAdded;
	}
	
}
