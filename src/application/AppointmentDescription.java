package application;

public class AppointmentDescription {
    int ServiceID;//p.key
    String Name;
    int Fee;

    public AppointmentDescription(int serviceID, String name, int fee) {
        ServiceID = serviceID;
        Name = name;
        Fee = fee;
    }

    public AppointmentDescription() {
		// TODO Auto-generated constructor stub
	}

	public int getServiceID() {
        return ServiceID;
    }

    public void setServiceID(int serviceID) {
        ServiceID = serviceID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int fee) {
        Fee = fee;
    }
}
