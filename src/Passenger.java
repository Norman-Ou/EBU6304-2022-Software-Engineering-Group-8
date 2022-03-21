package Passenger;

import Flight.Seat.Seat;

import java.io.Serializable;

public class Passenger {
    private int bookNumber;
    private String surName;
    private int IDNo;
    private int creditCardNo;
    private BoardingPass bp;
    private String meal;
    private Seat seat;
    private Baggage baggage;

    public Passenger() {
    }

    public Passenger(int bookNumber, String surName, int IDNo, int creditCardNo, BoardingPass bp, String meal, Seat seat, Baggage baggage) {
        this.bookNumber = bookNumber;
        this.surName = surName;
        this.IDNo = IDNo;
        this.creditCardNo = creditCardNo;
        this.bp = bp;
        this.meal = meal;
        this.seat = seat;
        this.baggage = baggage;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getIDNo() {
        return IDNo;
    }

    public void setIDNo(int IDNo) {
        this.IDNo = IDNo;
    }

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public BoardingPass getBp() {
        return bp;
    }

    public void setBp(BoardingPass bp) {
        this.bp = bp;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }


}
