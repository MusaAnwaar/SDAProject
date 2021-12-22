package application;

public class Ledger {
    int RecordNo;//p.key
    Payment payment;

    public Ledger() {
		RecordNo=0;
		payment=new Payment();
	}

	public Ledger(int recordNo, Payment payment) {
        RecordNo = recordNo;
        this.payment = payment;
    }

    public void setLedgerDetails(int recordNo, Payment payment) {
        RecordNo = recordNo;
        this.payment = payment;
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
}
