package CheckIn;

import CheckIn.GUI.AirlineWindow;
import Tools.Utils;


public class EnterCheckIn {

    public static void main(String[] args) throws Exception {
        Utils.updateTestData();
        new AirlineWindow().setVisible(true);
    }
}
