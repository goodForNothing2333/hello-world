package com.haha.shuzu;

public class Recursion {
	public static void main(String[] args) {
		int result;
		result = functionxs(10);
		System.out.println(result);
	}
	public static int functionxs(int n) { 
		if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 4;
		}
		else{
			return 2 * functionxs(n - 1) + functionxs(n - 2);
		}
	}
}
