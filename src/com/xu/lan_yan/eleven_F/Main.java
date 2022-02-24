package com.xu.lan_yan.eleven_F;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count = input.nextInt();
		int jige = 0;
		int youxiu = 0;
		for(int i = 0; i < count; i++) {
			int score = input.nextInt();
			if (score >= 60) {
				jige++;
			}
			if (score >= 85) {
				youxiu++;
			}
		}
		System.out.println((int)Math.rint(jige / (float)count * 100) + "%");
		System.out.println((int)Math.rint((youxiu / (float)count * 100)) + "%");
	}
}
