package Beans.Order;

/**
 * This is the class definition of booking order
 *
 * @author Ruizhe Ou
 * @author Jiacheng Li
 * @version 1.0 May 2nd, 2022
 */
public class Order {
    /**
     * Personal id of the passenger.<br/><br/>
     * Default Value: null
     */
    private String passengerID;
    /**
     * Number of the flight.<br/><br/>
     * Default Value: null
     */
    private String flightNo;
    /**
     * Booking number of the passenger.<br/><br/>
     * Default Value: null
     */
    private String bookNumber;
    /**
     * Class of a certain seat.<br/><br/>
     * Class No:<br/>
     * <b>0</b> - Economy class<br/>
     * <b>1</b> - First class<br/>
     * <b>2</b> - Business class<br/><br/>
     * Default Value: -1
     */
    private int seatClass = -1;

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

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

    public int getSeatClass() { return seatClass; }

    public void setSeatClass(int seatClass) { this.seatClass = seatClass; }

    public Order(String passengerID, String flightNo, String bookNumber) {
        this.passengerID = passengerID;
        this.flightNo = flightNo;
        this.bookNumber = bookNumber;
    }
}
