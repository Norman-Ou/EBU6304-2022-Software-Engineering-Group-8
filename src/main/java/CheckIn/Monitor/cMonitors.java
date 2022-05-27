package CheckIn.Monitor;

import Beans.Passenger.Passenger;
import Beans.Flight.Flight;
import Beans.IDDocument.IDDocument;
import Beans.Order.Order;
import DataBase.fDB;
import DataBase.pDB;
import DataBase.oDB;
import Exceptions.DataNotFound;

import org.junit.Test;

import java.util.*;


/**
 * This is the control class for CheckIn end 
 *
 * @author Yao Wang, Ruizhe Ou, Mingze Wu
 * @since 4th April, 2022
 * last modification date: May 24th, 2022
 */

public class cMonitors {

    // load the list of all flights stored in the database
    public static List<Flight> flightList = fDB.loadAllFlights();

    Passenger passenger;
    Order order;

    /**
     * This function is designed to search 
     * the target flight by the known flight number.
     * @param flightNo the flight number used to find the target flight.
     * @return the target flight.
     */
    @Test
    public static Flight findFlight(String flightNo){
        Flight flight = fDB.loadFlightByFlightNo(flightNo);
        return flight;
    }

    /**
     * This function is designed to search 
     * the target flight by the known booking number.
     * @param bookingNo the unique id for each order.
     * @return the target flight.
     */
    @Test
    public static Flight getFlightByBookingNo(String bookingNo){
        String targetFlightNo = null;
        Flight targetFlight = new Flight();
        try {
            targetFlightNo = oDB.getOrderByBookingNumber(bookingNo).getFlightNo();
            targetFlight = cMonitors.findFlight(targetFlightNo);
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return targetFlight;
    }

    /**
     * This function is designed to get 
     * the target flight by the IDdocument.
     * @param idDocument the idDocument unique for every passenger.
     * @return the target flight.
     */
    // @Test
    // public static Flight getFlightByIDDocument(IDDocument idDocument){
    //     String targetFlightNo;
    //     Flight targetFlight = new Flight();
    //     try {
    //         Passenger psg = pDB.loadPassengersByIDDocument(idDocument);
    //         targetFlightNo = oDB.getOrderByBookingNumber(psg.getBookNumber()).getFlightNo();
    //         targetFlight = cMonitors.findFlight(targetFlightNo);
    //         return targetFlight;
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return null;
    // }

    /**
     * This function is designed to search the list of target flights
     * related to the certain passnger.
     * @param surName the surName used to login the system.
     * @param IDnum the id number unique for each passenger.
     * @return the list of flight ordered by the certain passenger.
     */
    @Test
    public static ArrayList<Flight> getFlightBySurname_ID(String surName, String IDnum){
        try {
            ArrayList<Flight> targetFlightList = new ArrayList<Flight>();
            ArrayList<Passenger> psgs = pDB.loadPassengersBySurname_ID(surName, IDnum);
            System.out.println("here2");
            // a list of bookingNumber
            ArrayList<String> bookingNoList = new ArrayList<String>();
            for(int i=0;i<psgs.size();i++){
                Passenger psg = psgs.get(i);
                bookingNoList.add(psg.getBookNumber());
            }
            // identify the flight by booking number
            for (int j = 0; j<bookingNoList.size(); j++){
                String bookingNo = bookingNoList.get(j);
                targetFlightList.add(cMonitors.getFlightByBookingNo(bookingNo));
            }
            return targetFlightList;
        } catch (DataNotFound e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This function is designed to search 
     * the target flight by the known booking number.
     * @param bookingNo the unique id for each order.
     * @return the target passenger.
     */
    @Test
    public static Passenger getPassengerByBookingNo(String bookingNo){
        Passenger targetpsg = pDB.loadPassengerByBookingNo(bookingNo);
        return targetpsg;
    }

    /**
     * This function is designed to get 
     * the target passenger by surname and id number.
     * @param surName the surName used to login the system.
     * @param IDnum the id number unique for each passenger.
     * @return the target passenger.
     */
    @Test
    public static Passenger getPassengerBySurname_ID(String surName, String IDnum){
        List<Passenger> targetpsgList;
        try {
            targetpsgList = pDB.loadPassengersBySurname_ID(surName, IDnum);
            Passenger targetpsg = targetpsgList.get(0);
            return targetpsg;
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Order getOrderByPassenger(Passenger psn){
        String id= psn.getPassengerId();
        String bookNumber=psn.getBookNumber();
        String flightNumber = cMonitors.getFlightByBookingNo(bookNumber).getFlightNo();
        Order order = new Order(id,flightNumber,bookNumber);
        return order;
    }
}
