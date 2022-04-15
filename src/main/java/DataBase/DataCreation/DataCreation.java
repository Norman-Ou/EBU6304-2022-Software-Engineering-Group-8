package DataBase.DataCreation;

import DataBase.pDB;
import Flight.ExtraOption;
import Passenger.*;

import java.util.ArrayList;
import java.util.Arrays;


public class DataCreation {

    //Passenger Information
    String[] nameArr = {"orz", "wmz", "wy", "ljc", "hlx", "wjy"};
    String[] bookNumberArr = {"2019200", "2019201", "2019202", "2019203", "2019204", "2019205"};
    String[] pIDArr = {"215200", "215201", "215202", "215203", "215204", "215205"};

    //Flight Information
    String[] flightNoArr = {"CA852", "BA3352", "CX2582", "EK3588"};
    String[] airlinesArr = {"Air China","British Airways","Cathay Pacific","Emirates"};
    String[] depArr = {"Heathrow", "Heathrow", "Heathrow", "Heathrow"};
    String[] desArr = {"Beijing", "Paris", "Hong Kong", "Dubai"};
    String[] gateArr = {"2A", "45E", "8D", "17F", "39A"};
    String[] terArr = {"T1", "T2", "T2", "T1", "T1"};
    String[] ETDArr = {"06-09-2022 10:16:00", "06-09-2022 09:16:00", "07-09-2022 09:16:00", "06-09-2022 22:00:00"};
    String[] ETCArr = {"07-09-2022 09:46:00", "06-09-2022 08:46:00", "07-09-2022 08:46:00", "06-09-2022 21:20:00"};
    String[] ETAArr = {"07-09-2022 08:00:00", "06-09-2022 10:00:00", "08-09-2022 09:00:00", "06-09-2022 09:20:00"};
    int[] LLArr = {60, 40, 30, 50, 30};


    private void creatPassenger(){
        for (int i = 0; i < 6; i++){
            pDB.storePassenger(new Passenger(bookNumberArr[i], pIDArr[i], nameArr[i], new BoardingPass(), new Baggage(), new CreditCard(), new ArrayList<>()));
        }
    }

    private void createFlight(){

    }

    public static void main(String[] args) {
        new DataCreation().creatPassenger();
    }
}
