package PassengerEnd;

import DataBase.pDB;
import Passenger.IDDocument.IDDocument;
import Passenger.Passenger;
import org.junit.jupiter.api.Test;

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

    //Search Information by booking number
    @Test
    public void firstOption(){
        Passenger passenger;
        try{
            passenger = pDB.loadPassengerByBookingNo(bookingNum);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    //Search Information by surname and ID
    @Test
    public void secondOption(){
        Passenger passenger;
        try{
            passenger = pDB.loadPassengerBySurname_ID(surname, id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Search Information by scanning ID Document
    @Test
    public void thirdOption(){
        Passenger passenger;
        try{
            passenger = pDB.loadPassengerByIDDocument(idDocument);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
