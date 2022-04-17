package Tools;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import DataBase.fDB;
import DataBase.pDB;

import java.util.ArrayList;

public class SetBoardingPassInfo {
    public static void main(String[] args) {
        ArrayList<Flight> flights = fDB.loadAllFlights();
        ArrayList<Passenger> passengers = pDB.loadAllPassengers();

        for (Passenger passenger : passengers){
            System.out.println(passenger.getSurName());
        }


        for (Flight flight : flights){
            System.out.println(flight.getFlightNo());
        }
    }
}
