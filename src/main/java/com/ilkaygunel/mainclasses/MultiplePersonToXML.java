package com.ilkaygunel.mainclasses;

import com.ilkaygunel.pojo.Address;
import com.ilkaygunel.pojo.Person;
import com.ilkaygunel.pojo.PersonList;
import com.thoughtworks.xstream.XStream;

public class MultiplePersonToXML {
	public static void main(String[] args) {
		
		XStream xStream = new XStream();
		xStream.alias("person", Person.class);
		xStream.alias("address", Address.class);
		xStream.alias("personList", PersonList.class);
		xStream.addImplicitCollection(PersonList.class, "list");
		
		PersonList list = new PersonList();
		list.addPerson(new Person("Michael" , "Schumacher", new Address("Hürth-Hermülheim", "Germany")));
		list.addPerson(new Person("Mika" , "Hakkinen", new Address("Helsinki", "Finland")));
		list.addPerson(new Person("Fernando" , "Alonso", new Address("Oviedo", "Spain")));
		
		String XMLResult = xStream.toXML(list);
		System.out.println(XMLResult);
	}
}
