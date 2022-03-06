package com.xu.lan_C.nine_A;

public class Main {
	public static void main(String[] args) {
		int add = 1;
		int count = 0;
		for(int i = 1; i < 100; i ++) {
			count += add;
			add += 2;
			if (count >= 108) {
				System.out.println(i);
				return;
			}
		}
	}
}
