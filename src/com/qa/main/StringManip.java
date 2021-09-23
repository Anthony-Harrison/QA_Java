package com.qa.main;

public class StringManip {
	public void countWords(String word) {
		int wCount = 1;
		for(int i = 0; i < word.length(); i++) {
			
		if(word.substring(i,i+1).equals(" ")) {
				wCount++;
			}
			else {
				continue;
			}
		}
		System.out.println("Words = " + wCount);
	}
}
