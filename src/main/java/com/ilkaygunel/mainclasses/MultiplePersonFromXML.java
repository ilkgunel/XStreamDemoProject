package com.ilkaygunel.mainclasses;

import java.io.File;

import com.ilkaygunel.pojo.Address;
import com.ilkaygunel.pojo.Person;
import com.ilkaygunel.pojo.PersonList;
import com.thoughtworks.xstream.XStream;

public class MultiplePersonFromXML {
	public static void main(String[] args) {
		XStream xStream = new XStream();
		XStream.setupDefaultSecurity(xStream);
		xStream.alias("person", Person.class);
		xStream.alias("address", Address.class);
		xStream.alias("personList", PersonList.class);
		xStream.addImplicitCollection(PersonList.class, "list");
		Class<?>[] classes = new Class[] { Person.class, Address.class, PersonList.class };
		xStream.allowTypes(classes);
		try {
			File xmlFile = new File("/Users/ilkaygunel/Desktop/person1.xml");
			PersonList personList = (PersonList) xStream.fromXML(xmlFile);
			for (Person p : personList.getList()) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
