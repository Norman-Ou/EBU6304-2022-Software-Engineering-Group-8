package Config;

import Beans.IDDocument.IDDocument;
import Tools.Utils;

/**
 * Project Configuration class. Containing all the final value used in the project.
 *
 * @author Ruizhe
 * @version 1.0
 * */
public class Config {
    //------2020/05/22 data version v6------//
    public static final String PassengerFile = Utils.getRsrFile("passenger_data_v6.json");
    public static final String PassengerNewFile = Utils.getRsrFile("passengerNew_data_v6.json");
    public static final String FlightFile = Utils.getRsrFile("flight_data_v6.json");
    public static final String OrderFile = Utils.getRsrFile("order_data_v6.json)");
    public static final String IDFile = Utils.getRsrFile("id_document.json");

    public static final IDDocument idDocument1 = new IDDocument("912843", "Statham");//The passenger booked two flights
    public static final IDDocument idDocument2 = new IDDocument("493807", "Miller");//3 col test
    public static final String bgPic = Utils.getRsrFile("Img.png");

    /**
     * ==flightStep_hour==
     * Configure the Reference time (in hours) parameters for flights in how far from now.        <br><br/>
     * Index 0 -> To Beijing                                                                      <br><br/>
     * Index 1 -> To Paris                                                                        <br><br/>
     * Index 2 -> To Hong Kong                                                                    <br><br/>
     * Index 3 -> To Dubai                                                                        <br><br/>
     *                                                                                            <br><br/>
     * Example: "Index 0 -> 0" means the reference time for the flight to Beijing is NOW.         <br><br/>
     * ----------------------------------------------------------------------------------------   <br><br/>
     *
     * ==closeFromNow_min==
     * Configure the close time from reference time (in minutes).
     *
     * Example: "closeFromNow_min = 3" means check-in service for the flight to Beijing will be close in 3(mins) from now
     * ----------------------------------------------------------------------------------------
     *
     * ==departureAfterClose==
     * Configure the departure time from close time (in minutes).
     *
     * Example: "departureAfterClose = 30" means the flight to Beijing will be departure in 30 minutes from check-in service closing.
     * ----------------------------------------------------------------------------------------
     * */
    public static final int[] flightStep_hour = {0, 3, 24, 26};

    //o out 3 in
    public static final int closeFromNow_min    = 3;
    public static final int departureAfterClose = 30;
    //-------------------------------------------------------------//

    //------ Configuration used in updating data in real time ------//
    //------ DO NOT CHANGE ------//
    public static final int Beijing2London_ms = 32400000;
    public static final int Paris2London_ms   = 5400000;
    public static final int HK2London_ms      = 45000000;
    public static final int Dubai2London_ms   = 35100000;
    //--------------------------//
}
