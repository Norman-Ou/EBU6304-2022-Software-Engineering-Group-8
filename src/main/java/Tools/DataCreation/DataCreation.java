package Tools.DataCreation;

import Beans.Order.Order;
import Beans.Passenger.SubClasses.Baggage;
import Beans.Passenger.SubClasses.BoardingPass;
import Beans.Passenger.SubClasses.CreditCard;
import DataBase.*;
import Beans.Flight.SubClasses.ExtraOption;
import Beans.Flight.Flight;
import Beans.Flight.SubClasses.Seat;
import Beans.Passenger.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Create Testing Data
 *
 * @since April 4th, 2022
 * @author Ruizhe Ou, Jiacheng Li
 * @version 0.4
 */
public class DataCreation {

    //Passenger Information
    String[] nameArr = {"orz", "wmz", "wy", "ljc", "hlx", "wjy"};
    String[] bookNumberArr = {"2019200", "2019201", "2019202", "2019203", "2019204", "2019205"};
    String[] pIDArr = {"215200","215201", "215202", "215203", "215204", "215205"};
    String[] creditCardArr = {"1234 5678 9123 4567", "1232 5678 9123 4567", "1134 5678 9123 4567", "2234 5678 9123 4567", "4234 5678 9123 4567", "1634 5678 9123 4567"};

    //Beans.Flight Information
    String[] flightNoArr = {"CA8852", "BA3352", "CX2582", "EK3588"};
    String[] airlinesArr = {"Air China","British Airways","Cathay Pacific","Emirates"};
    String[] depArr = {"Heathrow", "Heathrow", "Heathrow", "Heathrow"};
    String[] desArr = {"Beijing", "Paris", "Hong Kong", "Dubai"};
    String[] gateArr = {"2A", "45E", "8D", "17F", "39A"};
    String[] terArr = {"T1", "T2", "T2", "T1", "T1"};
    String[] ETDArr = {"06-09-2022 10:16:00", "06-09-2022 09:16:00", "07-09-2022 09:16:00", "08-09-2022 22:00:00"};
    String[] ETCArr = {"07-09-2022 09:46:00", "06-09-2022 08:46:00", "07-09-2022 08:46:00", "08-09-2022 21:20:00"};
    String[] ETAArr = {"07-09-2022 08:00:00", "06-09-2022 10:00:00", "08-09-2022 09:00:00", "08-09-2022 09:20:00"};
    int[] luggageLimitList = {60, 40, 30, 50, 30};

    HashMap<String, ExtraOption> passengerOptions = new HashMap<>();

    // Seating Information
    HashMap<String, Seat> seatingLists = new HashMap<>();
    HashMap<String, Seat> noOrzLists = new HashMap<>();

    // ExtraOptions Information
    ArrayList<ExtraOption> extraOptionLists = new ArrayList<>();

    private void creatPassengers(){

        //No checked in passenger
        for (int i = 1; i < 6; i++){
            pDB.storePassenger(
                new Passenger(
                    bookNumberArr[i],
                    pIDArr[i],
                    nameArr[i],
                    new BoardingPass(),
                    new Baggage(),
                    new CreditCard(creditCardArr[i]),
                    new ArrayList<>()
                )
            );
        }
    }

    public void createOrderList(){
        oDB.addOrder(new Order(pIDArr[0], flightNoArr[0], bookNumberArr[0]));
        oDB.addOrder(new Order(pIDArr[1], flightNoArr[0], bookNumberArr[1]));

        oDB.addOrder(new Order(pIDArr[2], flightNoArr[1], bookNumberArr[2]));

        oDB.addOrder(new Order(pIDArr[3], flightNoArr[2], bookNumberArr[3]));
        oDB.addOrder(new Order(pIDArr[4], flightNoArr[2], bookNumberArr[4]));

        oDB.addOrder(new Order(pIDArr[5], flightNoArr[3], bookNumberArr[5]));
        oDB.addOrder(new Order(pIDArr[0], flightNoArr[3], bookNumberArr[0]));
    }

