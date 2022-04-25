package DataBase;

import Beans.Passenger.Passenger;

public class Test {
    public static void main(String[] args) {
        Passenger passenger = pDB.loadPassengerByBookingNo("2019201");

        System.out.println(passenger.toString());
    }
}
