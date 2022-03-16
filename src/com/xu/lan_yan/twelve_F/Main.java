package com.xu.lan_yan.twelve_F;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0; i < t; i++) {
			Long n = input.nextLong();
			Date d = new Date(n);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String pre = sdf.format(d).substring(11, 13);
			String next = sdf.format(d).substring(13);
			String preCur = String.valueOf((Integer.valueOf(pre) + 24 - 8) % 24);
			if((Integer.valueOf(pre) + 24 - 8) % 24 < 10) {
				preCur = '0' + preCur;
			}
			System.out.println(preCur + next);
		
			
		}
	}
}
