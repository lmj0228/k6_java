package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
	}
	
	public static void test1() {
		System.out.println("test1 start");
		test2();
		System.out.println("test1 end");
	}
	
	public static void test2() {
		System.out.println("test2 start");
		try {
			int temp = 10/0;
			String s = new String("java"); 
			int len = s.length(); 
			s = null;
			s.length(); // 	
			int arr[] = new int[3];
			arr[3] = 30; //
			System.out.println("OK");
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		} catch(NullPointerException e2) {
			e2.printStackTrace();
		} catch(Exception e) {
				System.out.println("오류 발생 : " +e);
		}
		  System.out.println("test2 end");
	}
}