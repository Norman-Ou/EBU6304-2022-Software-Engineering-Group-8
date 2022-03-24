package Passenger;


/**
 * This is the basic Passenger information class
 *
 * @author Jiayi Wang
 * @author Ruizhe Ou
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class Baggage {
    /**
     * Baggage number.<br/><br/>
     * Default Value: null
     */
    private String baggageNo;

    /**
     * Default constructor
     */
    public Baggage() {}

    public Baggage(String baggageNo) {this.baggageNo = baggageNo;}
    /**
     * Accessors of Baggage class
     */
    public String getBInfo() {
        return baggageNo;
    }

    /**
     * Modifiers of Baggage class
     */
    public void setBInfo(String baggageNo) {this.baggageNo = baggageNo;}
}
