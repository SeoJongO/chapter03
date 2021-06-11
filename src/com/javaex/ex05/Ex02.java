package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");

		// 문자열 붙이기
		a = a.concat(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------------------");

		// 공백 제거
		a = a.trim();
		System.out.println(a);
		System.out.println("------------------------");

		// 문자열 교체
		a = a.replace("abcd", "1234");
		System.out.println(a);
		System.out.println("------------------------");

		// 문자열 나누기
		String[] sArray = a.split(",");
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println("------------------------");
		
		// 해당 위치 문자 반환
		String str = "Hello java!";
		System.out.println(str.charAt(0));
		System.out.println("------------------------");
		
		// 시작 위치 정하기 ( start, end )
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
		

	}

}
