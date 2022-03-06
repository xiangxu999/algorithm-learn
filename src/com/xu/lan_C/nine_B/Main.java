package com.xu.lan_C.nine_B;

public class Main {
	public static void main(String[] args) {
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			if(check(i)) {
				System.out.println(i);
				return;
			}
		}
	}
	
	public static Boolean check(int num) {
		if(num % 5 == 0 && num % 5 != 1) {
			return false;
		} else {
			if ((num - 1) % 5 == 0) {
				num = (num - 1) / 5 * 4;
			} else {
				return false;
			}
		}
		if(num % 5 == 0 && num % 5 != 2) {
			return false;
		} else {
			if ((num - 2) % 5 == 0) {
				num = (num - 2) / 5 * 4;
			} else {
				return false;
			}
		}
		if(num % 5 == 0 && num % 5 != 3) {
			return false;
		} else {
			if ((num - 3) % 5 == 0) {
				num = (num - 3) / 5 * 4;
			} else {
				return false;
			}
		}
		if(num % 5 == 0 && num % 5 != 4) {
			return false;
		} else {
			if ((num - 4) % 5 == 0) {
				num = (num - 4) / 5 * 4;
			} else {
				return false;
			}
		}
		if(num >= 5 && num % 5 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
}
