package DataBase;

import Config.Config;
import Flight.Flight;
import Passenger.Passenger;
import com.alibaba.fastjson.JSONArray;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

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

    public static void replaceAllFlight(ArrayList<Flight> flights) throws IOException {
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.replaceAllData(new JSONArray(Collections.singletonList(flights)));
    }
}
