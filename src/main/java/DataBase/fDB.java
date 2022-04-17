package DataBase;

import Config.Config;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
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
     * Add a flight Object into Beans.Flight data base
     * */
    public static void storeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.addObject(flight);
    }

    /**
     * Remove the flight object in Beans.Flight data base
     * */
    public static void removeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            dataBase.removeObject(flight, Flight.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Flight> loadAllFlights(){
        DataBase dataBase = new DataBase(Config.FlightFile);
        return new ArrayList(dataBase.getAllObject().toJavaList(Flight.class));
    }

    public static void replaceAllFlights(ArrayList<Flight> flights) throws IOException {
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.replaceAllData(new JSONArray(Collections.singletonList(flights)));
    }
}
