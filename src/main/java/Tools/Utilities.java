package Tools;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


/**
 *
 */
public class Utilities {


    /**
     * @param bean Object bean
     * @return
     */
    //Bean转换为JSON，返回JSONObject
    public static JSONObject Bean2JSON(Object bean){

        JSONObject jsonObject = (JSONObject) JSON.toJSON(bean);
        String beanJ = jsonObject.toString();
        //System.out.println(beanJ);

        return jsonObject;
    }

    /**
     * @param bean Object
     * @return str Object
     */
    //将对象转换成json, return String
    public static String tojson(Object bean) {

        String str = JSON.toJSONString(bean, true);
        //System.out.println(str);

        return str;
    }

    /**
     * 写入文件
     *
     * @param filePath  要存入的文件路径
     * @param list JSONObject的list
     * @throws IOException
     */
    public static void writeLocalJson(String filePath,List<JSONObject> list) throws IOException {

        // Creat a file
        File file = new File(filePath);
        if (!file.getParentFile().exists())
        {
            // Creat parent file if not exists
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            // Delete the file if exists
            file.delete();
        }
        file.createNewFile();

        Object json = JSONObject.toJSON(list);

        // Write
        Writer write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        write.write(json.toString());
        write.flush();
        write.close();
    }


    /**
     * 对某一个value进行修改
     *
     * @param str 要改变的JSONString，这里是某个passenger
     * @param key2Change 要改变的value
     * @param newValue 改变后的value
     * @return jsonString
     */
    public static String update(String str,String key2Change, String newValue) {
        JSONObject json = JSONObject.parseObject(str);
        Set<String> keySet = json.keySet();
        for(String key:keySet) {
            Object obj = json.get(key);
            if(obj instanceof JSONArray) {
                JSONArray arr = (JSONArray)obj;
                for(int i=0;i<arr.size();i++) {
                    String child = update(arr.get(i).toString(),null,null);
                    arr.set(i, JSONObject.parse(child));
                }
                json.put(key, arr);
            }else if(obj instanceof JSONObject){
                JSONObject sub = (JSONObject)obj;
                String substr = update(sub.toJSONString(),null,null);
                json.put(key, JSONObject.parse(substr));
            }else {
                if(key.equals(key2Change)) {
                    json.put(key, newValue);
                    //System.out.println("update...");
                }
            }
        }
        return json.toJSONString();
    }

    /**
     * 通过reference查找
     * print "surName+iDNO"
     *
     * @param array
     * @param searchName 此处设置为surName
     * @param reference  此处设置为iDNo
     */
    public static void searchPs(JSONArray array,String searchName,String reference) {

        for (int i = 0; i < (array.size()); i++)
        {//循环json数组

            JSONObject ob = (JSONObject) array.get(i);//得到json对象
            String str = ob.toJSONString();
            HashMap map = JSON.parseObject(str, HashMap.class);
            for (Object key : map.keySet()) {
                Object bb = searchName;
                if (map.get(key).equals(bb)){
                    String name1= ob.getString(reference);
                    System.out.println(map.get(key)+" "+name1);
                }

            }

        }

    }

}
