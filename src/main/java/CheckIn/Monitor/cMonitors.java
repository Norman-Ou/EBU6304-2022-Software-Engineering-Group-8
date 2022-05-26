package CheckIn.Monitor;

import Beans.Passenger.Passenger;
import Beans.Flight.Flight;
import DataBase.fDB;
import DataBase.pDB;
import Exceptions.DataNotFound;
import DataBase.oDB;
import Beans.Order.Order;

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
    
    // load the list of all passengers stored in the database
    private List<Passenger> psgList = pDB.loadAllPassengers(); 

    Passenger passenger;
    Order order;

    public static Flight findFlight(String flightNo) {
        Flight flight = fDB.loadFlightByFlightNo(flightNo);
        return flight;
    }

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

/*    public static Flight getFlightByIDDocument(IDDocument idDocument){
        String targetFlightNo;
        Flight targetFlight = new Flight();
        try {
            Passenger psg = pDB.loadPassengerByIDDocument(idDocument);
            targetFlightNo = oDB.getOrderByBookingNumber(psg.getBookNumber()).getFlightNo();
            targetFlight = cMonitors.findFlight(targetFlightNo);
            return targetFlight;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public static ArrayList<Flight> getFlightBySurname_ID(String surName, String IDnum) {
        try {
            ArrayList<Flight> targetFlightList = new ArrayList<Flight>();
            ArrayList<Passenger> psgs = pDB.loadPassengersBySurname_ID(surName, IDnum);
            // bookingNumber应该是一个订单号的列表
            ArrayList<String> bookingNoList = new ArrayList<String>();
            for(int i=0;i<psgs.size();i++){
                Passenger psg = psgs.get(i);
                bookingNoList.add(psg.getBookNumber());
            }
            // 用订单号锁定flight
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

    public static Passenger getPassengerByBookingNo(String bookingNo) {
        Passenger targetpsg = pDB.loadPassengerByBookingNo(bookingNo);
        return targetpsg;
    }

    public static Passenger getPassengerBySurname_ID(String surName, String IDnum) {
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
}
