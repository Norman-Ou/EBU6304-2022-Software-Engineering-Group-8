package DataBase;

import Config.Config;
import Flight.Flight;
import Passenger.Passenger;


import java.util.ArrayList;

/**
 * Passenger Database operation class
 *
 * @author Ruizhe Ou
 * @version 0.1 April 9th, 2022
 */
public class fDB {

    ArrayList<Passenger> arrayList = new ArrayList<Passenger>();

    /**
     * Add a flight Object into Flight data base
     * */
    public static void storeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.addObject(flight);
    }

    /**
     * Remove the flight object in Flight data base
     * */
    public static void removeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.removeObject(flight, Flight.class);
    }

    public static ArrayList<Flight> loadAllFlight(){
        DataBase dataBase = new DataBase(Config.FlightFile);
        return new ArrayList(dataBase.getAllObject().toJavaList(Flight.class));
    }

}
