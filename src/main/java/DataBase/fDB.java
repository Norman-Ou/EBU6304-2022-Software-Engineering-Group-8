package DataBase;

import Config.Config;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSONArray;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Passenger Database operation class
 *
 * @author Ruizhe Ou
 * @version 0.2 April 9th, 2022
 */
public class fDB {

    ArrayList<Passenger> arrayList = new ArrayList<Passenger>();

    /**
     * Add a flight Object into Beans.Flight data base
     * */
    public static void storeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            dataBase.addObject(flight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Remove the flight object in Beans.Flight data base
     * */
    public static void removeFlight(Flight flight) throws DataNotFound {
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            dataBase.removeObject(flight, Flight.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DataNotFound e){
            throw new DataNotFound("Not Found flight with flight number " + flight.getFlightNo());
        }
    }

    public static ArrayList loadAllFlights(){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            return new ArrayList(dataBase.getAllObject().toJavaList(Flight.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void replaceAllFlights(ArrayList<Flight> flights) throws IOException {
        DataBase dataBase = new DataBase(Config.FlightFile);
        dataBase.replaceAllData(new JSONArray(Collections.singletonList(flights)));
    }

    public static Flight loadFlightByFlightNo(String flightNo) throws DataNotFound {
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            return dataBase.getObject("flightNo", flightNo, Flight.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (DataNotFound dataNotFound) {
            throw new DataNotFound("Flight " + flightNo + " Not Found");
        }
    }
}
