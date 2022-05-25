package DataBase;

import Config.Config;
import Beans.IDDocument.IDDocument;
import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Passenger Database interface class
 * @since March 24th, 2022
 * @author Ruizhe Ou
 * @version 0.2
 */
public class pDB{

    /**
     * Get the passenger object from the database based on the booking number
     *
     * @param bookingNum the booking number
     * @return Passenger Object
     * */
    public static Passenger loadPassengerByBookingNo(String bookingNum){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            return dataBase.getObject("bookNumber", bookingNum, Passenger.class);
        } catch (IOException | DataNotFound e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get the passenger object from the database based on the surname and ID
     *
     * @param surName the surname of the passenger
     * @param passengerId the ID of the passenger
     * @return Passenger Objects List
     * */
    public static ArrayList<Passenger> loadPassengersBySurname_ID(String surName, String passengerId) throws DataNotFound {
        DataBase dataBase = new DataBase(Config.PassengerFile);
        ArrayList<Passenger> arrayList = new ArrayList<>();

        try {
            JSONArray array = dataBase.getAllObject();
            for (int i = 0; i < (array.size()); i++) {
                JSONObject ob = (JSONObject) array.get(i);
                if (ob.get("surName").equals(surName)) {
                    if (ob.get("passengerId").equals(passengerId)) {
                        arrayList.add(ob.toJavaObject(Passenger.class));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (arrayList.isEmpty()){
            throw new DataNotFound("DataNotFound");
        } else {
            return arrayList;
        }
    }

    /**
     * Get the passenger object from the database based on the passenger ID number
     *
     * @param passengerId the booking number
     * @return Passenger Object
     * */
    public static ArrayList<Passenger> loadPassengersByIDNum(String passengerId) throws DataNotFound{
        return new DataBase(Config.PassengerFile).getObjects("passengerId", passengerId, Passenger.class);
    }

    /**
     * Get the passenger object from the database based on the ID document
     *
     * @param idDocument the ID document
     * @return Passenger Objects List
     * */
    public static ArrayList<Passenger> loadPassengersByIDDocument(IDDocument idDocument) throws Exception {
        String surname = idDocument.getSurname();
        String ID = idDocument.getID();
        return loadPassengersBySurname_ID(surname,ID);
    }

    /**
     * Get all the passenger object from the database
     *
     * @return Passenger Objects List
     * */
    public static ArrayList loadAllPassengers(){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            return new ArrayList(dataBase.getAllObject().toJavaList(Passenger.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Replace all the data in the passenger data base with the incoming passengers list.
     *
     * @param passengers passengers list data used to replace data in a database
     * */
    public static void replaceAllPsn(ArrayList<Passenger> passengers) throws IOException {
        DataBase dataBase = new DataBase(Config.PassengerNewFile);
        JSONArray jsonArray = new JSONArray();
        dataBase.replaceAllData(jsonArray);
        for (Passenger psn : passengers){
            dataBase.addObject(psn);
        }
    }

    /**
     * Remove the entering passenger object in Passenger data base
     *
     * @param passenger the passenger object to be remove in passenger data base
     * */
    public static void removePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            dataBase.removeObject(passenger, Passenger.class);
        } catch (IOException | DataNotFound e) {
            e.printStackTrace();
        }
    }

    /**
     * Add a passenger into Passenger data base
     *
     * @param passenger the passenger to be added into passenger data base
     * */
    public static void storePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            dataBase.addObject(passenger);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update the passenger information in data base after check in
     *
     * @param newPassenger the passenger object completed check in
     * @return true means update successfully
     * */
    public static boolean updatePassengerInfo(Passenger newPassenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        String bookingNumber = newPassenger.getBookNumber();
        try {
            dataBase.removeObject("bookNumber", bookingNumber, Passenger.class);
            dataBase.addObject(newPassenger);
            return true;
        } catch (IOException | DataNotFound e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
