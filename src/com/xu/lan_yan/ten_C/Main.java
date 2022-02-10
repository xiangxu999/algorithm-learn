package com.xu.lan_yan.ten_C;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; ; i ++) {
			if (check(i)) {
				count++;
				if (count == 2019) {
					System.out.print(i);
					return;
				}
			}
		}
	}
	
	public static boolean check(double number) {
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				return false;
		return true;
	}

}
