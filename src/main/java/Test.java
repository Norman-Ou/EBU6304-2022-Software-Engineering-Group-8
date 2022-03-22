
import Passenger.Baggage;
import Passenger.BoardingPass;
import Passenger.Passenger;
import Flight.Seat;
import Tools.Utilities;
import Tools.BeanUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.IOException;

public class Test {


    public static void main(String[] args) throws IOException {

        Seat s1 = new Seat(1,"12");
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
        //System.out.println(jsonArray);

        //创建文件
        String fileName="1";
        String fullPath = "src/main/resources" + File.separator + fileName + ".json";
        String jsonString=jsonArray.toJSONString();
        //System.out.println(jsonString);
        Utilities.creatFile(jsonString,fullPath);

        // //打开文件 读取文件
       // JSONArray tempArray = new JSONArray();
        //String jsonString2=tempArray.toJSONString();
        //JSONObject temp = Utilities.array2Object(jsonArray);
        //JSONObject ob = Utilities.fileToJson(temp,fullPath);
        //System.out.println(ob);

        // //在文件中根据value查找key
        Passenger object1 = BeanUtils.getPassengerByBookingNo(jsonArray,"creditCardNo","2134");
        JSONObject obj1 = Utilities.Bean2JSON(object1);
        System.out.println(obj1);

        // //对JSONObject替换、删、改
        //JSONObject object2 = Utilities.operateJsonObject(obj1,1,"idNo","190899369");



    }


}
