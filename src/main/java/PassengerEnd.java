import Flight.*;
import Passenger.*;
import Tools.ToDB;
import com.alibaba.fastjson.JSONObject;

public class PassengerEnd implements ToDB {

    private final int bookNumber = 1234;
    private final String surName = "ourz";
    private final int IDNo = 10119;

    Passenger passenger;
    Flight flight;

    @Override
    public JSONObject readFile() {
        return null;
    }

    @Override
    public void writeFile() {

    }

    public static void main(String[] args) {


    }
}
