package Tools;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import Beans.Passenger.SubClasses.BoardingPass;
import DataBase.fDB;
import DataBase.pDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class SetBoardingPassInfo {
    public static void main(String[] args) {
        ArrayList<Flight> flights = fDB.loadAllFlights();
        ArrayList<Passenger> passengers = pDB.loadAllPassengers();

        ArrayList<BoardingPass> boardingPassArrayList = new ArrayList<>();

        System.out.println(passengers.size()); // 6 passengers
        System.out.println(flights.size()); // 4 flights {"orz", "wmz", "wy", "ljc", "hlx", "wjy"}

        for (Flight flight : flights){
            String flightNo    = flight.getFlightNo();
            String gate        = flight.getGate();
            String ETD         = flight.getETD();
            String ETC         = flight.getETC();
            String ETA         = flight.getETA();
            String departure   = flight.getDeparture();
            String destination = flight.getDestination();

            BoardingPass boardingPass = new BoardingPass(flightNo, null, gate, ETD, ETC, ETA, departure, destination);

            boardingPassArrayList.add(boardingPass);

//            System.out.println(boardingPassArrayList);
        }

        for (Passenger passenger : passengers){
            System.out.println(passenger.getSurName());
            if (passenger.getSurName().equals("orz") || passenger.getSurName().equals("wmz")){
                pDB.removePassenger(passenger);
                passenger.setBoardingPass(boardingPassArrayList.get(0));
                pDB.storePassenger(passenger);
            }else if (passenger.getSurName().equals("wy") || passenger.getSurName().equals("ljc")){
                pDB.removePassenger(passenger);
                passenger.setBoardingPass(boardingPassArrayList.get(1));
                pDB.storePassenger(passenger);
            }else if (passenger.getSurName().equals("hlx")){
                pDB.removePassenger(passenger);
                passenger.setBoardingPass(boardingPassArrayList.get(2));
                pDB.storePassenger(passenger);
            }else if (passenger.getSurName().equals("wjy")){
                pDB.removePassenger(passenger);
                passenger.setBoardingPass(boardingPassArrayList.get(3));
                pDB.storePassenger(passenger);
            }
        }
    }
}
