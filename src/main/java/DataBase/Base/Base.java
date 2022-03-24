package DataBase.Base;

import Config.Config;
import Passenger.Passenger;
import Tools.Utilities;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 实现对JavaArray的增啥读写
 * */
public class Base {

    //读的时候创建空对象
    public Base(){}

    //TODO Iteration Later
    /**
     * 读取全部的JSONArray
     * */
    private JSONArray readFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
            return JSON.parseArray(reader.readLine());
        } catch (IOException e) {
            System.out.println(filePath + "Error" + e);
        } /*finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(filePath + "Error" + e);
                }
            }//later iteration
        }*/
        return null;
    }

    /**
     * 复写JSONArray
     * */
    private void writeFile(String filePath, JSONArray array) throws IOException {
        String jsonString=array.toJSONString();

        // Creat a file
        File file = new File(filePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        // Write
        Writer write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        write.write(jsonString);
        write.flush();
        write.close();
    }

    private <T, K> T searchObject(String filePath, String key, K value, Class<T> tClass, boolean isDelete) {
        JSONArray array = readFile(filePath);
        for (int i = 0; i < (array.size()); i++) {
            JSONObject ob = (JSONObject) array.get(i);
            if (ob.containsValue(value)) {
                if (isDelete) {
                    array.remove(ob);
                    return ob.toJavaObject(tClass);
                } else
                    return ob.toJavaObject(tClass);
            }
        }
        return null;
    }

    //TODO 添加前要检查是否已经存在有一样的，如果有一样时，是再存一个新的还是不存新的了
    /**
     * 向指定的文档路径中增加传入的JSONObject, 对应 Add 方法
     * */
    public void addObject(String filePath, JSONObject jsonObject){
        JSONArray jsonArray = readFile(filePath);
        jsonArray.add(jsonObject);
        try {
            writeFile(filePath, jsonArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从指定的文档路径中删除对应的JSONObject, 对应 Remove 方法 <br/>
     * 删除成功返回选择删除的Object，删除不成功返回null
     * */
    public<T,K> T removeObject(String filePath, String key, K value, Class<T> tClass) {
        return searchObject(filePath, key, value, tClass, true);
    }

    /**
     * 从指定的文档路径中查找包含对应key-value对的JSONObject, 对应 Get 方法
     * */
    public<T, K> T getObject(String filePath, String key, K value, Class<T> tClass) {
        return searchObject(filePath, key, value, tClass, false);
    }


}
