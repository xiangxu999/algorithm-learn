package com.xu.lan_yan.eleven_I;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] a = new String[10000];
		int k = 0;
		// 最后结果
		int result = 0;
		// 求所有的字串
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				a[k] = str.substring(i, j);
				k++;
			}
		}
		for(int i = 0; i < k; i++) {
			// 每次循环初始化一个hashset,因为set不允许重复的，每一个set用于记录一个字串
			Set<String> set = new HashSet<>();
			for(int j = 0; j < a[i].length(); j++) {
				set.add(a[i].charAt(j) + "");
			}
			result = result + set.size();
		}
		System.out.println(result);
	}
}
