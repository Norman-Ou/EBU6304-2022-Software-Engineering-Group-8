package BackEnd.Monitor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WYTest {

	public static void main(String[] args) {
    	// 获取当前时间
    	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        String currentTime = sdf.format(System.currentTimeMillis());
        Date current;
		try {
			current = sdf.parse(currentTime);
			Date target = sdf.parse("04-05-2022 23:37:11");
			long between = target.getTime() - current.getTime();
			long day = between / (24 * 60 * 60 * 1000);
			long hour = (between / (60 * 60 * 1000) - day * 24);
			long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
			long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			System.out.println(day + "天" + hour + "小时" + min + "分" + s + "秒");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
