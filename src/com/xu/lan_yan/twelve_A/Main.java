package com.xu.lan_yan.twelve_A;

public class Main {
	public static void main(String[] args) {
		int[] have = new int[10];
		for(int i = 0; i < 10; i++) {
			have[i] = 2021;
		}
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			int j = i;
			while(j != 0) {
				int k = j % 10;
				have[k] --;
				if(have[k] <= 0) {
					System.out.print(i);
					return;
				}
				j = j / 10;
			}
		}
	}
}
