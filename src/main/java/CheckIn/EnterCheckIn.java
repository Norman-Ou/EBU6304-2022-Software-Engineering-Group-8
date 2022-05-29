package CheckIn;

import CheckIn.GUI.AirlineWindow;
import CheckIn.GUI.Airline_1;
import Tools.Utils;

import static Tools.Utils.updateTestData;


public class EnterCheckIn {

    public static void main(String[] args) throws Exception {

        Utils.updateTestData();
        new Airline_1().setVisible(true);
    }
}
