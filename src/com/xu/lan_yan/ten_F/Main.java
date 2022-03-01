package com.xu.lan_yan.ten_F;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] fb = new int[20];
		fb[0] = 0;
		fb[1] = 1;
		for(int i = 2; i <= 19; i++) {
			fb[i] = fb[i - 1] + fb [i - 2];
		}
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		if (N < 20) {
			double tempResult =  fb[N] * 1.0 / fb[N + 1];
			String result = String.format("%.8f", tempResult);
			System.out.println(result);
		} else {
			System.out.println("0.61803399");
		}
		
	}
}