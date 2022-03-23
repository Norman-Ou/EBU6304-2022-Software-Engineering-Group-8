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

    public static <T,K> T searchObject(JSONArray array, String key, K value, Class<T> tClass, boolean delete) {

        for (int i = 0; i < (array.size()); i++) {
            JSONObject ob =  (JSONObject)array.get(i);
            if (ob.containsValue(value)) {
                if (delete){
                    array.remove(ob);
                    return ob.toJavaObject(tClass);
                }else
                return ob.toJavaObject(tClass);
            }
        }
        return null;
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

    // 用于读取JSON文件
    public static JSONArray readJsonFile(String filePath) {
        BufferedReader reader = null;
        String readJson = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                readJson += tempString;
            }
        } catch (IOException e) {
            System.out.println(filePath + "Error" + e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(filePath + "Error" + e);
                }
            }
        }
        JSONArray array1 = JSONArray.parseArray(readJson);
        return array1;
    }

    public static JSONObject operateJsonObject(JSONObject obj,int function,String key,String value){

        if(function == 1){
            obj.put(key,value);
        } else if (function == 2) {
            obj.replace(key,value);
        }else if (function == 3){
            obj.remove(key);
        }

        return obj;
    }
    public static JSONArray deletePs(JSONArray jsonArray,JSONObject obj1){

        for(int i = 1; i < (jsonArray.size());i++){
            if(jsonArray.getJSONObject(i).equals(obj1)){
                jsonArray.remove(obj1);
                System.out.println(jsonArray);
                return jsonArray;
            }
        }
        return null;
    }

}
