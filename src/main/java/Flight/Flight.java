package Flight;

import java.io.Serializable;
import java.util.*;

/**
 * This is the basic Flight information class
 *
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class Flight implements Serializable{
    /**
     * Number of the flight.<br/><br/>
     * Default Value: null
     */
    private String flightNo;
    /**
     * Airlines which the flight belongs with.<br/><br/>
     * Default Value: null
     */
    private String airlines;
    /**
     * Name of the origin.<br/><br/>
     * Default Value: null
     */
    private String departure;
    /**
     * Name of the destination.<br/><br/>
     * Default Value: null
     */
    private String destination;
    /**
     * Gate where passengers wait for boarding.<br/><br/>
     * Default Value: null
     */
    private String gate;
    /**
     * Terminal which passenger should go to.<br/><br/>
     * Default Value: null
     */
    private String terminal;
    /**
     * Estimated Time of Departure.<br/><br/>
     * Default Value: null
     */
    private String ETD;
    /**
     * Estimated Time of Close.<br/><br/>
     * Default Value: null
     */
    private String ETC;
    /**
     * Estimated Time of Arrival.<br/><br/>
     * Default Value: null
     */
    private String ETA;
    /**
     * Limitation of a simple passenger for luggage consigning.<br/><br/>
     * Default Value: 60
     */
    private int luggageLimit = 60;
    /**
     * Seating list for a certain flight.<br/>
     * (Key, Value) -> (seatNo, Seat)<br/><br/>
     * Default Value: empty HashMap
     */
    private HashMap<String, Seat> seatingList = new HashMap<>();
    /**
     * Extra options list of a flight.<br/>
     * Each element means a kind of ExtraOption of <b>seating</b> or <b>meal<b/>.<br/><br/>
     *
     * Default Value: empty ArrayList
     */
    private ArrayList<ExtraOption> extraOptions = new ArrayList<>();

    /**
     * Default constructor with no parameters.
     */
    public Flight(){}

    public Flight(String flightNo, String airlines, String departure, String destination, String gate, String terminal, String ETD, String ETC, String ETA, int luggageLimit, HashMap<String, Seat> seatingList, ArrayList<ExtraOption> extraOptions) {
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.departure = departure;
        this.destination = destination;
        this.gate = gate;
        this.terminal = terminal;
        this.ETD = ETD;
        this.ETC = ETC;
        this.ETA = ETA;
        this.luggageLimit = luggageLimit;
        this.seatingList = seatingList;
        this.extraOptions = extraOptions;
    }

    /**
     * Accessors of flight
     */
    public String getFlightNo() {return flightNo;}
    public String getAirlines(){return airlines;}
    public String getDeparture(){return departure;}
    public String getDestination(){return destination;}
    public String getGate(){return gate;}
    public String getTerminal(){return terminal;}
    public String getETD(){return ETD;}
    public String getETC(){return ETC;}
    public String getETA(){return ETA;}
    public int getLuggageLimit(){return luggageLimit;}
    public HashMap<String, Seat> getSeatingList() {return seatingList;}
    public ArrayList<ExtraOption> getExtraOptions(){return extraOptions;}

    /**
     * Modifiers of flight
     *
     */
    public void setFlightNo(String flightNo) {this.flightNo = flightNo;}
    public void setAirlines(String airlines){this.airlines = airlines;}
    public void setDeparture(String departure){this.departure = departure;}
    public void setDestination(String destination){this.destination = destination;}
    public void setGate(String gate){this.gate = gate;}
    public void setTerminal(String terminal){this.terminal = terminal;}
    public void setETD(String ETD){this.ETD = ETD;}
    public void setETC(String ETC){this.ETC = ETC;}
    public void setETA(String ETA){this.ETA = ETA;}
    public void setLuggageLimit(int luggageLimit){this.luggageLimit = luggageLimit;}
    public void setSeatingList(HashMap<String, Seat> seatingList) {this.seatingList = seatingList;}
    public void setExtraOptions(ArrayList<ExtraOption> extraOptions){this.extraOptions = extraOptions;}
}
