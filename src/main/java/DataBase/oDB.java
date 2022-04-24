package DataBase;

import Beans.Order.Order;
import Config.Config;

public class oDB {

    /**
     * Add a passenger into Passenger data base
     * */
    public static void addOrder(Order order){
        DataBase dataBase = new DataBase(Config.OrderFile);
        dataBase.addObject(order);
    }
}
