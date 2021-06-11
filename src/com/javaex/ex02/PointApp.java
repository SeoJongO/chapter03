package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p03 = p00;
		
		
		System.out.println("obj.getClass()=================");
		System.out.println("p00="+p00.getClass());
		System.out.println("p01="+p01.getClass());
		System.out.println("p02="+p02.getClass());
		System.out.println("p03="+p03.getClass());
		System.out.println("===============================\n");
		
		System.out.println("obj.hashCode()=================");
		System.out.println("p00="+p00.hashCode());
		System.out.println("p01="+p01.hashCode());
		System.out.println("p02="+p02.hashCode());
		System.out.println("p03="+p03.hashCode());
		System.out.println("===============================\n");
		
		System.out.println("obj.toString()=================");
		System.out.println("p00="+p00.toString());
		System.out.println("p01="+p01.toString());
		System.out.println("p02="+p02.toString());
		System.out.println("p03="+p03.toString());
		System.out.println("===============================\n");
		
		System.out.println("obj.equals()=================");
		System.out.println("p00=p01? >"+p00.equals(p01)); // 로직
		System.out.println(p00==p01); // 주소 값 비교
		System.out.println("p01=p02? >"+p01.equals(p02));
		System.out.println(p01==p02);
		System.out.println("p02=p03? >"+p02.equals(p03));
		System.out.println(p02==p03);
		System.out.println("p03=p00? >"+p03.equals(p00));
		System.out.println(p03==p00);
		System.out.println("===============================\n");
		
	}

}
