package PassengerEnd;

import DataBase.pDB;
import Passenger.IDDocument.IDDocument;
import Passenger.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Passenger Control Class
 *
 * @author Ruizhe Ou
 * @version 0.1 April 4th, 2022
 */
public class Listeners {

    final String bookingNum = "2019200";
    final String surname = "orz";
    final String id = "215200";
    final IDDocument idDocument = new IDDocument("215200", "orz");

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
        ArrayList<String> bookedFlightInfo = new ArrayList<>();
        BoardingPass boardingPass = passenger.getBoardingPass();

        String flightNo = boardingPass.getFlightNo();

        return bookedFlightInfo;
    }


}
