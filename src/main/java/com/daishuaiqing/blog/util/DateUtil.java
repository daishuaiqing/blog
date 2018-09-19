package com.daishuaiqing.blog.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间日期处理工具类
 * @ClassName: DateUtil 
 * @author 代帅卿
 * @Description: TODO
 * @date 2017年8月27日 下午4:34:06
 */
public class DateUtil {

	/**
	 * 精确到秒的时间戳
	 * @return
	 */
	public static Integer getUnixMillis(){
		Long millis = System.currentTimeMillis() / 1000;
		return millis.intValue();
	}

}
