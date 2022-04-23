package Tools.DataCreation;

import Beans.Passenger.Passenger;
import Beans.Passenger.SubClasses.CreditCard;

import java.util.ArrayList;

public class PassengerData {
    //Passenger Information
    String[] nameArr = {"orz", "wmz", "wy", "ljc", "hlx", "wjy"};
    String[] bookNumberArr = {"2019200", "2019201", "2019202", "2019203", "2019204", "2019205"};
    String[] pIDArr = {"215200", "215201", "215202", "215203", "215204", "215205"};

    ArrayList<CreditCard> creditCardArrayList = new ArrayList<>();

    public void setCreditCardArrayList(){
        creditCardArrayList.add(new CreditCard("1234 5678 9123 4567"));
        creditCardArrayList.add(new CreditCard("1232 5678 9123 4567"));
        creditCardArrayList.add(new CreditCard("1134 5678 9123 4567"));
        creditCardArrayList.add(new CreditCard("2234 5678 9123 4567"));
        creditCardArrayList.add(new CreditCard("4234 5678 9123 4567"));
        creditCardArrayList.add(new CreditCard("1634 5678 9123 4567"));
    }


}
