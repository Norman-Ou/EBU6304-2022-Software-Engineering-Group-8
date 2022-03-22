package Flight;

import Passenger.Passenger;

import java.io.Serializable;
import java.util.*;

public class Flight implements Serializable{
    /**
     * Number of the flight.<br/><br/>
     * Default Value: "default"
     */
    private String no = "default";
    /**
     * Airlines which the flight belongs with.<br/><br/>
     * Default Value: "default"
     */
    private String airlines = "default";
    /**
     * Name of the origin.<br/><br/>
     * Default Value: "default"
     */
    private String origin = "default";
    /**
     * Name of the destination.<br/><br/>
     * Default Value: "default"
     */
    private String destination = "default";
    /**
     * Gate where passengers wait for boarding.<br/><br/>
     * Default Value: "default"
     */
    private String gate = "default";
    /**
     * Terminal which passenger should go to.<br/><br/>
     * Default Value: "default"
     */
    private String terminal = "default";
    /**
     * Estimated Time of Departure.<br/><br/>
     * Default Value: "default"
     */
    private String ETD = "default";
    /**
     * Estimated Time of Close.<br/><br/>
     * Default Value: "default"
     */
    private String ETC = "default";
    /**
     * Estimated Time of Arrival.<br/><br/>
     * Default Value: "default"
     */
    private String ETA = "default";
    /**
     * Limitation of a simple passenger for luggage consigning.<br/><br/>
     * Default Value: 60
     */
    private int luggageLimit = 60;
    /**
     * Seating list for a certain flight.<br/>
     * (Key, Value) -> (seatNo, Passenger)<br/><br/>
     * Default Value: empty HashMap
     */
    private HashMap<String, Passenger> seatingList = new HashMap<>();
    /**
     * Check-in list of a certain flight.<br/>
     * (Key, Value) -> (passengerId, checkinStatus)<br/><br/>
     *
     * Status No: <br/>
     * <b>-1</b> means <b>Not check-in yet</b><br/>
     * <b>0</b> means <b>Check-in complete but not onboard</b><br/>
     * <b>1</b> means <b>Check-in and onboard</b><br/><br/>
     *
     * Default Value: empty HashMap
     */
    private HashMap<Integer, Integer> checkinList = new HashMap<>();
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

    public Flight(String no, String airlines, String origin, String destination, String gate, String terminal, String ETD, String ETC, String ETA, int luggageLimit, HashMap<String, Passenger> seatingList, HashMap<Integer, Integer> checkinList, ArrayList<ExtraOption> extraOptions) {
        this.no = no;
        this.airlines = airlines;
        this.origin = origin;
        this.destination = destination;
        this.gate = gate;
        this.terminal = terminal;
        this.ETD = ETD;
        this.ETC = ETC;
        this.ETA = ETA;
        this.luggageLimit = luggageLimit;
        this.seatingList = seatingList;
        this.checkinList = checkinList;
        this.extraOptions = extraOptions;
    }

    /**
     * Accessors of flight
     */
    public String getNo(){return no;}
    public String getAirlines(){return airlines;}
    public String getOrigin(){return origin;}
    public String getDestination(){return destination;}
    public String getGate(){return gate;}
    public String getTerminal(){return terminal;}
    public String getETD(){return ETD;}
    public String getETC(){return ETC;}
    public String getETA(){return ETA;}
    public int getLuggageLimit(){return luggageLimit;}
    public HashMap<String, Passenger> getSeatingList(){return seatingList;}
    public HashMap<Integer, Integer> getCheckinList(){return checkinList;}
    public ArrayList<ExtraOption> getExtraOptions(){return extraOptions;}

    /**
     * Modifiers of flight
     *
     */
    public void setNo(String no){this.no = no;}
    public void setAirlines(String airlines){this.airlines = airlines;}
    public void setOrigin(String origin){this.origin = origin;}
    public void setDestination(String destination){this.destination = destination;}
    public void setGate(String gate){this.gate = gate;}
    public void setTerminal(String terminal){this.terminal = terminal;}
    public void setETD(String ETD){this.ETD = ETD;}
    public void setETC(String ETC){this.ETC = ETC;}
    public void setETA(String ETA){this.ETA = ETA;}
    public void setLuggageLimit(int luggageLimit){this.luggageLimit = luggageLimit;}
    public void setSeatingList(HashMap<String, Passenger> seatingList){this.seatingList = seatingList;}
    public void setCheckinList(HashMap<Integer, Integer> checkinList){this.checkinList = checkinList;}
    public void setExtraOptions(ArrayList<ExtraOption> extraOptions){this.extraOptions = extraOptions;}
}
