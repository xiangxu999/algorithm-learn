package com.xu.lan_yan.eleven_D;

public class Main {
	public static void main(String[] args) {
		int i = 1, j = 1, current = 1, add = 1, temp = 0;
		int change = 0;
		while(i != 20 || j != 20) {
			temp = add + 1;
			if (change == 0) {
				j++;
				current++;
				temp--;
			} else if (change == 1) {
				i++;
				current++;
				temp--;
			}
			while(temp != 0) {
				if (i == 20 && j == 20) {
					break;
				}
				if(change == 0) {
					i++;
					j--;
					current++;
				} else if (change == 1) {
					i--;
					j++;
					current++;
				}
				temp--;
			}
			if(change == 0) {
				change = 1;
			} else if (change == 1) {
				change = 0;
			}
			add++;
		}
		System.out.println(current);
	} 
}
