package com.java8.test;

public class ExceptionEx {
	
	public static void main(String[] args) {
		
		try {
		throw new TestException("This is only Test Exception");
	}catch(TestException t) {
		
		System.out.println(t.getMessage());
		
	}
	}

}
