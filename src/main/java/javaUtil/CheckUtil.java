package javaUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckUtil {
	/**
	 * 判断日期字符串格式是否正确
	 * @param strDate 日期字符串
	 * @param dateFormat 日期格式
	 * @return true:日期字符串格式正确  false:日期字符串格式错误
	 */
	public static boolean isDate(String strDate,String dateFormat) {
    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
    	simpleDateFormat.setLenient(false);
    	try {
            simpleDateFormat.parse(strDate);
        } catch(ParseException px) {
            return false;
        }
    	return true;
    }
}
