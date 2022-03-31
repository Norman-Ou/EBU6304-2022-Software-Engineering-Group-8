package DataBase;

import Config.Config;
import Passenger.Passenger;
import com.alibaba.fastjson.JSONObject;

/**
 * Passenger Database operation class
 *
 * @author Ruizhe Ou
 * @version 0.1 March 24th, 2022
 */
public class pDB{

    /**
     * Get Passenger Object by bookingNumber attr
     * */
    public static Passenger loadPassengerByBookingNo(int bookingNum){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        return dataBase.getObject("bookNumber", bookingNum, Passenger.class);
    }

    //TODO
    /**
     * Get Passenger Object by Surname and ID number
     * */
    public static Passenger loadPassengerBySurname_ID(String surName, int IDNo) throws Exception {
        DataBase dataBase = new DataBase(Config.PassengerFile);
        Passenger p1 = dataBase.getObject("surName", surName, Passenger.class);
        Passenger p2 = dataBase.getObject("iDNo", IDNo, Passenger.class);
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
    public static Passenger loadPassengerByIDDocument(JSONObject idDocument){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        return dataBase.getObject(idDocument, Passenger.class);
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
