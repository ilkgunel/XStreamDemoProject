package com.ilkaygunel.pojo;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	private List<Person> list;

	public PersonList() {
		list = new ArrayList<Person>();
	}

	public void addPerson(Person p) {
		list.add(p);
	}
}
