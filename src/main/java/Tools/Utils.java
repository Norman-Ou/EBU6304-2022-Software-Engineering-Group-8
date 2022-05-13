package Tools;

import Beans.Flight.Flight;
import DataBase.fDB;


import java.io.*;
import Config.Config;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;

/**
 * @author Ruizhe Ou, Jiacheng Li
 * @version 1.0
 * @since 10th May
 *
 * Utilities Class
 * */
public class Utils {

    /**
     * Base64 Encoder
     * */
    public static <T> String encoder(T rawData){
        String rawStr = rawData.toString();
        final Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(rawStr.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Base64 Decoder
     * */
    public static String decoder(String encodedData){
        final Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedData), StandardCharsets.UTF_8);
    }

    /**
     * Update Test Data
     * */
    public static boolean updateTestData(){
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

        time.add(Calendar.HOUR, Config.flightStep_hour[0]);

        time.add(Calendar.MINUTE, Config.closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, Config.departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Config.Beijing2London_ms);
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

        time.add(Calendar.HOUR, Config.flightStep_hour[1]);

        time.add(Calendar.MINUTE, Config.closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, Config.departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Config.Paris2London_ms);
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

        time.add(Calendar.HOUR, Config.flightStep_hour[2]);

        time.add(Calendar.MINUTE, Config.closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, Config.departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Config.HK2London_ms);
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

        time.add(Calendar.HOUR, Config.flightStep_hour[3]);

        time.add(Calendar.MINUTE, Config.closeFromNow_min);
        flight.setETC(df.format(time.getTime()));

        time.add(Calendar.MINUTE, Config.departureAfterClose);
        flight.setETD(df.format(time.getTime()));

        time.add(Calendar.MILLISECOND, Config.Dubai2London_ms);
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

        try {
            fDB.replaceAllFlights(newFlights);
            System.out.println("Updated JSON file completed!");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
