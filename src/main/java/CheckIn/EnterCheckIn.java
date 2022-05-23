package CheckIn;

import CheckIn.GUI.Airline_1;
import CheckIn.GUI.Seat_1_6;
import Tools.Utils;


public class EnterCheckIn {

    public static void main(String[] args) throws Exception {
        Utils.updateTestData();
        new Airline_1().setVisible(true);


//        System.out.println(pDB.loadPassengersBySurname_ID("Harris", "619531"));
    }
}
