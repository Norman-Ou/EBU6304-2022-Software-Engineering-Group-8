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
     * Assigned bag drop counter info.<br/><br/>
     * Default Value: null
     */
    private String dropCounter;

    /**
     * Default constructor
     */
    public Baggage() {}

    public Baggage(String baggageNo) {this.baggageNo = baggageNo;}

    /**
     * Accessors of Baggage class
     */
    public String getBaggageNo() {
        return this.baggageNo;
    }
    public String getDropCounter() { return this.dropCounter; }

    /**
     * Modifiers of Baggage class
     */
    public void setBaggageNo(String baggageNo) {this.baggageNo = baggageNo;}
    public void setDropCounter(String dropCounter) {this.dropCounter = dropCounter;}
}
