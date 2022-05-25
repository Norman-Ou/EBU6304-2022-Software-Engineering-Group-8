package Config;

import org.apache.log4j.lf5.util.ResourceUtils;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        String path = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("passenger_data_v6.json")).getPath();
        System.out.println(path);
    }
}
