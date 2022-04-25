package CheckIn.Monitor;

import Beans.Flight.SubClasses.ExtraOption;
import Beans.Passenger.SubClasses.BoardingPass;
import Beans.Passenger.Passenger;
import Beans.Flight.Flight;
import DataBase.fDB;
import DataBase.pDB;
import Exceptions.DataNotFound;
import DataBase.fDB;
import DataBase.oDB;
import Beans.Flight.Flight;
import Beans.IDDocument.IDDocument;

import org.apache.commons.io.filefilter.OrFileFilter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Passenger Control Class
 *
 * @author Ruizhe Ou
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

    public Flight findFlight (String flightNo) {
        flight = fDB.loadFlightByFlightNo(flightNo);
        return flight;
    }

    // wy add these functions to change the method of presenting data of flight
    public static Flight getFlightByBookingNo(String bookingNo){
        String targetFlightNo;
        Flight targetFlight = new Flight();
        try {
            targetFlightNo = oDB.getOrderByBookingNumber(bookingNo).getFlightNo();
            // get flight information and passenger list through flight number
            for (int i = 0; i < flightList.size(); i++) {
                Flight flight = flightList.get(i);
                if(flight.getFlightNo().equals(targetFlightNo)){
                    targetFlight = flight;
                }
            }
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return targetFlight;
    }
}
