package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		
		Integer result01 = i01 + i02;
		Integer result02 = new Integer(10) + new Integer(7);
		
		System.out.println(result01);
		System.out.println(result02);
		
		int i10 = 7;
		i01.intValue();
		
		
		Integer i11 = 10;
		
		Integer i100 = 15;
		int i101 = i100;
		System.out.println(i101);
		
		System.out.println("=====문자열-->정수========================");
		
		Integer i999 = 999;
		int num = i999.parseInt("12345");
		System.out.println(num);
		
		int num1 = Integer.parseInt("12345");
		System.out.println(num1);
		
		System.out.println("=====정수-->문자열========================");
		
		String str = "hi";
		String strResult1 = str.valueOf(123456);
		System.out.println(strResult1);
		
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);
		
		String strResult3 = ""+9876;
		System.out.println(strResult3);
		
		String yn = "y";
		yn=null;
		
//		if(yn.equals("y")) {
//			System.out.println("게임다시시작");
//		}
		
		if("y".equals(yn)) {
			System.out.println("게임다시시작");
		} else {
			System.out.println("게임종료");
		}
		
		Byte b = (byte)1;
		new Byte ((byte)1);
		Short s = (byte)1;
		
	}

}
