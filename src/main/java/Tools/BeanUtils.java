package Tools;

import Passenger.Passenger;
import Config.Config;
import com.alibaba.fastjson.JSONArray;


public class BeanUtils{

    public static Passenger getPassengerByBookingNo(String key, int value){
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        return (Passenger) Utilities.searchObject(array, key, value, Passenger.class);
    }

    public static Passenger getPassengerBySurname(JSONArray array, String key, String value){
        return (Passenger) Utilities.searchObject(array, key, value, Passenger.class);
    }
}
