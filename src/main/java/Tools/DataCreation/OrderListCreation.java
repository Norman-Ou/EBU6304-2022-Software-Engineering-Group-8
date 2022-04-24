package Tools.DataCreation;

import Beans.Order.Order;
import DataBase.oDB;

public class OrderListCreation {

    String[] pIDArr = {"215200", "215201", "215202", "215203", "215204", "215205"};
    String[] flightNoArr = {"CA8852", "BA3352", "CX2582", "EK3588"};
    String[] bookNumberArr = {"2019200", "2019201", "2019202", "2019203", "2019204", "2019205"};

    public void createOrderList(){
        oDB.addOrder(new Order(pIDArr[0], flightNoArr[0], bookNumberArr[0]));
        oDB.addOrder(new Order(pIDArr[1], flightNoArr[0], bookNumberArr[1]));

        oDB.addOrder(new Order(pIDArr[2], flightNoArr[1], bookNumberArr[2]));

        oDB.addOrder(new Order(pIDArr[3], flightNoArr[2], bookNumberArr[3]));
        oDB.addOrder(new Order(pIDArr[4], flightNoArr[2], bookNumberArr[4]));

        oDB.addOrder(new Order(pIDArr[5], flightNoArr[3], bookNumberArr[5]));
        oDB.addOrder(new Order(pIDArr[0], flightNoArr[3], bookNumberArr[0]));
    }

    public static void main(String[] args) {
        new OrderListCreation().createOrderList();
    }
}
