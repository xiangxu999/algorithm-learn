package com.xu.lan_yan.eleven_A;

public class Main {
	public static void main(String[] args) {
		System.out.print(cal(78120));
	}
	
	public static int cal(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result++;
			}
		}
		return result;
	}
}
