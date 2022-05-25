package DataBase;

import Beans.Order.Order;
import Beans.Passenger.Passenger;
import Config.Config;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
     * Add a passenger into Passenger data base
     * */
    public static void addOrder(Order order){
        DataBase dataBase = new DataBase(Config.OrderFile);
        try {
            dataBase.addObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public static ArrayList<Order> getOrdersByFlightNo(String flightNo) throws DataNotFound{
        DataBase dataBase = new DataBase(Config.OrderFile);
        return dataBase.getObjects("flightNo", flightNo, Order.class);
    }

    public static ArrayList<Order> getOrdersByPassengerId(String passengerId) throws DataNotFound{
        DataBase dataBase = new DataBase(Config.OrderFile);
        return dataBase.getObjects("passengerID", passengerId, Order.class);
    }
}
