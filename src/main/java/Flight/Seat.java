package Flight;

import Passenger.Passenger;

/**
 * This is the basic Seat information class
 *
 * @author Jiacheng Li
 * @version 1.2 March 24th, 2022
 */
public class Seat {
    /**
     * Class of a certain seat.<br/><br/>
     * Class No:<br/>
     * <b>0</b> - Economy class<br/>
     * <b>1</b> - First class<br/>
     * <b>2</b> - Business class<br/><br/>
     * Default Value: -1
     */
    private int seatClass = -1;
    /**
     * Seat number.<br/><br/>
     * Default Value: null
     */
    private String seatNo;
    /**
     * Flight number.<br/><br/>
     * Default Value: "default"
     */
    private String flightNo;
    /**
     * passenger id of this seat.<br/><br/>
     * Default Value: -1
     */
    private String passengerID;
    /**
     * Whether this seat has been chosen.<br/><br/>
     * Default Value: false
     */
    private boolean lockedStatus = false;
    /**
     * Passenger of this seat.<br/><br/>
     * Default Value: null
     */
    private Passenger passenger;
    /**
     * Check-in status of the passenger.<br/><br/>
     *
     * Status No: <br/>
     * <b>-1</b> means <b>Not check-in yet</b><br/>
     * <b>0</b> means <b>Check-in complete but not onboard</b><br/>
     * <b>1</b> means <b>Check-in and onboard</b><br/><br/>
     *
     * Default Value: -1
     */
    private int checkInStatus = -1;

    /**
     * Default constructor
     */
    public Seat() {}

    public Seat(int seatClass,
                String seatNo,
                String flightNo,
                String passengerID,
                boolean lockedStatus,
                Passenger passenger,
                int checkInStatus)
    {
        this.seatClass = seatClass;
        this.seatNo = seatNo;
        this.flightNo = flightNo;
        this.passengerID = passengerID;
        this.lockedStatus = lockedStatus;
        this.passenger = passenger;
        this.checkInStatus = checkInStatus;
    }

    public Seat(int seatClass, String seatNo) {
        this.seatClass = seatClass;
        this.seatNo = seatNo;
    }

    /**
     * Accessors of Seat
     */
    public int getSeatClass() {return seatClass;}
    public String getSeatNo() {return seatNo;}
    public String getFlightNo() {return flightNo;}
    public String getPassengerID() {return passengerID;}
    public boolean isLockedStatus() {return lockedStatus;}
    public Passenger getPassenger() {return passenger;}
    public int getCheckinStatus() {return checkInStatus;}

    /**
     * Modifiers of Seat
     */
    public void setSeatClass(int seatClass) {this.seatClass = seatClass;}
    public void setSeatNo(String seatNo) {this.seatNo = seatNo;}
    public void setFlightNo(String flightNo) {this.flightNo = flightNo;}
    public void setPassengerID(String passengerID) {this.passengerID = passengerID;}
    public void setLockedStatus(boolean lockedStatus) {this.lockedStatus = lockedStatus;}
    public void setPassenger(Passenger passenger) {this.passenger = passenger;}
    public void setCheckinStatus(int checkInStatus) {this.checkInStatus = checkInStatus;}
}
