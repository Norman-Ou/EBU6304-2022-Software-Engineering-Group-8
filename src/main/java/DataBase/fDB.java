package DataBase;

import Config.Config;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


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
    public static void removeFlight(Flight flight){
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            dataBase.removeObject(flight, Flight.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DataNotFound e){
            e.printStackTrace();
//            throw new DataNotFound("Not Found flight with flight number " + flight.getFlightNo());
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
        JSONArray jsonArray = new JSONArray();
        dataBase.replaceAllData(jsonArray);
        for (Flight flight : flights){
            dataBase.addObject(flight);
        }
    }

    public static void replaceAllPsn(ArrayList<Passenger> passengers) throws IOException {
        DataBase dataBase = new DataBase(Config.PassengerNewFile);
        JSONArray jsonArray = new JSONArray();
        dataBase.replaceAllData(jsonArray);
        for (Passenger psn : passengers){
            dataBase.addObject(psn);
        }
    }

    public static Flight loadFlightByFlightNo(String flightNo)/* throws DataNotFound */{
        DataBase dataBase = new DataBase(Config.FlightFile);
        try {
            return dataBase.getObject("flightNo", flightNo, Flight.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (DataNotFound dataNotFound) {
            dataNotFound.printStackTrace();
            return null;
//            throw new DataNotFound("Flight " + flightNo + " Not Found");
        }
    }
}
