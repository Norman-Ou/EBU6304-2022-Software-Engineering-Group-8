package Tools;

import Passenger.Passenger;
import com.alibaba.fastjson.JSONArray;


public class BeanUtils{

    public static Passenger getPassengerByBookingNo(JSONArray array, String key, String value){

        return (Passenger) Utilities.searchObject(array, value, key,Passenger.class);

    }
}
