package com.abhi.string;

public class StringSplitDemo {
	
	public static void main(String[] args) {
		
		String str = " I am working in it sector";
		String[] s = str.split(" ");
		
		for(String s1: s) {
			System.out.println(s1);
		}
		
		
	}

}
