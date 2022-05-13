package Config;


public class Config {
    public static final String PassengerFile = "src/main/resources/passenger_data_v5.json";
    public static final String FlightFile = "src/main/resources/flight_data_v4.json";
    public static final String OrderFile = "src/main/resources/order_data_v4.json";
    public static final String IDFile = "src/main/resources/id_document.json";
    public static final String CHECK_IN_GUI_FILE = "src/main/java/CheckIn/GUI";

    //About updating data time
    public static final int Beijing2London_ms = 32400000;
    public static final int Paris2London_ms   = 5400000;
    public static final int HK2London_ms      = 45000000;
    public static final int Dubai2London_ms   = 35100000;

    public static final int[] flightStep_hour = {0, 3, 24, 26};

    public static final int closeFromNow_min    = 3;
    public static final int departureAfterClose = 30;
}