    /**
     * Function to generate seating lists
     *
     */
    public void createSeats() {
        int[] classArr = {2, 2, 1, 1, 0, 0, 0, 0, 0, 0};
        String[] noArr = {"E01", "E02", "E03", "E04", "E05", "E06", "E07", "E08", "E09", "E10"};
        boolean[] lockStatusArr = {true, false, false, false, false, false, false, false, false, false};

        ExtraOption orzExtraOption = new ExtraOption(
                1,
                "British Breakfast",
                4
        );
        ArrayList<ExtraOption> orzExtraOptionList = new ArrayList<ExtraOption>();
        orzExtraOptionList.add(orzExtraOption);

        FlightData flightNo1 = new FlightData();
        BoardingPass orzBoardingPass = new BoardingPass(
            flightNo1.flightNoArr[0],
            "E01",
            flightNo1.gateArr[0],
            flightNo1.ETDArr[0],
            flightNo1.ETCArr[0],
            flightNo1.ETAArr[0],
            flightNo1.depArr[0],
            flightNo1.desArr[0]
        );
        Passenger aCompletePassenger = new Passenger(
                "2019200",
                "215200",
                "orz",
                orzBoardingPass,
                new Baggage(),
                new CreditCard("1234 5678 9123 4567"),
                orzExtraOptionList
        );

        pDB.storePassenger(aCompletePassenger);

        ArrayList<Passenger> passengerArr = new ArrayList<>();
        passengerArr.add(aCompletePassenger);
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());
        passengerArr.add(new Passenger());

        ArrayList<Passenger> emptyPassengerArr = new ArrayList<>();
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());
        emptyPassengerArr.add(new Passenger());

        int[] checkInArr = {0, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for(int i = 0; i < 10; i++){
            this.seatingLists.put(noArr[i], new Seat(
                    classArr[i],
                    noArr[i],
                    lockStatusArr[i],
                    passengerArr.get(i),
                    checkInArr[i]
            ));
        }

        for(int i = 0; i < 10; i++){
            if(i == 0){
                this.noOrzLists.put(noArr[i], new Seat(
                        classArr[i],
                        noArr[i],
                        false,
                        emptyPassengerArr.get(i),
                        -1
                ));
            }else{
                this.noOrzLists.put(noArr[i], new Seat(
                        classArr[i],
                        noArr[i],
                        lockStatusArr[i],
                        emptyPassengerArr.get(i),
                        checkInArr[i]
                ));
            }
        }
    }


    /**
     * Function to generate Extra options lists
     *
     */
    public void createOptionLists(){
        int[] kindArr = {0,0,1,1,1,1,1,1,1,1};
        String[] descriptionArr = {
            "Baby Seat",
            "Elder Seat",
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

        for(int i = 0; i < 10; i++){
            this.extraOptionLists.add(new ExtraOption(
                kindArr[i],
                descriptionArr[i],
                priceArr[i]
            ));
        }
    }

    /**
     * Function to generate flight lists
     *
     */
    private void createFlights(){

        createOptionLists();
        createSeats();

        HashMap<String, ExtraOption> orzOptionLists = new HashMap<>();


        for(int j = 0; j < 4; j++){
            if(j == 0)
                orzOptionLists.put(nameArr[j], extraOptionLists.get(j));
        }

        for(int i = 0; i < 4; i++){
            if(i == 0)
                fDB.storeFlight(new Flight(
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
                        this.extraOptionLists,
                        orzOptionLists
                ));
            else
                fDB.storeFlight(new Flight(
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
                        this.noOrzLists,
                        this.extraOptionLists,
                        this.passengerOptions
                ));
        }
    }

    public static void main(String[] args) {
        DataCreation dataCreation = new DataCreation();


        dataCreation.creatPassengers();
        dataCreation.createFlights();
    }
}
