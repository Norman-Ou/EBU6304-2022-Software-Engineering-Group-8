package DataBase;

import Beans.Flight.Flight;
import Beans.Order.Order;
import Exceptions.DataNotFound;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MyTest {

    public String test1() throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File("src/main/resources/order_data_v6.json");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

        String data;

        while ((data = reader.readLine()) != null){
//            JSON.toJSON(data);
//            System.out.print(data);
            sb.append(data);
        }

        System.out.println(JSON.toJSONString(sb.toString()));

        return null;
    }

    public void test2() throws DataNotFound {
        Order order = oDB.getOrderByBookingNumber("75375917");
        System.out.println(order);
    }


    public static void main(String[] args) throws ParseException, IOException {
        MyTest myTest = new MyTest();
        Calendar time = Calendar.getInstance();

        System.out.println(time.getTime());
//        myTest.test1();
//        System.out.println(9*60 + 45);
    }
}
