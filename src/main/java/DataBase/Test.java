package DataBase;

import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        try {
            ArrayList<Passenger> arrayList = pDB.loadPassengersBySurname_ID("Harris", "619531");
            System.out.println(arrayList.toString());
        } catch (DataNotFound dataNotFound) {
            dataNotFound.printStackTrace();
        }
    }
}
