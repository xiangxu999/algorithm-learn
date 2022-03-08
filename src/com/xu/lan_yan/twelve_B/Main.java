package com.xu.lan_yan.twelve_B;

public class Main {
	public static void main(String[] args) {
		for(long i = 1; i <= 1000000007; i++) {
			if(i * 2021 % 1000000007 == 999999999) {
				System.out.print(i);
				return;
			}
		}
	}
}
