
import Config.Config;
import Flight.Flight;
import Passenger.Baggage;
import Passenger.BoardingPass;
import Passenger.Passenger;
import Flight.Seat;
import PassengerGUI.Airline_1;
import Tools.Utilities;
import Tools.BeanUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import PassengerGUI.Airline_1;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) throws Exception {

        /*Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("Check",locale);
        new Airline_1().setVisible(true);

        Seat s1 = new Seat(1,"12");
        JSONObject seat1 = Utilities.Bean2JSON(s1);
        Seat s2 = new Seat(0,"13");
        JSONObject seat2 = Utilities.Bean2JSON(s2);

        Baggage baggage = new Baggage("1st Baggage");
        Utilities.Bean2JSON(baggage);

        BoardingPass boardingPass = new BoardingPass("To Beijing");
        //System.out.println("Main中的:" + DataTransfer.Bean2JSON(boardingPass));

        Passenger ps1 = new Passenger(123, "Norman", 2019213212, 2134, boardingPass, "soup", s1, baggage);
        Passenger ps2 = new Passenger(877, "Edith", 190899369, 23, boardingPass, "soup", s2, baggage);
        Passenger ps3 = new Passenger(312, "A", 19089123, 2324, boardingPass, "soup", s1, baggage);
        Passenger ps4 = new Passenger(832, "E", 192329369, 2, boardingPass, "soup", s2, baggage);
        Passenger ps5 = new Passenger(137, "B", 13224369, 1, boardingPass, "soup", s2, baggage);

        //DataTransfer.Bean2JSON(ps1);
        JSONObject jsonObject1 = Utilities.Bean2JSON(ps1);
        JSONObject jsonObject2 = Utilities.Bean2JSON(ps2);
        JSONObject jsonObject3 = Utilities.Bean2JSON(ps3);
        JSONObject jsonObject4 = Utilities.Bean2JSON(ps4);
        JSONObject jsonObject5 = Utilities.Bean2JSON(ps5);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);
        //System.out.println(jsonArray);

        //创建Passenger文件
        Utilities.creatFile(jsonArray);

        //读取文件
        String fileName="Passenger";
        String fullPath = "src/main/resources" + File.separator + fileName + ".json";

        //写入新的Passenger
        BeanUtils.WritePassengerBean(ps1);

        //写入新的Flight
        Flight flight1 = new Flight();
        BeanUtils.WriteFlightBean(flight1);


        读取文件
        String fileName="t10";
        String fullPath = "src/main/resources" + File.separator + fileName + ".json";
        JSONArray ar2 = Utilities.readJsonFile(fullPath);
        System.out.println(ar2);

         在文件中根据value查找key
        Passenger object1 = BeanUtils.getPassengerByBookingNo(877);
        Passenger object2 = BeanUtils.getPassengerBySurname_ID("Edith",19089123);
        JSONObject obj1   = Utilities.Bean2JSON(object1);
        JSONObject obj2   = Utilities.Bean2JSON(object2);
        System.out.println(obj1);
        JSONArray array2 = Utilities.readJsonFile(Config.PassengerFile);

         //对JSONObject替换、改
        JSONObject object22 = Utilities.operateJsonObject(obj1,1,"iDNo","13224369");
        System.out.println(object22);

        删除某个passenger的全部信息
        Utilities.deletePs(jsonArray,obj1);
        String jStr =jsonArray.toJSONString();
        Utilities.creatFile(jStr,fullPath);*/

    }
}
