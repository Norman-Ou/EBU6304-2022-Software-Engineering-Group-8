package CheckIn.Monitor;

import Beans.Flight.SubClasses.ExtraOption;
import Beans.Passenger.SubClasses.BoardingPass;
import Beans.Passenger.Passenger;
import Beans.Flight.Flight;
import DataBase.fDB;
import DataBase.pDB;
import Exceptions.DataNotFound;
import DataBase.oDB;
import Beans.IDDocument.IDDocument;
import Beans.Order.Order;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Passenger Control Class
 *
 * @author Ruizhe Ou, Yao Wang, Mingze Wu
 * @version 0.1 April 4th, 2022
 * @since April 4th, 2022
 */
public class cMonitors {

    final String bookingNum = "2019200";
    final String id = "215200";
    final String surname = "orz";
    final IDDocument idDocument = new IDDocument("215200", "orz");
    // 所有航班的列表
    private static List<Flight> flightList = fDB.loadAllFlights();


    Passenger passenger;
    Flight flight;
    Order order;

    public String findPassengerFlight(String bookingNum) throws Exception {
        passenger = pDB.loadPassengerByBookingNo(bookingNum);
        return passenger.getBoardingPass().getFlightNo();
    }

    public String findPassengerFlight(String surname, String id) throws Exception {
        passenger = pDB.loadPassengerBySurname_ID(surname, id);
        return passenger.getBoardingPass().getFlightNo();
    }

    public String findPassengerFlight(IDDocument idDocument) throws Exception {
        passenger = pDB.loadPassengerByIDDocument(idDocument);
        return passenger.getBoardingPass().getFlightNo();
    }

    public Flight findFlight(String flightNo) {
        flight = fDB.loadFlightByFlightNo(flightNo);
        return flight;
    }

    // wy add these functions to change the method of presenting data of flight
    public static Flight getFlightByBookingNo(String bookingNo) {
        String targetFlightNo;
        Flight targetFlight = new Flight();
        try {
            targetFlightNo = oDB.getOrderByBookingNumber(bookingNo).getFlightNo();
            // System.out.println("here");
            // get flight information and passenger list through flight number
            for (int i = 0; i < flightList.size(); i++) {
                Flight flight = flightList.get(i);
                if (flight.getFlightNo().equals(targetFlightNo)) {
                    targetFlight = flight;
                }
            }
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return targetFlight;
    }

    // wy add these functions to find a passenger's flight list
    public static ArrayList<Flight> getFlightBySurname_ID(String surName, String IDnum) {
        try {
            ArrayList<Flight> targetFlightList = new ArrayList<Flight>();
            ArrayList<Passenger> psgs = pDB.loadPassengersBySurname_ID(surName, IDnum);
            System.out.println("here2");
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

    public BoardingPass generateBoardingPass() {
        passenger = this.passenger;
        return passenger.getBoardingPass();
    }

    public void setMeal(String mealName) {
        ExtraOption eo1 = new ExtraOption();
        ArrayList<ExtraOption> eos = this.flight.getExtraOptions();
        for (int i = 0; i < eos.size(); i++) {
            if (mealName == eos.get(i).getDescription()) {
                eo1 = eos.get(i);
            }
        }
        ExtraOption eo2 = new ExtraOption();
        eo2.setKind(1);
        eo2.setDescription(mealName);
        eo2.setPrice(eo1.getPrice());
        this.passenger.getExtraOptions().add(eo2);
        this.passenger.setExtraOptions(this.passenger.getExtraOptions());
    }

    public void setSeat(String seat) {
        this.passenger.getBoardingPass().setSeatNo(seat);
    }

//    public static Order findOrderbyPassergerID(String passengerID) throws Exception {
////        this.order= new Order(passengerID,flight.getFlightNo(),passenger.getBookNumber());
//        return this.order;
//    }
}
