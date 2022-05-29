package BackEnd.Monitor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import Beans.Order.Order;
import Beans.Passenger.Passenger;
import Beans.Flight.*;
import DataBase.fDB;
import DataBase.oDB;
import DataBase.pDB;
import Exceptions.DataNotFound;

import static org.junit.Assert.fail;

/**
 * This is the control class for Admin end 
 *
 * @author Yao Wang
 * @since 27th March, 2022 
 * last modification date: May 24th, 2022
 */

public class bMonitors {
	
    // load the list of all flights stored in the database
	private List<Flight> flightList = fDB.loadAllFlights();
	
    // load the list of all passengers stored in the database
    private List<Passenger> passengerList = pDB.loadAllPassengers();

    /**
     * Default constructor
     */
    public bMonitors(){}

    /**
     * This function is designed to search 
     * the target flight by the known flight number.
     * @param targetFlightNo the flight number used to find the target flight.
     * @return the list of target flight.
     */
    public Flight getFlightList(String targetFlightNo){
        Flight targetFlight = new Flight();
        for (int i = 0; i < flightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getFlightNo().equals(targetFlightNo)){
                targetFlight = flight;
            }
        }
        return targetFlight;
    }

    /**
     * This function is designed to find all flights 
     * whose ETD equal to the input time.
     * @param targetTime the flight ETD used to find the target flight.
     * @return the list of target flight.
     */
    public List<Flight> getFlightListByTime(String targetTime){
        List<Flight> targetFlightList = new ArrayList<Flight>();
        for (int i = 0; i < flightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getETD().equals(targetTime)){
                targetFlightList.add(flight);
            }
        }
        return targetFlightList;
    }

    /**
     * This function is designed to find all urgent flights 
     * which will take off 15 mins later.
     * @return the list of urgent flights.
     */
    @Test
    public List<String> getUrgenList(){
    	// get current time
    	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        String currentTime = sdf.format(System.currentTimeMillis());
        List<String> urgentFlighList = new ArrayList<String>();
        for (int i = 0; i<flightList.size(); i++) {
        	Flight flight = flightList.get(i);
        	if(flight.getETC().equals(currentTime)){
                urgentFlighList.add(flight.getFlightNo());
            }
        }
        return urgentFlighList;
    }

    /**
     * This function is designed to 
     * get all passengers on a certain flight.
     * @param targetFlightNo the flight number used to find all passengers.
     * @return the list of all passengers on this flight.
     */
    @Test
    public List<Passenger> getPassengerList(String targetFlightNo){
        List<Order> oList;
        try {
            oList = oDB.getOrdersByFlightNo(targetFlightNo);
            List<Passenger> psgList = new ArrayList<Passenger>();
            for(int i = 1; i<oList.size(); i++){
                for(int j = 0; j<passengerList.size(); j++){
                    if(oList.get(i).getPassengerID().equals(passengerList.get(j).getPassengerId())){
                        psgList.add(passengerList.get(j));
                        System.out.println(oList.get(i).getPassengerID());
                    }
                }
            }
            System.out.println("get psgList");
            return psgList;
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This function is designed to get the list of unboarded passengers 
     * on a certain flight through the flight number.
     * @param targetFlightNo the flight number used to find unboarded passengers.
     * @return the list of unboarded passengers on this flight.
     */
    @Test
    public List<Passenger> getUnboardedPassengerList(String targetFlightNo){
        List<Passenger> unboardedPassengerList = new ArrayList<Passenger>();
        List<Passenger> psgList = this.getPassengerList(targetFlightNo);
        for(int i = 0; i<psgList.size(); i++){
            if(psgList.get(i).getCheckinStatus()!=1){
                unboardedPassengerList.add(psgList.get(i));
            }
        }
        System.out.println("get target-psgList");
        return unboardedPassengerList;
    }
    
    /**
     * This function is designed to get the list of
     * passenger basic information throught passenger list.
     * @param PList the list of all unboarded passengers.
     * @return the list of information of all unboarded passengers.
     */
    @Test
    public List<String> printUnboardedPassengerList(List<Passenger> PList){
        List<String> infoList = new ArrayList<String>();
        for(int i = 0; i<PList.size(); i++){
            Passenger psg = PList.get(i);
            String info = psg.getPassengerId() + "                " + psg.getSurName();
            infoList.add(info);
        }
        System.out.println("get infoList");
        return infoList;
    }
        
    /**
     * This function is designed to get the list of passenger objects 
     * ordered by a certain passenger.
     * @param passengerID the ID of an passenger.
     * @return the list of passenger objects related with the same passenger ID.
     */
    @Test
    public ArrayList<Passenger> searchPassengerById(String passengerID){
        ArrayList<Passenger> targetPsglist = new ArrayList<Passenger>();
        try {
            ArrayList<Passenger> psglist = pDB.loadPassengersByIDNum(passengerID);
            targetPsglist = psglist;
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return targetPsglist;
    }

    /**
     * This function is designed to get the list of flights 
     * ordered by a certain passenger.
     * @param psgList the list of passenger objects related with the same passenger ID.
     * @return the list of flights ordered by a certain passenger.
     */
    @Test
    public ArrayList<Flight> searchFlightByPassenger(List<Passenger> psgList){
        ArrayList<Flight> targetFltlist = new ArrayList<Flight>();
        ArrayList<String> fltNoList = new ArrayList<String>();
        String psgID = psgList.get(0).getPassengerId();
        try {
            List<Order> oList = oDB.getOrdersByPassengerId(psgID);
            for(int i = 0; i<psgList.size(); i++){
                String bookNo = psgList.get(i).getBookNumber();
                for(int j = 0; j<oList.size(); j++){
                    if(oList.get(j).getBookNumber().equals(bookNo)){
                        fltNoList.add(oList.get(j).getFlightNo());
                        break;
                    }
                }
            }
            for(int k = 0; k<fltNoList.size(); k++){
                for(int m = 0; m<flightList.size(); m++){
                    if(flightList.get(m).getFlightNo().equals(fltNoList.get(k))){
                        targetFltlist.add(flightList.get(m));
                        break;
                    }
                }
            }
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return targetFltlist;
    }

    /**
     * This function is designed to get the list of flights 
     * ordered by a certain passenger.
     * @param psgList the list of passenger objects related with the same passenger ID.
     * @param flightNo the target flight number.
     * @return the passenger object corresponds to the target flight. 
     */
    @Test
    public Passenger searchPassengerByFlight(String flightNo, List<Passenger> psgList){
        Passenger target = new Passenger();
        try {
            for(int i = 0; i<psgList.size(); i++){
                String bookNum = psgList.get(i).getBookNumber();
                Order order = oDB.getOrderByBookingNumber(bookNum);
                if(order.getFlightNo().equals(flightNo)){
                    target = psgList.get(i);
                }
            }
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return target;
    }

    /**
     * This function is designed to get the list of flights 
     * ordered by a certain passenger.
     * @param timeToClose the time to close the gate.
     * @return the information showing how much time left.
     */
    @Test
    public String calculateDiff(String timeToClose){
        // get current time
    	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        String currentTime = sdf.format(System.currentTimeMillis());
        Date current;
		try {
			current = sdf.parse(currentTime);
			Date target = sdf.parse(timeToClose);
			long between = target.getTime() - current.getTime();
			long day = between / (24 * 60 * 60 * 1000);
			long hour = (between / (60 * 60 * 1000) - day * 24);
			long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
			long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
            return day + "Day(s)" + hour + "Hour(s)" + min + "Minute(s)" + s + "Second(s)";
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return null;
    }
}
