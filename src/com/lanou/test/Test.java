package com.lanou.test;

public  class  Test{

		static int a=5,b,c;
		public static void main(String[] args) {
			c=b++;
			System.out.println(a+","+b+","+c);
		}
		static{
			b=a++;
			c++;
		}

}

