package Tools;

import Flight.Flight;
import Passenger.Passenger;
import Config.Config;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;


public class BeanUtils{

    //TODO 异常检测 有可能会返回null
    public static Passenger getPassengerByBookingNo(int bookingNum){
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        return Utilities.searchObject(array, "bookNumber", bookingNum, Passenger.class, true);
    }

    //TODO
    public static Passenger getPassengerBySurname_ID(String surName, int IDNo) throws Exception {
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        Passenger p1 = Utilities.searchObject(array, "surName", surName, Passenger.class, false);
        Passenger p2 = Utilities.searchObject(array, "iDNo", IDNo, Passenger.class, false);

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

    //TODO 完成这个方法
    public static Passenger getPassengerByIDDocument(JSONObject idDocument){
        JSONArray array = Utilities.readJsonFile(Config.PassengerFile);
        return null;
    }

    public static void WritePassengerBean(Passenger passenger) throws IOException {
        JSONArray array = Utilities.readJsonFile("src/main/resource/Passenger.json");
        JSONObject jsonObject = Utilities.Bean2JSON(passenger);
        array.add(jsonObject);

        Utilities.creatFile(array);
    }

    public static void WriteFlightBean(Flight flight) throws IOException {
        JSONArray array = Utilities.readJsonFile("src/main/resource/Passenger.json");
        JSONObject jsonObject = Utilities.Bean2JSON(flight);
        array.add(jsonObject);

        Utilities.creatFile(array);

    }
}
