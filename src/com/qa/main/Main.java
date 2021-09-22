package com.qa.main;

public class Main {

	public static void main(String[] args) {
		String s1 = "yesterday it was raining";
		String s2 = "today it is sunny";
		
		System.out.println(s2.toUpperCase() + " " + s1.toUpperCase());
		
		String ss1 = s1.substring(16, 24);
		String ss2 = s2.substring(0, 11);
		System.out.println(ss2 + "" + ss1);

	}

}
