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
     * Get Passenger Object by bookingNumber attr
     * */
    public static Passenger loadPassengerByBookingNo(String bookingNum){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        try {
            return dataBase.getObject("bookNumber", bookingNum, Passenger.class);
        } catch (IOException | DataNotFound e) {
            e.printStackTrace();
        } /*catch (DataNotFound dataNotFound) {
            throw new DataNotFound("No reservation with booking number " + bookingNum);
        }*/
        return null;
    }


    /**
     * Get Passenger Object by Surname and ID number
     * */
    @Deprecated
    public static Passenger loadPassengerBySurname_ID(String surName, String passengerId) throws Exception {
        DataBase dataBase = new DataBase(Config.PassengerFile);
        Passenger p1 = dataBase.getObject("surName", surName, Passenger.class);
        Passenger p2 = dataBase.getObject("passengerId", passengerId, Passenger.class);
        if (p2 == null){
            throw new Exception("SurName doesn't exist");
        }else if (p1 == null){
            throw new Exception("ID Number doesn't exist");
        }else if(p1.equals(p2)){
            return p1;
        }else{
            throw new Exception("Surname does not match the ID number");
        }
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

    //TODO 完成这个方法
    /**
     * Get Passenger Object by ID document Object from Passenger Data Base
     * */
    public static Passenger loadPassengerByIDDocument(IDDocument idDocument) throws Exception {
        DataBase dataBase = new DataBase(Config.PassengerFile);
        String surname = idDocument.getSurname();
        String ID = idDocument.getID();
        return loadPassengerBySurname_ID(surname,ID);
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
