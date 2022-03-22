package Tools;

import Passenger.Passenger;
import com.alibaba.fastjson.JSONObject;

public class TestO {

    public <T> T json2Bean (JSONObject jsonObject, Class<T> tClass){
        return (T)jsonObject.toJavaObject(tClass);
    }

    public static void main(String[] args) {
        System.out.println(Passenger.class);
    }
}
