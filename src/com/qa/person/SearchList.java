package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class SearchList {

	public SearchList() {

	}

	static List<Person> personList = new ArrayList<>();

	public void addPerson(Person person) {
		personList.add(person);
	}

	public static void find(String name) {
		for (int i = 0; i < getPersonList().size(); i++) {
			Object person = getPersonList().get(i);

			if (person.toString().contains(name)) {
				System.out.println(person.toString());
			}
		}
	}

	public static void allPeople() {
		for (int i = 0; i < getPersonList().size(); i++) {
			System.out.println(getPersonList().get(i));
		}
	}

	public static List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		SearchList.personList = personList;
	}

}
