package Passenger;


/**
 * This is the basic Passenger information class
 *
 * @author Jiayi Wang
 * @author Ruizhe Ou
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class BoardingPass {
    /**
     * Number of the flight.<br/><br/>
     * Default Value: null
     */
    private String flightNo;
    /**
     * Seat number.<br/><br/>
     * Default Value: null
     */
    private String seatNo;
    /**
     * Boarding gate of the flight.<br/><br/>
     * Default Value: null
     */
    private String gate;
    /**
     * Flight's Estimated Time of Departure.<br/><br/>
     * Default Value: null
     */
    private String ETD;
    /**
     * Flight's Estimated Time of when boarding gate will be closed.<br/><br/>
     * Default Value: null
     */
    private String ETC;
    /**
     * Flight's Estimated Time of Arrival.<br/><br/>
     * Default Value: null
     */
    private String ETA;

    /**
     * Default constructor
     */
    public BoardingPass() {}

    /**
     * Accessors of BoardingPass class
     */
    public String getFlightNo() {return this.flightNo;}
    public String getSeatNo() {return this.seatNo;}
    public String getGate() {return this.gate;}
    public String getETD() {return this.ETD;}
    public String getETC() {return this.ETC;}
    public String getETA() {return this.ETA;}

    /**
     * Modifiers of BoardingPass class
     */
    public void setFlightNo(String flightNo) {this.flightNo = flightNo;}
    public void setSeatNo(String seatNo) {this.seatNo = seatNo;}
    public void setGate(String gate) {this.gate = gate;}
    public void setETD(String ETD) {this.ETD = ETD;}
    public void setETC(String ETC) {this.ETC = ETC;}
    public void setETA(String ETA) {this.ETA = ETA;}
}
