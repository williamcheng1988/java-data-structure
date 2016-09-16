package com.data.structure.最大公约数;

public class Gcd {
	
	public static void main(String[] args) {
		//求 3 个数的最大公约数
//		int a = 12, b = 18, c = 24;
//		System.out.println("gcd("+a+","+b+","+c+")="+gcd(gcd(a, b),c));
		
//		System.out.println(gcd(2460, 12375));
		
		
		//求：n个整数的最大公约数
		int n = (int)(Math.random()*10);
		System.out.println("n:"+n);
		if(n==0){
			return;
		}
		int[] values = random(n);
		int result = values[0];
		for (int i = 1; i < values.length; i++) {
			result = gcd(result, values[i]);
		}
		System.out.println(result);
	}
	
	public static int[] random(int n){
		int value[] = new int[n];
		for (int i = 0; i < value.length; i++) {
			value[i] = (int)(Math.random()*100);
		}
		return value;
	}
	
	public static int gcd(int a, int b){
		System.out.println("---------------a="+a+",b="+b);
		while(b!=0){
			int temp = a%b;
			a = b;
			b = temp;
			System.out.println("temp="+temp+",a="+a+",b="+b);
		}
		return a;
	}
}
