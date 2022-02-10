package com.xu.lan_yan.ten_B;

public class Main {
	
	public static void main(String [] args) {
//		Long one = (long)('O' - 'A' + 1);
//		Long two = (long)(('A' - 'A' + 1) * Math.pow(26, 1));
//		Long three = (long)(('I' - 'A' + 1) * Math.pow(26, 2));
//		Long four = (long)(('Q' - 'A' + 1) * Math.pow(26, 3));
//		Long five = (long)(('N' - 'A' + 1) * Math.pow(26, 4));
//		Long six = (long)(('A' - 'A' + 1) * Math.pow(26, 5));
//		Long seven = (long)(('L' - 'A' + 1) * Math.pow(26, 6));
//		Long result = (long)(one + two + three + four + five + six + seven);
//		System.out.print(result);
		
		String s = "LANQIAO";
		long result = 0;
		
		for(int i = 0; i < s.length(); i++) {
			result  += (long)((s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - i - 1)); 
		}
		
		System.out.print(result);
		
		
		

	}
}
