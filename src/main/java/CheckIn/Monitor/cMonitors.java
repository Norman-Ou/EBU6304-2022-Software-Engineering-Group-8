package CheckIn.Monitor;

import Beans.Passenger.SubClasses.BoardingPass;
import Beans.Passenger.Passenger;
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
 * @since April 4th, 2022
 * @author Ruizhe Ou
 * @version 0.1 April 4th, 2022
 */
public class cMonitors {

    final String bookingNum = "2019200";
    final String surname = "orz";
    final String id = "215200";
    final IDDocument idDocument = new IDDocument("215200", "orz");
    // 所有航班的列表
	private static List<Flight> flightList = fDB.loadAllFlights();
	

    Passenger passenger;

    //Search Information by booking number
    @Test
    public void firstOption(){
        try{
            passenger = pDB.loadPassengerByBookingNo(bookingNum);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    //Search Information by surname and ID
    @Test
    public void secondOption(){
        try{
            passenger = pDB.loadPassengerBySurname_ID(surname, id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Search Information by scanning ID Document
    @Test
    public void thirdOption(){
        try{
            passenger = pDB.loadPassengerByIDDocument(idDocument);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> showBookedFlightInfo(){
        BoardingPass boardingPass = passenger.getBoardingPass();
        return new ArrayList<>(Arrays.asList(boardingPass.getAll().split(";")));
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
