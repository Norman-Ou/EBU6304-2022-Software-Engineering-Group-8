package Tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class DataTransfer {
    //Object to JSON, print
    public static JSONObject Bean2JSON(Object bean){

        JSONObject jsonObject = (JSONObject) JSON.toJSON(bean);
        String beanJ = jsonObject.toString();
        System.out.println(beanJ);

        return jsonObject;
    }
}
