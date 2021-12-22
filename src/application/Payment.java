package application;

public class Payment {
    int PaymentID;//p.key
    int Amount;//fee in Appointment Description
    int PaidStatus;
    String Mode;
    String DatePaid;

    public Payment(int paymentID, int amount, int paidStatus, String mode, String datePaid) {
        PaymentID = paymentID;
        Amount = amount;
        PaidStatus = paidStatus;
        Mode = mode;
        DatePaid = datePaid;
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

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public String getDatePaid() {
        return DatePaid;
    }

    public void setDatePaid(String datePaid) {
        DatePaid = datePaid;
    }
}
