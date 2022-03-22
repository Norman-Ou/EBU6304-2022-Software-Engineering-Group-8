package Tools;

import com.alibaba.fastjson.JSONObject;

public interface ToDB {

    String name = null;

    JSONObject readFile();
    void writeFile();
}
