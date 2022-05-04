package Tools;

import java.io.File;

public class FileTreeCreator{

    public static void genDirTree(String path, int level, String dir) {
        level++;
        File file = new File(path);
        File[] files = file.listFiles();
        if (!file.exists()) {
            System.out.println("File Doesn't exist");
            return;
        }
        if (files.length != 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    dir = f.getName();
                    System.out.println(levelSign(level) + dir);
                    genDirTree(f.getAbsolutePath(), level, dir);
                } else {
                    System.out.println(levelSign(level) + f.getName());
                }
            }
        }
    }

    private static String levelSign(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ├─");
        for (int x = 0; x < level; x++) {
            sb.insert(0, " │   ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FileTreeCreator.genDirTree("D:\\Java_Code\\SE_Project_G8\\src", 0, null);
    }
}
/*
├─main
│    ├─java
│    │    ├─BackEnd
│    │    │    ├─GUI
│    │    │    │    ├─backend.java
│    │    │    │    ├─backend.jfd
│    │    │    │    ├─Flight.java
│    │    │    │    ├─FilghtPage_demo.jfd
│    │    │    │    ├─Passenger.java
│    │    │    │    ├─Passenger.jfd
│    │    │    ├─Monitor
│    │    │    │    ├─AdminEnd.java
│    │    │    │    ├─WYTest.java
│    │    │    ├─ToEnterBackend.java
│    │    ├─Beans
│    │    │    ├─Flight
│    │    │    │    ├─Flight.java
│    │    │    │    ├─SubClasses
│    │    │    │    │    ├─ExtraOption.java
│    │    │    │    │    ├─Seat.java
│    │    │    ├─IDDocument
│    │    │    │    ├─IDDocument.java
│    │    │    ├─Passenger
│    │    │    │    ├─Passenger.java
│    │    │    │    ├─SubClasses
│    │    │    │    │    ├─Baggage.java
│    │    │    │    │    ├─BoardingPass.java
│    │    │    │    │    ├─CreditCard.java
│    │    ├─CheckIn
│    │    │    ├─EnterCheckIn.java
│    │    │    ├─GUI
│    │    │    │    ├─Airline_1.java
│    │    │    │    ├─Airline_1.jfd
│    │    │    │    ├─BaggageAdd_10.java
│    │    │    │    ├─BaggageAdd_10.jfd
│    │    │    │    ├─Baggage_7.java
│    │    │    │    ├─Baggage_7.jfd
│    │    │    │    ├─BagStore_8.java
│    │    │    │    ├─BagStore_8.jfd
│    │    │    │    ├─CheckInP.iml
│    │    │    │    ├─CheckIn_3.java
│    │    │    │    ├─CheckIn_2.jfd
│    │    │    │    ├─ConfirmPage_4.java
│    │    │    │    ├─ConfirmPage_3.jfd
│    │    │    │    ├─EnterBN.java
│    │    │    │    ├─EnterBN_3.jfd
│    │    │    │    ├─EnterOther.java
│    │    │    │    ├─EnterOther_3.jfd
│    │    │    │    ├─Error.java
│    │    │    │    ├─Error.jfd
│    │    │    │    ├─exit_16.java
│    │    │    │    ├─Exit.jfd
│    │    │    │    ├─MealAdd_14.java
│    │    │    │    ├─MealAdd_14.jfd
│    │    │    │    ├─MealNorm_13.java
│    │    │    │    ├─MealNorm_13.jfd
│    │    │    │    ├─MealPay_15.java
│    │    │    │    ├─MealPay_15.jfd
│    │    │    │    ├─Meal_12.java
│    │    │    │    ├─Meal_12.jfd
│    │    │    │    ├─PrintBag_11.java
│    │    │    │    ├─PrintBag_11.jfd
│    │    │    │    ├─PrintFlight_6.java
│    │    │    │    ├─PrintFlight_6.jfd
│    │    │    │    ├─SeatFirst_ac5.java
│    │    │    │    ├─SeatFirst_5.jfd
│    │    │    │    ├─SelectSeat_act6.java
│    │    │    │    ├─SelectSeat_act6.jfd
│    │    │    │    ├─VIPSeat.java
│    │    │    │    ├─VIPSeat.jfd
│    │    │    │    ├─VIPSeatPay.java
│    │    │    │    ├─VIPSeatPay.jfd
│    │    │    │    ├─Weight_9.java
│    │    │    │    ├─Weight_9.jfd
│    │    │    ├─Monitor
│    │    │    │    ├─Listeners.java
│    │    │    │    ├─MonitorTest.java
│    │    ├─Config
│    │    │    ├─Config.java
│    │    ├─DataBase
│    │    │    ├─DataBase.java
│    │    │    ├─fDB.java
│    │    │    ├─pDB.java
│    │    ├─Tools
│    │    │    ├─DataCreation.java
│    │    │    ├─DataTransfer.java
│    │    │    ├─FileTreeCreator.java
│    │    │    ├─Utilities.java
│    ├─resources
│    │    ├─Check.properties
│    │    ├─flight_data.json
│    │    ├─icon.png
│    │    ├─img.png
│    │    ├─passenger_data.json
├─test
│    ├─java

*
* */
