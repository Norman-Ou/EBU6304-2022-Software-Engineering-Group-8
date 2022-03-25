package DataBase;

import Config.Config;
import Passenger.Passenger;
import Tools.Utilities;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class pDB{

    public static Passenger loadPassengerByBookingNo(int bookingNum){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        return dataBase.getObject("bookNumber", bookingNum, Passenger.class);
    }

    //TODO
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
    public static Passenger loadPassengerByIDDocument(JSONObject idDocument){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        return dataBase.getObject(idDocument, Passenger.class);
    }

    //TODO 后期返回值改为 boolean 成功返回 true
    public static void removePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        dataBase.removeObject(passenger, Passenger.class);
    }

    public static void storePassenger(Passenger passenger){
        DataBase dataBase = new DataBase(Config.PassengerFile);
        dataBase.addObject(passenger);
    }
}
