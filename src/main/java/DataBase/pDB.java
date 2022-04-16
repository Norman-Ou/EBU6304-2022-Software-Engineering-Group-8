package DataBase;

import Config.Config;
import Passenger.IDDocument.IDDocument;
import Passenger.Passenger;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/**
 * Passenger Database operation class
 * @since March 24th, 2022
 * @author Ruizhe Ou
 * @version 0.1
 */
public class pDB{

    /**
     * Get Passenger Object by bookingNumber attr
     * */
    public static Passenger loadPassengerByBookingNo(String bookingNum){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        return dataBase.getObject("bookNumber", bookingNum, Passenger.class);
    }

    //TODO
    /**
     * Get Passenger Object by Surname and ID number
     * */
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

    //TODO 后期返回值改为 boolean 成功返回 true
    /**
     * Remove the entering passenger object in Passenger data base
     * */
    public static void removePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        dataBase.removeObject(passenger, Passenger.class);
    }

    /**
     * Add a passenger into Passenger data base
     * */
    public static void storePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        dataBase.addObject(passenger);
    }
}
