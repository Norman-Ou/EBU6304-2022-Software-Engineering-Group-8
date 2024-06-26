package DataBase;

import Config.Config;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Passenger Database interface class
 *
 * @author Ruizhe Ou
 * @version 0.2 April 9th, 2022
 */
public class fDB {

    /**
     * Add a flight Object into Flight data base
     *
     * @param flight the flight to be store
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
     * Remove the flight object in Flight data base
     *
     * @param flight the flight to be remove
     * */
    public static void removeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            dataBase.removeObject(flight, Flight.class);
        } catch (IOException | DataNotFound e) {
            e.printStackTrace();
        }
    }

    /**
     * Get all the flight objects in Flight data base
     *
     * @return a ArrayList containing all flight objects
     * */
    public static ArrayList loadAllFlights(){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            return new ArrayList(dataBase.getAllObject().toJavaList(Flight.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Replace all the data in the Flight data base with the incoming flights list.
     *
     * @param flights flights data used to replace data in a database
     * */
    public static void replaceAllFlights(ArrayList<Flight> flights) throws IOException {
        DataBase dataBase = new DataBase(Config.FlightFile);
        JSONArray jsonArray = new JSONArray();
        for (Flight flight1 : flights){
            jsonArray.add((JSONObject) JSON.toJSON(flight1));
        }
        dataBase.replaceAllData(jsonArray);
    }


    /**
     * Get the flight object from the database based on the flight number
     *
     * @param flightNo the flight number
     * @return Flight Object
     * */
    public static Flight loadFlightByFlightNo(String flightNo){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            return dataBase.getObject("flightNo", flightNo, Flight.class);
        } catch (IOException | DataNotFound e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void test1(){
        System.out.println(this.loadFlightByFlightNo("46921248"));
    }


    /**
     * Update the flight information in data base after check in
     *
     * @param newFlight the flight object completed check in
     * @return true means update successfully
     * */
    public static boolean updateFlightInfo(Flight newFlight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        String flightNo = newFlight.getFlightNo();
        try {
            dataBase.removeObject("flightNo", flightNo, Flight.class);
            dataBase.addObject(newFlight);
            return true;
        } catch (IOException | DataNotFound e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
