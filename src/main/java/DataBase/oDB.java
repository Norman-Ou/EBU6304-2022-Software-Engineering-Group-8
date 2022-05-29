package DataBase;

import Beans.Order.Order;
import Beans.Passenger.Passenger;
import Config.Config;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Order Database interface class
 * @since April 14th, 2022
 * @author Ruizhe Ou
 * @version 0.2
 */
public class oDB {

    /**
     * Add a order into order data base
     *
     * @param order incoming order object
     * */
    public static void addOrder(Order order){
        DataBase dataBase = new DataBase(Config.OrderFile);
        try {
            dataBase.addObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get a order object in order data base based on booking number
     *
     * @param bookNumber booking order
     * @return Order object
     * */
    public static Order getOrderByBookingNumber(String bookNumber) throws DataNotFound {
        DataBase dataBase = new DataBase(Config.OrderFile);
        try {
            return dataBase.getObject("bookNumber", bookNumber, Order.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (DataNotFound dataNotFound) {
            throw new DataNotFound(bookNumber + " Order Not Found");
        }
    }

    /**
     * Get a order objects in order data base based on flight number
     *
     * @param flightNo flight number
     * @return A ArrayList contains order objects
     * */
    public static ArrayList<Order> getOrdersByFlightNo(String flightNo) throws DataNotFound{
        DataBase dataBase = new DataBase(Config.OrderFile);
        return dataBase.getObjects("flightNo", flightNo, Order.class);
    }

    /**
     * Get a order objects in order data base based on passenger ID
     *
     * @param passengerID passenger ID
     * @return A ArrayList contains order objects
     * */
    public static ArrayList<Order> getOrdersByPassengerId(String passengerID) throws DataNotFound{
        DataBase dataBase = new DataBase(Config.OrderFile);
        return dataBase.getObjects("passengerID", passengerID, Order.class);
    }
    @Test
    public void test1(){
        try {
            System.out.println(this.getOrderByBookingNumber("46921248"));
        } catch (DataNotFound dataNotFound) {
            dataNotFound.printStackTrace();
        }
    }
}
