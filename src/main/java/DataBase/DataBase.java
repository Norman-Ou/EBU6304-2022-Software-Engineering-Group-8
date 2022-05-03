package DataBase;

import Exceptions.DataNotFound;
import Tools.JSONComparator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * <b>Database class<b/> <br><br/>
 *
 * The method with Access Modifier <b>Private<b/> is the <b>root method<b/> for the database <br><br/>
 * The method with Access Modifier <b>Protected<b/> is the <b>Interface<b/> for the Passenger Database class and Beans.Flight Database<br><br/>
 *
 * @author Jiayi Wang
 * @version 0.1 March 22th, 2022
 *
 * @author Ruizhe Ou
 * @version 1.0 March 24th, 2022
 *
 * @author Ruizhe Ou
 * @version 1.1 April 24th, 2022
 */
public class DataBase {

    private final String filePath;

    protected DataBase(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Transfer a JavaBean Object into a JSONObject
     *
     * @param bean the javabean object that will be transfer to JSONObjcet
     * @return JSONObject
     * */
    private JSONObject beanToJSON(Object bean) {
        return (JSONObject) JSON.toJSON(bean);
    }


    /**
     * Reading all the data in json file with parameter filePath
     *
     * @return JSONArray containing all the data in JSON file
     * @throws IOException read failed
     * */
    private JSONArray readFile() throws IOException{
        File file = new File(this.filePath);
        if (!file.exists()) {
            if (file.createNewFile()){
                System.out.println("Initialization File Successfully");
            } else {
                System.out.println("Initialization File Failed");
            }
            writeFile(new JSONArray());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        return JSON.parseArray(reader.readLine());
    }

    /**
     * Overwrite json File
     *
     * @param array The data that will be wrote into JSON File
     * @throws IOException Open file failed.
     * */
    private void writeFile(JSONArray array) throws IOException{
        String jsonString=array.toJSONString();

        // Creat a file
        File file = new File(filePath);
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

    //TODO 添加前要检查是否已经存在有一样的，如果有一样时，是再存一个新的还是不存新的了
    /**
     * <b>Interface<b/> <br><br/>
     * Adding a java object to JSON file
     *
     * @param object The adding obnect
     * */
    protected<T> void addObject(T object) throws IOException{
        JSONObject jsonObject = beanToJSON(object);
        JSONArray jsonArray = readFile();

        try {
            searchObject(jsonObject, object.getClass(), false);
        } catch (DataNotFound dataNotFound) {
            jsonArray.add(jsonObject);
        }

        writeFile(jsonArray);
    }

    /**
     * Get a Java Object in the file according the attribute name and the attribute's value of it.
     *
     * @param key attribute name of the Java Object
     * @param value attribute's value of the Java Object
     * @param tClass The class of the Java Object
     * @param isDelete Determine whether Delete the searching JSONObject or not.
     *
     * @return a Java Object with attribute name and the attribute's value same with arguments
     * */
    private <T, K> T searchObject(String key, K value, Class<T> tClass, boolean isDelete) throws DataNotFound {
        try {
            JSONArray array = readFile();
            for (int i = 0; i < (array.size()); i++) {
                JSONObject ob = (JSONObject) array.get(i);
                if (ob.get(key).equals(value.toString())){
                    if (isDelete) {
                        array.remove(ob);
                        writeFile(array);
                    }
                    return ob.toJavaObject(tClass);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        throw new DataNotFound("DataNotFound");
    }

    /**
     * Get a Java Object in JSON file.
     *
     * @param jsonObject the Java Object you want
     * @param tClass The class of the Java Object
     * @param isDelete Determine whether Delete the searching JSONObject or not.
     *
     * @return a Java Object same as the argument one
     * */
    private <T> T searchObject(JSONObject jsonObject, Class<T> tClass, boolean isDelete) throws DataNotFound {
        try {
            JSONArray array = readFile();
            for (int i = 0; i < array.size(); i++) {
                JSONObject ob = (JSONObject) array.get(i);
                if (new JSONComparator().compareJsonObject(JSON.toJSONString(ob), JSON.toJSONString(jsonObject)).equals("{}")){
                    if (isDelete){
                        array.remove(ob);
                        writeFile(array);
                        return ob.toJavaObject(tClass);
                    }
                    return ob.toJavaObject(tClass);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new DataNotFound("DataNotFound");
    }



    /**
     * <b>Interface<b/> <br><br/>
     * Removing a java object in JSON file according the attribute name and the attribute's value of it.
     *
     *@param key attribute name of the Java Object
     *@param value attribute's value of the Java Object
     * */
    protected <T,K> T removeObject(String key, K value, Class<T> tClass) throws IOException, DataNotFound {
        return searchObject(key, value, tClass, true);
    }

    /**
     * <b>Interface<b/> <br><br/>
     * Removing a certain java object in JSON file
     *
     *@param object the certain Java Object
     *@param tClass Class of the Java Object
     * */
    protected <T> T removeObject(T object, Class<T> tClass) throws IOException, DataNotFound {
        return searchObject(beanToJSON(object), tClass, true);
    }

    /**
     * <b>Interface<b/> <br><br/>
     * Get a Java Object in the file according the attribute name and the attribute's value of it.
     *
     * @param key attribute name of the Java Object
     * @param value attribute's value of the Java Object
     * @param tClass The class of the Java Object
     *
     * @return a Java Object with attribute name and the attribute's value same with arguments
     * */
    protected <T, K> T getObject(String key, K value, Class<T> tClass) throws IOException, DataNotFound {
        return searchObject(key, value, tClass, false);
    }

    protected <T, K> ArrayList<T> getObjects(String key, K value, Class<T> tClass) throws DataNotFound{
        ArrayList<T> arrayList = new ArrayList<>();
        try {
            JSONArray array = readFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (arrayList.isEmpty()){
            throw new DataNotFound("Query Data base with Key:" + key + " Value:"+ value + "--DataNotFound");
        } else {
            return arrayList;
        }
    }

    /**
     * <b>Interface<b/> <br><br/>
     * Get a Java Object in JSON file.
     *
     * @param jsonObject the Java Object you want
     * @param tClass The class of the Java Object
     *
     * @return a Java Object same as the argument one
     * */
    protected <T> T getObject(JSONObject jsonObject, Class<T> tClass) throws DataNotFound {
        return searchObject(jsonObject, tClass, false);
    }

    /**
     * <b>Interface<b/> <br><br/>
     * Get all the JSON data in JSON file in the database
     *
     * @return a JSONArray containing all the data in database
     * */
    protected JSONArray getAllObject() throws IOException{
        return readFile();
    }

    protected void replaceAllData(JSONArray jsonArray) throws IOException {
        writeFile(jsonArray);
    }

}
