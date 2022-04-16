package DataBase.DataCreation;

import DataBase.pDB;
import Flight.ExtraOption;
import Flight.Flight;
import Flight.Seat;
import Passenger.*;
import Passenger.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Create Testing Data
 *
 * @since April 4th, 2022
 * @author Ruizhe Ou, Jiacheng Li
 * @version 0.2
 */
public class DataCreation {

    //Passenger Information
    String[] nameArr = {"orz", "wmz", "wy", "ljc", "hlx", "wjy"};
    String[] bookNumberArr = {"2019200", "2019201", "2019202", "2019203", "2019204", "2019205"};
    String[] pIDArr = {"215200", "215201", "215202", "215203", "215204", "215205"};

    //Flight Information
    String[] flightNoArr = {"CA8852", "BA3352", "CX2582", "EK3588"};
    String[] airlinesArr = {"Air China","British Airways","Cathay Pacific","Emirates"};
    String[] depArr = {"Heathrow", "Heathrow", "Heathrow", "Heathrow"};
    String[] desArr = {"Beijing", "Paris", "Hong Kong", "Dubai"};
    String[] gateArr = {"2A", "45E", "8D", "17F", "39A"};
    String[] terArr = {"T1", "T2", "T2", "T1", "T1"};
    String[] ETDArr = {"06-09-2022 10:16:00", "06-09-2022 09:16:00", "07-09-2022 09:16:00", "06-09-2022 22:00:00"};
    String[] ETCArr = {"07-09-2022 09:46:00", "06-09-2022 08:46:00", "07-09-2022 08:46:00", "06-09-2022 21:20:00"};
    String[] ETAArr = {"07-09-2022 08:00:00", "06-09-2022 10:00:00", "08-09-2022 09:00:00", "06-09-2022 09:20:00"};
    int[] luggageLimitList = {60, 40, 30, 50, 30};

    // Seating Information
    HashMap<String, Seat> seatingLists = new HashMap<>();

    // ExtraOptions Information
    ArrayList<ExtraOption> extraOptionLists = new ArrayList<>();

    private void creatPassengers(){
        for (int i = 0; i < 6; i++){
            pDB.storePassenger(new Passenger(bookNumberArr[i], pIDArr[i], nameArr[i], new BoardingPass(), new Baggage(), new CreditCard(), new ArrayList<>()));
        }
    }

    /**
     * Function to generate seating lists
     *
     */
    public void createSeats() {
        int[] classArr = {2, 2, 1, 1, 0, 0, 0, 0, 0, 0};
        String[] noArr = {"E01", "E02", "E03", "E04", "E05", "E06", "E07", "E08", "E09", "E10"};
        String[] flightArr = {"CA8852", "CA8852", "CA8852", "CA8852", "CA8852", "CA8852", "CA8852", "CA8852", "CA8852", "CA8852"};
        boolean[] lockStatusArr = {true, false, true, false, true, false, true, true, true, true};

        ArrayList<Passenger> passengerArr = new ArrayList<>();
        passengerArr.add(new Passenger("215200"));
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger("215202"));
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger("215204"));
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger("215206"));
        passengerArr.add(new Passenger("215207"));
        passengerArr.add(new Passenger("215208"));
        passengerArr.add(new Passenger("215209"));

        int[] checkInArr = {0, 1, 0, 1, -1, 1, 0, 0, 1, 1};

        for(int i = 0; i < 10; i++){
            this.seatingLists.put(noArr[i], new Seat(
                classArr[i],
                noArr[i],
                flightArr[i],
                lockStatusArr[i],
                passengerArr.get(i),
                checkInArr[i]
            ));
        }
    }


    /**
     * Function to generate Extra options lists
     *
     */
    public void createOptionLists(){
        int[] kindArr = {0,1,0,0,1,1,0,1,0,1};
        String[] descriptionArr = {
            "Rice Noodles",
            "Fried Chicken",
            "Hot Dogs",
            "British Breakfast",
            "Hamburger",
            "Steak",
            "Tempura",
            "Salmon Sashimi",
            "Cheese and Toast",
            "Salad"
        };
        int[] priceArr = {1,2,3,4,5,6,7,8,9,10};
        String[] passengerIdArr = {"215200", "215201", "215202", "215203", "215204", "215205", "215206", "215207", "215208", "215209"};
        ArrayList<CreditCard> creditCardArr = new ArrayList<>();
        creditCardArr.add(new CreditCard("1234 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1232 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1134 5678 9123 4567"));
        creditCardArr.add(new CreditCard("2234 5678 9123 4567"));
        creditCardArr.add(new CreditCard("4234 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1634 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1934 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1254 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1214 5678 9123 4567"));
        creditCardArr.add(new CreditCard("1124 5678 9123 4567"));

        for(int i = 0; i < 10; i++){
            this.extraOptionLists.add(new ExtraOption(
                kindArr[i],
                descriptionArr[i],
                priceArr[i],
                passengerIdArr[i],
                creditCardArr.get(i)
            ));
        }
    }

    /**
     * Function to generate flight lists
     *
     */
    private void createFlights(){
        ArrayList<Flight> flightList = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            Flight curFlight = new Flight(
                    flightNoArr[i],
                    airlinesArr[i],
                    depArr[i],
                    desArr[i],
                    gateArr[i],
                    terArr[i],
                    ETDArr[i],
                    ETCArr[i],
                    ETAArr[i],
                    luggageLimitList[i],
                    this.seatingLists,
                    this.extraOptionLists
            );

            flightList.add(curFlight);
        }
    }

    public static void main(String[] args) {
        new DataCreation().creatPassengers();
    }
}
