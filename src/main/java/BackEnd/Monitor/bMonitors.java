package BackEnd.Monitor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Beans.Flight.SubClasses.Seat;
import Beans.Order.Order;
import Beans.Passenger.Passenger;
import Beans.Flight.*;
import DataBase.fDB;
import DataBase.oDB;
import DataBase.pDB;
import Exceptions.DataNotFound;


/**
 * This is the control class for admin end operations
 *
 * @author Yao Wang
 * @version 1.3 April 16th, 2022
 */

public class bMonitors {
    
	// 所有航班的列表
	private List<Flight> flightList = fDB.loadAllFlights();
	// 所有乘客列表
    private static List<Passenger> passengerList = pDB.loadAllPassengers();

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

    // 获取某航班上所有乘客的名单
    public List<Passenger> getPassengerList(String targetFlightNo) {
        List<Order> oList;
        try {
            oList = oDB.getOrdersByFlightNo(targetFlightNo);
            List<Passenger> psgList = new ArrayList<Passenger>();
            for(int i = 1; i<oList.size(); i++){
                for(int j = 0; j<passengerList.size(); j++){
                    if(oList.get(i).getPassengerID()==passengerList.get(j).getPassengerId()){
                        psgList.add(passengerList.get(j));
                        System.out.println(oList.get(i).getPassengerID());
                    }
                }
            }
            System.out.println("done back");
            return psgList;
        } catch (DataNotFound e) {
            e.printStackTrace();
        }
        return null;
    }

    // 获取某航班上还未登机乘客名单 检查航班上的
    public List<Passenger> getUnboardedPassengerList(String targetFlightNo){
        List<Passenger> unboardedPassengerList = new ArrayList<Passenger>();
        List<Passenger> psgList = this.getPassengerList(targetFlightNo);
        for(int i = 0; i<psgList.size(); i++){
            if(psgList.get(i).getCheckinStatus()!=1){
                unboardedPassengerList.add(psgList.get(i));
            }
        }
        return unboardedPassengerList;
    }
        
    public List<String> printUnboardedPassengerList(List<Passenger> PList){
        List<String> infoList = new ArrayList<String>();
        for(int i = 0; i<PList.size(); i++){
            Passenger psg = PList.get(i);
            String info = psg.getPassengerId() + psg.getSurName();
            System.out.println("method");
            infoList.add(info);
        }
        return infoList;
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
        try {
            List<Passenger> psglist = pDB.loadPassengersByIDNum(passengerID);
            for(int i = 0; i<psglist.size(); i++){
                if(!(psglist.get(i).getCheckinStatus()==1)){
                    // 有大问题 先不写
                }
            }
        } catch (DataNotFound e) {
            e.printStackTrace();
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
			// System.out.println(day + "天" + hour + "小时" + min + "分" + s + "秒");
            return day + "天" + hour + "小时" + min + "分" + s + "秒";
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return null;
    }
}
