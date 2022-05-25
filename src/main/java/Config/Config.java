package Config;


import Beans.IDDocument.IDDocument;

public class Config {
    //------2020/05/22 data version v6------//
    public static final String PassengerFile = "src/main/resources/passenger_data_v6.json";
    public static final String PassengerNewFile = "src/main/resources/passengerNew_data_v6.json";
    public static final String FlightFile = "src/main/resources/flight_data_v6.json";
    public static final String OrderFile = "src/main/resources/order_data_v6.json";
    public static final String IDFile = "src/main/resources/id_document.json";
    public static final String CHECK_IN_GUI_FILE = "src/main/java/CheckIn/GUI";

    public static final IDDocument idDocument1 = new IDDocument("619531", "Harris");//The passenger booked two flights
    public static final IDDocument idDocument2 = new IDDocument("493807", "Miller");//3 col test


    //------ Configuration used in updating data in real time ------//
    //------ DO NOT CHANGE ------//
    public static final int Beijing2London_ms = 32400000;
    public static final int Paris2London_ms   = 5400000;
    public static final int HK2London_ms      = 45000000;
    public static final int Dubai2London_ms   = 35100000;
    //--------------------------//

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
}
