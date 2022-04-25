package Beans.Passenger;


import Beans.Passenger.SubClasses.Baggage;
import Beans.Passenger.SubClasses.BoardingPass;
import Beans.Passenger.SubClasses.CreditCard;
import Beans.Flight.SubClasses.ExtraOption;
import java.util.*;

/**
 * This is the basic Passenger information class
 *
 * @author Jiayi Wang
 * @author Ruizhe Ou
 * @author Jiacheng Li
 * @version 0.2 March 24th, 2022
 */
public class Passenger {
    /**
     * Booking number of the passenger.<br/><br/>
     * Default Value: null
     */
    private String bookNumber;
    /**
     * Personal id of the passenger.<br/><br/>
     * Default Value: null
     */
    private String passengerId;
    /**
     * Surname of the passenger.<br/><br/>
     * Default Value: null
     */
    private String surName;
    /**
     * Boarding pass object of this passenger.<br/><br/>
     * Default Value: null
     */
    private BoardingPass boardingPass;
    /**
     * Baggage information object of this passenger.<br/><br/>
     * Default Value: null
     */
    private Baggage baggage;
    /**
     * Credit card object of this passenger.<br/><br/>
     * Default Value: null
     */
    private CreditCard creditCard;
    /**
     * Extra option list of this passenger.<br/><br/>
     * Default Value: empty ArrayList
     */
    private ArrayList<ExtraOption> extraOptions = new ArrayList<>();

    /**
     * Default Constructor
     */
    public Passenger() {}

    public Passenger(String passengerId){
        this.passengerId = passengerId;
    }

    public Passenger(String bookNumber, String passengerId, String surName, BoardingPass boardingPass, Baggage baggage, CreditCard creditCard, ArrayList<ExtraOption> extraOptions) {
        this.bookNumber = bookNumber;
        this.passengerId = passengerId;
        this.surName = surName;
        this.boardingPass = boardingPass;
        this.baggage = baggage;
        this.creditCard = creditCard;
        this.extraOptions = extraOptions;
    }

    /**
     * Accessors of Passenger class
     */
    public String getBookNumber() {return bookNumber;}
    public String getPassengerId() {return passengerId;}
    public String getSurName() {return surName;}
    public BoardingPass getBoardingPass() {return boardingPass;}
    public Baggage getBaggage() {return baggage;}
    public CreditCard getCreditCard() {return creditCard;}
    public ArrayList<ExtraOption> getExtraOptions() {return extraOptions;}

    @Override
    public String toString() {
        return "Passenger{" +
                "bookNumber='" + bookNumber + '\'' +
                ", passengerId='" + passengerId + '\'' +
                ", surName='" + surName + '\'' +
                ", boardingPass=" + boardingPass +
                ", baggage=" + baggage +
                ", creditCard=" + creditCard +
                ", extraOptions=" + extraOptions +
                '}';
    }

    /**
     * Modifiers of Passenger class
     */
    public void setBookNumber(String bookNumber) {this.bookNumber = bookNumber;}
    public void setPassengerId(String passengerId) {this.passengerId = passengerId;}
    public void setSurName(String surName) {this.surName = surName;}
    public void setBoardingPass(BoardingPass boardingPass) {this.boardingPass = boardingPass;}
    public void setBaggage(Baggage baggage) {this.baggage = baggage;}
    public void setCreditCard(CreditCard creditCard) {this.creditCard = creditCard;}
    public void setExtraOptions(ArrayList<ExtraOption> extraOptions) {this.extraOptions = extraOptions;}
}