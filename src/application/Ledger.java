package application;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ledger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RecordNo;//p.key
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="paymentID")
    Payment payment;
	
	@Column(name = "AmountPaid")
	private int paymentfee;
	
	@Temporal(TemporalType.DATE)
	private Date DateRecorded;

	public Ledger() {
		super();
		this.payment = new Payment();
		RecordNo = 0;
		paymentfee = 0;
		// TODO Auto-generated constructor stub
	}

	public Ledger(int recordNo, Payment payment, Date dateRecorded, int fee) {
		super();
		RecordNo = recordNo;
		this.payment = payment;
		DateRecorded = dateRecorded;
		paymentfee = fee;
	}
	
	public void setLedgerDetails(Payment payment,Date dateRecorded, int fee) {
		this.payment = payment;
		paymentfee = fee;
		DateRecorded = dateRecorded;
		DBHandler ins = new DBHandler();
        ins.LedgerDBHandler(this);
	}

		
	
	public int getPaymentfee() {
		return paymentfee;
	}

	public void setPaymentfee(int paymentfee) {
		this.paymentfee = paymentfee;
	}

	public int getRecordNo() {
		return RecordNo;
	}

	public void setRecordNo(int recordNo) {
		RecordNo = recordNo;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Date getDateRecorded() {
		return DateRecorded;
	}

	public void setDateRecorded(Date dateRecorded) {
		DateRecorded = dateRecorded;
	}
	
	
}
