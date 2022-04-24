package DataBase;

import Beans.Order.Order;
import Config.Config;

import java.io.IOException;

public class oDB {

    /**
     * Add a passenger into Passenger data base
     * */
    public static void addOrder(Order order){
        DataBase dataBase = new DataBase(Config.OrderFile);
        dataBase.addObject(order);
    }

    public Order getOrderByBookingNumber(String bookNumber){
        DataBase dataBase = new DataBase(Config.OrderFile);
        try {
            return dataBase.getObject("bookNumber", bookNumber, Order.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
