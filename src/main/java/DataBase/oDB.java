package DataBase;

import Beans.Order.Order;
import Config.Config;
import Exceptions.DataNotFound;

import java.io.IOException;

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
}
