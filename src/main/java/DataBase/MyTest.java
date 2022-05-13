package DataBase;

import Beans.Flight.Flight;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MyTest {

    final int Beijing2London_ms = 32400000;
    final int Paris2London_ms   = 5400000;
    final int HK2London_ms      = 45000000;
    final int Dubai2London_ms   = 35100000;

    final int[] flightStep_hour = {0, 3, 24, 26};

    final int closeFromNow_min    = 3;
    final int departureAfterClose = 30;


    public long toTimestamp(String strDate) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        Date date = df.parse(strDate);
        return date.getTime();
    }

    public boolean updateTestData() throws IOException {
        ArrayList<Flight> flights = fDB.loadAllFlights();
        ArrayList<Flight> newFlights = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        //CA8852 Beijing
        Flight flight = flights.get(0);
        //07-09-2022 08:00:00
        System.out.println("-------" + flight.getFlightNo() + " Original-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        //获取当前时间
        Calendar time = Calendar.getInstance();

        time.add(Calendar.HOUR, flightStep_hour[0]);

        time.add(Calendar.MINUTE, closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Beijing2London_ms);
        flight.setETA(df.format(time.getTime()));

        System.out.println("-------" + flight.getFlightNo() + " Updated-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        newFlights.add(flight);

        //----------------------------------------------------//
        System.out.println();
        System.out.println();
        //----------------------------------------------------//

        //BA3352 Paris
        flight = flights.get(1);
        System.out.println("-------" + flight.getFlightNo() + " Original-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        //获取当前时间
        time = Calendar.getInstance();

        time.add(Calendar.HOUR, flightStep_hour[1]);

        time.add(Calendar.MINUTE, closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Paris2London_ms);
        flight.setETA(df.format(time.getTime()));

        System.out.println("-------" + flight.getFlightNo() + " Updated-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        newFlights.add(flight);

        //----------------------------------------------------//
        System.out.println();
        System.out.println();
        //----------------------------------------------------//

        //CX2582 HK
        flight = flights.get(2);
        System.out.println("-------" + flight.getFlightNo() + " Original-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        //获取当前时间
        time = Calendar.getInstance();

        time.add(Calendar.HOUR, flightStep_hour[2]);

        time.add(Calendar.MINUTE, closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, HK2London_ms);
        flight.setETA(df.format(time.getTime()));

        System.out.println("-------" + flight.getFlightNo() + " Updated-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        newFlights.add(flight);

        //----------------------------------------------------//
        System.out.println();
        System.out.println();
        //----------------------------------------------------//

        //EK3588 Dubai
        flight = flights.get(3);
        System.out.println("-------" + flight.getFlightNo() + " Original-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        //获取当前时间
        time = Calendar.getInstance();

        time.add(Calendar.HOUR, flightStep_hour[3]);

        time.add(Calendar.MINUTE, closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Dubai2London_ms);
        flight.setETA(df.format(time.getTime()));

        System.out.println("-------" + flight.getFlightNo() + " Updated-------");
        System.out.println("ETC: " + flight.getETC());
        System.out.println("ETD: " + flight.getETD());
        System.out.println("ETA: " + flight.getETA());

        newFlights.add(flight);

        //----------------------------------------------------//
        System.out.println();
        System.out.println();
        //----------------------------------------------------//

        fDB.replaceAllFlights(newFlights);
        return true;
    }


    public static void main(String[] args) throws ParseException, IOException {
        MyTest myTest = new MyTest();
        myTest.updateTestData();
//        System.out.println(9*60 + 45);
    }
}
