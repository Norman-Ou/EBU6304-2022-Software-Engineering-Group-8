
import Passenger.Passenger;
import Passenger.Baggage;
import Passenger.BoardingPass;
import Flight.Seat;
import Tools.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

    public static <T> T json2Bean (JSONObject jsonObject, Class<T> tClass){
        return (T)jsonObject.toJavaObject(tClass);
    }


    public static void main(String[] args) throws IOException {

        Seat s1 = new Seat(0,"12");
        JSONObject seat1 = Utilities.Bean2JSON(s1);
        Seat s2 = new Seat(0,"13");
        JSONObject seat2 = Utilities.Bean2JSON(s2);

        Baggage baggage = new Baggage("1st Baggage");
        Utilities.Bean2JSON(baggage);

        BoardingPass boardingPass = new BoardingPass("To Beijing");
        //System.out.println("Main中的:" + DataTransfer.Bean2JSON(boardingPass));

        Passenger ps1 = new Passenger(123, "Norman", 2019213212, 2134, boardingPass, "soup", s1, baggage);
        Passenger ps2 = new Passenger(877, "Edith", 190899369, 2324, boardingPass, "soup", s2, baggage);
        //DataTransfer.Bean2JSON(ps1);


        JSONObject jsonObject1 =Utilities.Bean2JSON(ps1);
        JSONObject jsonObject2 =Utilities.Bean2JSON(ps2);


        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        //将这个jsonArray写入文件
        //-------------------------//
        //读取文件后得到jsonObject

        //根据第二个参数查找第个参数
        Utilities.searchPs(jsonArray,"Norman","iDNo");

//        //修改passenger2 iDNo为999
//        String jsOb = Utilities.tojson(jsonObject2);
//        String newOb = Utilities.update(jsOb,"iDNo","T375");
//        JSONObject jsonT = JSONObject.parseObject(newOb);
//        //System.out.println(jsonT);
//
//        //写入文件
//        String fileName="t10";
////        String fullPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(fileName)).getPath();
//        String fullPath = "D:\\Java_Code\\SE_Project_G8\\src\\main\\resources" + File.separator + fileName + ".json";
//
//        List<JSONObject> list=new ArrayList<>();
//        list.add(jsonObject1);
//        list.add(jsonT);
//
//        Utilities.writeLocalJson(fullPath,list);


    }


}
