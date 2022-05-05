package CheckIn;

import CheckIn.GUI.Airline_1;
import CheckIn.GUI.EnterBN_3;
import CheckIn.GUI.EnterOther_3;
import DataBase.pDB;


public class EnterCheckIn {

    public static void main(String[] args) throws Exception {

        new Airline_1().setVisible(true);
//        System.out.println(pDB.loadPassengersBySurname_ID("Harris", "619531"));
    }
}
