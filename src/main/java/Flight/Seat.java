package Flight;

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
     * Default Value: "default"
     */
    private String seatNo = "default";
    /**
     * Flight number.<br/><br/>
     * Default Value: "default"
     */
    private String flightNo;
    /**
     * passenger id of this seat.<br/><br/>
     * Default Value: -1
     */
    private int passengerID = -1;
    /**
     * Whether this seat has been chosen.<br/><br/>
     * Default Value: false
     */
    private boolean lockedStatus = false;

    public Seat() {}

    public Seat(int sClass, String seatNo) {
        this.seatClass = sClass;
        this.seatNo = seatNo;
    }

    /**
     * Accessors of Seat
     */
    public int getSeatClass() {return seatClass;}
    public String getSeatNo() {return seatNo;}
    public String getFlightNo() {return flightNo;}
    public int getPassengerID() {return passengerID;}
    public boolean isLockedStatus() {return lockedStatus;}

    /**
     * Modifiers of Seat
     */
    public void setSeatClass(int seatClass) {this.seatClass = seatClass;}
    public void setSeatNo(String seatNo) {this.seatNo = seatNo;}
    public void setFlightNo(String flightNo) {this.flightNo = flightNo;}
    public void setPassengerID(int passengerID) {this.passengerID = passengerID;}
    public void setLockStatus(boolean lockStatus) {this.lockedStatus = lockStatus;}
}
