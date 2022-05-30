import CheckIn.GUI.Airline_1;
import Config.Config;
import DataBase.fDB;
import Tools.Utils;
import org.junit.Test;


public class EnterCheckIn {

    @Test
    public void test1(){
        System.out.println(fDB.loadAllFlights());
    }
    public static void main(String[] args) throws Exception {
        System.out.println(Config.FlightFile);
        Utils.updateTestData();
        new Airline_1().setVisible(true);
    }
}
