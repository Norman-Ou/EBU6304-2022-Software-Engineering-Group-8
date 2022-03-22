package Tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Utilities {


    /**
     * @param bean Object bean
     * @return
     */
    //Bean转换为JSON，返回JSONObject
    public static JSONObject Bean2JSON(Object bean){
        return (JSONObject) JSON.toJSON(bean);
    }

    /**
     * @param bean Object
     * @return str Object
     */
    //将对象转换成json, return String
    public static String tojson(Object bean) {

        String str = JSON.toJSONString(bean, true);

        return str;
    }

    public static <T> T searchObject(JSONArray array, String key, String value, Class<T> tClass) {

        JSONObject temp = new JSONObject();

        for (int i = 0; i < (array.size()); i++) {
            Object obj =  array.get(i);
            JSONObject ob= (JSONObject) obj;
            if (ob.get(key) == value) {
                //        temp = ob;
                //    }
                if (ob.containsKey(key)) {
                    temp = ob;
                    //System.out.println(ob);

                    if (ob.containsValue(value)) {
                        temp = ob;
                        //System.out.println(ob);
                    }
                }



            }
        }
        return (T) temp.toJavaObject(tClass);
    }

    public static <T> T json2Bean (JSONObject jsonObject, Class<T> tClass){
        return (T)jsonObject.toJavaObject(tClass);
    }


    public static void creatFile(String str, String fullPath) throws IOException {

        // Creat a file
        File file = new File(fullPath);
        if (!file.getParentFile().exists()) {file.getParentFile().mkdirs();}
        if (file.exists()) {file.delete();}
        file.createNewFile();

        // Write
        Writer write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        write.write(str);
        write.flush();
        write.close();

    }

    public static JSONObject array2Object(JSONArray array){
        JSONObject temp = new JSONObject();
        for (int i = 0; i < (array.size()); i++) {
            temp = array.getJSONObject(i);
        }
        return temp;
    }

    public static JSONObject fileToJson(JSONObject json,String fileName) {

        try (
                InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        ) {
            json = JSONObject.parseObject(IOUtils.toString(is, "utf-8"));
        } catch (Exception e) {
            System.out.println(fileName + "Error" + e);
        }
        return json;
    }

    public static JSONObject operateJsonObject(JSONObject obj,int function,String key,String value){

        JSONObject object=new JSONObject();
        if(function == 1){
            obj.put(key,value);
        } else if (function == 2) {
            obj.put(key,value);
        }else if (function == 3){
            obj.remove(key);
        }

        return obj;
    }

}
