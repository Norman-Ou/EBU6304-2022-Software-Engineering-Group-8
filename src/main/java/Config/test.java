package Config;

import Tools.Utils;
import jdk.jshell.execution.Util;
import org.apache.log4j.lf5.util.ResourceUtils;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        String path = Utils.getRsrFile("flight_data_v6.json");
        System.out.println(path);
    }
}
