package Passenger.Seat;

public class Seat {
    private String sClass;
    private int seatNo;

    public Seat() {
    }

    public Seat(String sClass, int seatNo) {
        this.sClass = sClass;
        this.seatNo = seatNo;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
