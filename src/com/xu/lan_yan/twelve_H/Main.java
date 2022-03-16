package com.xu.lan_yan.twelve_H;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[][] nums = new long[2000][2000];
		for(int i = 0; i < 2000; i++) {
			for(int j = 0; j < 2000; j++) {
				nums[i][j] = 0;
			}
		}
		// 杨辉三角形赋值
		for(int i = 0; i < 2000; i++)
	    {
		    for(int j = 0; j <= i; j++)
		    {
			    if(j < 1) {
			    	nums[i][j]=1;
				}
			    else if(i==0)break;
			    else
			    {
			    	nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
			    }
		    }
	    }
		int t = input.nextInt();
		for(int index = 0; index < t; index++) {
			int flag = 0;
			int n = input.nextInt();
			int result = 0;
			for(int i = 0; i < 2000; i++) {
				for(int j = 0; j <= i; j++) {
					result++;
					if(nums[i][j] == n) {
						System.out.println(result);
						flag=1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
		}
	}
}
