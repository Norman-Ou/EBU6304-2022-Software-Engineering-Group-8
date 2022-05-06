package Beans.Flight.SubClasses;

import Beans.Passenger.Passenger;

/**
 * This is the basic Seat information class
 *
 * @author Jiacheng Li
 * @version 1.3 April 16th, 2022
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
     * Default constructor
     */
    public Seat() {}

    public Seat(int seatClass,
                String seatNo,
                boolean lockedStatus,
                Passenger passenger)
    {
        this.seatClass = seatClass;
        this.seatNo = seatNo;
        this.lockedStatus = lockedStatus;
        this.passenger = passenger;
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
    public boolean isLocked() {return lockedStatus;}
    public Passenger getPassenger() {return passenger;}

    /**
     * Modifiers of Seat
     */
    public void setSeatClass(int seatClass) {this.seatClass = seatClass;}
    public void setSeatNo(String seatNo) {this.seatNo = seatNo;}
    public void setLockedStatus(boolean lockedStatus) {this.lockedStatus = lockedStatus;}
    public void setPassenger(Passenger passenger) {this.passenger = passenger;}
}
