package Tools;

import Passenger.Passenger;
import Config.Config;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class BeanUtils{

    public static Passenger getPassengerByBookingNo(int bookingNum){
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        return Utilities.searchObject(array, "bookNumber", bookingNum, Passenger.class);
    }

    public static Passenger getPassengerBySurname_ID(String surName, int IDNo) throws Exception {
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        Passenger p1 = Utilities.searchObject(array, "surName", surName, Passenger.class);
        Passenger p2 = Utilities.searchObject(array, "iDNo", IDNo, Passenger.class);

        //iteration 后面的了
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

    public static Passenger getPassengerByIDDocument(JSONObject idDocument){
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        

        return null;
    }
}
