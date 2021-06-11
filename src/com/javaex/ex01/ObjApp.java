package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		Object o04 = new Object();

		// getClass()-->클래스 정보
		System.out.println("obj.getClass()=================");
		System.out.println(o01.getClass());
		System.out.println("===============================\n");
		
		// hashCode()-->주소값( 주소에 대응되는 중복되지 않는 값 )
		System.out.println("obj.hashCode()=================");
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		System.out.println(o04.hashCode());
		System.out.println("===============================\n");
		
		// toString()-->객체의 값 정보
		System.out.println("obj.toString()=================");
		System.out.println(o01.toString());
		System.out.println("===============================\n");
		
		// toString()-->객체가 같은지 비교
		System.out.println("obj.equals()=================");
		System.out.println(o01.equals(o01));
		System.out.println(o01.equals(o02));
		System.out.println("===============================\n");

	}

}
