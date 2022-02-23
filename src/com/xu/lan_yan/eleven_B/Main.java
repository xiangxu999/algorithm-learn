package com.xu.lan_yan.eleven_B;

public class Main {
	public static void main(String[] args) {
		int[] M = {31,28,31,30,31,30,31,31,30,31,30,31};
		// 初始化年份、月、一个月的第几天、第几星期、和跑步距离
		int year = 2000, mouth = 1, day = 1, week = 6, result = 2;
		while(year != 2020 || mouth != 10 || day != 1) {
			// 闰年判断条件
			if((year%4==0&&year%100!=0)||year%400==0) {
				M[1] = 29;
			} else {
				M[1] = 28;
			}
			// 天数增加
			day++;
			// 星期增加
			week = (week + 1) % 7;
			// 一个月过去了
			if(day > M[mouth - 1]) {
				day = 1;
				mouth++;
				// 一年过去了
				if(mouth > 12) {
					mouth = 1;
					year++;
				}
			}
			if(day == 1 || week == 1) {
				result++;
			}
			result++;
		}
		System.out.println(result);
	}
}
