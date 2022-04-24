package Beans.Order;

public class Order {
    private String passengerID;
    private String flightNo;

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Order(String passengerID, String flightNo) {
        this.passengerID = passengerID;
        this.flightNo = flightNo;
    }
}
