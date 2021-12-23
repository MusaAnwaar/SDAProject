package application;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int PaymentID;//p.key
	
    int Amount;//fee in Appointment Description
    
    int PaidStatus;
    
    //String Mode;
    @Temporal(TemporalType.DATE)
    @Transient
    private Date DatePaid;

    public Payment(int paymentID,int amount, int paidStatus, String mode, Date datePaid) {
        PaymentID = paymentID;
        Amount = amount;
        PaidStatus = paidStatus;
        //Mode = mode;
        DatePaid = datePaid;
    }
    


    public void setPaymentDetails( int amount, int paidStatus) {
        Amount = amount;
        PaidStatus = paidStatus;
        
        DBHandler ins = new DBHandler();
        ins.PaymentDBHandler(this);
    
    }
    public Payment() {
		// TODO Auto-generated constructor stub
	}



	public int getPaymentID() {
		return PaymentID;
	}



	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}



	public int getAmount() {
		return Amount;
	}



	public void setAmount(int amount) {
		Amount = amount;
	}



	public int getPaidStatus() {
		return PaidStatus;
	}



	public void setPaidStatus(int paidStatus) {
		PaidStatus = paidStatus;
	}



	public Date getDatePaid() {
		return DatePaid;
	}



	public void setDatePaid(Date datePaid) {
		DatePaid = datePaid;
	}

	
}
