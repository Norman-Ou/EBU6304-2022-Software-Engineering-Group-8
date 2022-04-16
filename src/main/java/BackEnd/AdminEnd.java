/*
package BackEnd;

import java.util.ArrayList;
import java.util.List;
import Passenger.Passenger;
import Flight.*;


*/
/**
 * This is the control class for admin end operations
 *
 * @author Yao Wang
 * @version 1.2 April 9th, 2022
 *//*


public class AdminEnd {

    public AdminEnd(){}

    // 根据航班号查询航班信息 获得对应的乘客列表
    public List<Flight> getFlightList(String targetFlightNo){
        // get flight information and passenger list through flight number
        // 因为数据限制 暂时简化查找过程
        // 所有航班的列表
        List<Flight> flightList = new ArrayList<Flight>();
        Flight testFlight1 = new Flight();
        Flight testFlight2 = new Flight();
        flightList.add(testFlight1);
        flightList.add(testFlight2);
        // 目标航班的航班列表
        List<Flight> targetFlightList = new ArrayList<Flight>();
        for (int i = 0; i < targetFlightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getFlightNo().equals(targetFlightNo)){
                targetFlightList.add(flight);
            }
        }
        return targetFlightList;
    }

    // 根据时间查询航班信息 获得对应的乘客列表
    public List<Flight> getFlightListByTime(String targetTime){
        // get flight information and passenger list through current time
        // 因为数据限制 暂时简化查找过程
        // 所有航班的列表
        List<Flight> flightList = new ArrayList<Flight>();
        Flight testFlight1 = new Flight();
        Flight testFlight2 = new Flight();
        flightList.add(testFlight1);
        flightList.add(testFlight2);
        // 目标航班的航班列表
        List<Flight> targetFlightList = new ArrayList<Flight>();
        for (int i = 0; i < targetFlightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getETD().equals(targetTime)){
                targetFlightList.add(flight);
            }
        }
        return targetFlightList;
    }

    // 获取 即将起飞（15分钟后，也就是ETC）的航班 列表 (也叫做紧急列表)
    public List<String> getUrgenList(String currentTime){
        Flight testFlight = new Flight();
        List<String> urgentFlighList = new ArrayList<String>();
        if(testFlight.getETC()==currentTime){
            urgentFlighList.add(testFlight.getFlightNo());
        }
        return urgentFlighList;
    }

    // 获取某航班上还未登机乘客名单
    public List<Passenger> getUnboardedPassengerList(String targetFlightNo){
        // String flightNo = this.getFlightInfo(targetFlightNo).get(0).getFlightNo();
        List<Seat> seatingList = this.getFlightList(targetFlightNo).get(0).getSeatingList();
        List<Passenger> unboardedPassengerList = new ArrayList<Passenger>();
        for(int i = 0; i < seatingList.size(); i++) {
            Seat seat = seatingList.get(i);
            if(seat.getCheckinStatus()==-1){
                // 找到了没登机的乘客的座位
                unboardedPassengerList.add(seat.getPassenger());
            }
        }
        return unboardedPassengerList;
    }

    // 紧急提醒
    public void pumpWarning(List<String> urgentFlighList){
        System.out.println("马上起飞了！！！！");
        for(int i = 0; i < urgentFlighList.size(); i++){
            String flightNo = this.getFlightList(urgentFlighList.get(i)).get(i).getFlightNo();
            System.out.println("下面是航班号为： "+flightNo+"的航班还未登机的乘客名单：");
            System.out.println(this.getUnboardedPassengerList(flightNo));
        }
    }

    public static void main(String[] args) {
        int choice=1;
        switch (choice){

            case 0:
                // get flight information of the specific flight
                break;
            case 1:
                // get the passengers list of the specific flight
                break;
            case 2:
                // get the list of passengers don't board of the specific flight
                // can send alarm here
                break;
            default:
                break;
        }
    }
}
*/
