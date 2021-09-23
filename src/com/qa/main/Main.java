package com.qa.main;
import com.qa.person.Person;
import com.qa.person.SearchList;

public class Main {

	public static void main(String[] args) {
		/**String s1 = "yesterday it was raining";
		String s2 = "today it is sunny a a a a ";
		
		System.out.println(s2.toUpperCase() + " " + s1.toUpperCase());
		
		String ss1 = s1.substring(16, 24);
		String ss2 = s2.substring(0, 11);
		System.out.println(ss2 + "" + ss1);
		StringManip test = new StringManip();
		test.countWords(s2);**/
		//Car car1 = new Car(0, null, null, 0);
		//System.out.println();
		Person anth = new Person("Anth", 32, "Student");
		Person bill = new Person("Bill", 25, "Student");
		SearchList sl = new SearchList();
		sl.addPerson(anth);
		sl.addPerson(bill);
		System.out.println("\n=================================================\n");
		SearchList.find("Anth");
		System.out.println("\n=================================================\n");
		SearchList.allPeople();
		
		
	}


}
