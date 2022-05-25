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
 * Passenger Database operation class
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
     * Get Passenger Object by ID document Object from Passenger Data Base
     * */
    public static ArrayList<Passenger> loadPassengersByIDDocument(IDDocument idDocument) throws Exception {
        DataBase dataBase = new DataBase(Config.PassengerFile);
        String surname = idDocument.getSurname();
        String ID = idDocument.getID();
        return loadPassengersBySurname_ID(surname,ID);
    }

    public static ArrayList loadAllPassengers(){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            return new ArrayList(dataBase.getAllObject().toJavaList(Passenger.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void replaceAllPsn(ArrayList<Passenger> passengers) throws IOException {
        DataBase dataBase = new DataBase(Config.PassengerNewFile);
        JSONArray jsonArray = new JSONArray();
        dataBase.replaceAllData(jsonArray);
        for (Passenger psn : passengers){
            dataBase.addObject(psn);
        }
    }

    //TODO 后期返回值改为 boolean 成功返回 true
    /**
     * Remove the entering passenger object in Passenger data base
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
     * */
    public static void storePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            dataBase.addObject(passenger);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
