package Tools;

import Flight.*;
import Passenger.Passenger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class TestO {

    public static void main(String[] args) {
        Flight flight = new Flight();
        HashMap<String, Passenger> seatingList = new HashMap<String, Passenger>();
        Passenger ps1 = new Passenger();
        Passenger ps2 = new Passenger();
        Passenger ps3 = new Passenger();
        Passenger ps4 = new Passenger();
        Passenger ps5 = new Passenger();
        seatingList.put("22A", ps1);
        seatingList.put("23B", ps2);
        seatingList.put("24C", ps3);
        seatingList.put("25E", ps4);
        seatingList.put("26C", ps5);

        HashMap<Integer, Integer> checkinList = new HashMap<>();
        checkinList.put(ps1.getIDNo(), 0);
        checkinList.put(ps2.getIDNo(), 1);
        checkinList.put(ps3.getIDNo(), 0);
        checkinList.put(ps4.getIDNo(), 1);
        checkinList.put(ps5.getIDNo(), 1);

        ArrayList<ExtraOption> extraOptions = new ArrayList<ExtraOption>();


        flight.setNo("MU8858");
        flight.setAirlines("Southern China Airlines");
        flight.setOrigin("Beijing");
        flight.setDestination("Nanning");
        flight.setGate("8");
        flight.setTerminal("T3");
        flight.setETD("13:30");
        flight.setETC("2020/02/13");
        flight.setETA("16:30");
        flight.setLuggageLimit(60);
        flight.setSeatingList(seatingList);
        flight.setCheckinList(checkinList);
        flight.setExtraOptions(extraOptions);



        JSONObject jsonObject = Utilities.Bean2JSON(flight);
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);
        System.out.println(jsonArray);


    }
}
