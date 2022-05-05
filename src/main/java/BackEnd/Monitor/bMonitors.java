package BackEnd.Monitor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Beans.Flight.SubClasses.Seat;
import Beans.Passenger.Passenger;
import Beans.Flight.*;
import DataBase.fDB;


/**
 * This is the control class for admin end operations
 *
 * @author Yao Wang
 * @version 1.3 April 16th, 2022
 */

public class bMonitors {
    
	// 所有航班的列表
	private List<Flight> flightList = fDB.loadAllFlights();
	
    public bMonitors(){}

    // 根据航班号查询航班信息 获得对应的乘客列表
    public Flight getFlightList(String targetFlightNo){
        // get flight information and passenger list through flight number
        // 目标航班的航班列表
        Flight targetFlight = new Flight();
        for (int i = 0; i < flightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getFlightNo().equals(targetFlightNo)){
                targetFlight = flight;
            }
        }
        return targetFlight;
    }

    // 根据时间查询航班信息 获得对应的乘客列表
    public List<Flight> getFlightListByTime(String targetTime){
        // get flight information and passenger list through current time
        // 目标航班的航班列表
        List<Flight> targetFlightList = new ArrayList<Flight>();
        for (int i = 0; i < flightList.size(); i++) {
            Flight flight = flightList.get(i);
            if(flight.getETD().equals(targetTime)){
                targetFlightList.add(flight);
            }
        }
        return targetFlightList;
    }
    
    // 获取 即将起飞（15分钟后，也就是ETC）的航班 列表 (也叫做紧急列表)
    public List<String> getUrgenList(){
    	// 获取当前时间
    	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        String currentTime = sdf.format(System.currentTimeMillis());
        List<String> urgentFlighList = new ArrayList<String>();
        for (int i = 0; i<flightList.size(); i++) {
        	Flight flight = flightList.get(i);
        	if(flight.getETC().equals(currentTime)){
                urgentFlighList.add(flight.getFlightNo());
            }
        }
        return urgentFlighList;
    }

    // 获取某航班上还未登机乘客名单
    public List<Passenger> getUnboardedPassengerList(String targetFlightNo){
    	HashMap<String, Seat> seatingList = this.getFlightList(targetFlightNo).getSeatingList();
        List<Passenger> unboardedPassengerList = new ArrayList<Passenger>();
        for (String key : seatingList.keySet()) {
        	Seat seat = seatingList.get(key);
        	if(seat.getCheckinStatus()==-1){
                // 找到了没登机的乘客的座位
                unboardedPassengerList.add(seat.getPassenger());
            }
        }
        return unboardedPassengerList;
    }

    // 紧急提醒
    // public void pumpWarning(List<String> urgentFlighList){
    //     System.out.println("马上起飞了！！！！");
    //     for(int i = 0; i < urgentFlighList.size(); i++){
    //         String flightNo = this.getFlightList(urgentFlighList.get(i)).get(i).getFlightNo();
    //         System.out.println("下面是航班号为： "+flightNo+"的航班还未登机的乘客名单：");
    //         System.out.println(this.getUnboardedPassengerList(flightNo));
    //     }
    // }

    // 通过id查乘客状态
    public Passenger searchPassengerById(String passengerID){
        Passenger targetPassenger = new Passenger();
        for (int i = 0; i<flightList.size(); i++) {
        	Flight flight = flightList.get(i);
            HashMap<String, Seat> seatingList = flight.getSeatingList();
            for (String key : seatingList.keySet()) {
        	    Seat seat = seatingList.get(key);
                Passenger psg = seat.getPassenger();
        	    if(psg.getPassengerId().equals(passengerID)){
                    targetPassenger=psg;
                }
            }
        }
        return targetPassenger;
    }

    public String calculateDiff(String timeToClose){
        // 获取当前时间
    	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        String currentTime = sdf.format(System.currentTimeMillis());
        Date current;
		try {
			current = sdf.parse(currentTime);
			Date target = sdf.parse(timeToClose);
			long between = target.getTime() - current.getTime();
			long day = between / (24 * 60 * 60 * 1000);
			long hour = (between / (60 * 60 * 1000) - day * 24);
			long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
			long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			System.out.println(day + "天" + hour + "小时" + min + "分" + s + "秒");
            return day + "天" + hour + "小时" + min + "分" + s + "秒";
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}
