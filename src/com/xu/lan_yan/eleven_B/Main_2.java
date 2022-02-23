package com.xu.lan_yan.eleven_B;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_2 {
	public static void main(String[] args) throws ParseException {
		// 一天的毫秒数
		long oneDay = 1000 * 60 * 60 * 24;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 开始时间的毫秒数
		long start = sdf.parse("2000-01-01 00:00:00").getTime();
		// 结束时间的毫秒数
		long end = sdf.parse("2020-10-01 00:00:00").getTime();
		
		int result = 0;
		while(start <= end) {
			System.out.println(new Date(start).toString());
			if(new Date(start).toString().contains("Mon") || new Date(start).toString().contains(" 01 ")) {
				result += 2;
			}else {
				result++;
			}
			start = new Date(start).getTime() + oneDay;
		}
		System.out.println(result);
	}
}
