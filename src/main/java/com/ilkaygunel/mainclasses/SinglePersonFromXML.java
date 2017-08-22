package com.ilkaygunel.mainclasses;

import java.io.File;

import com.ilkaygunel.pojo.Address;
import com.ilkaygunel.pojo.Person;
import com.thoughtworks.xstream.XStream;

public class SinglePersonFromXML {
	public static void main(String[] args) {
		XStream xStream = new XStream();
		//XStream.setupDefaultSecurity(xStream);
		xStream.alias("person", Person.class);
		xStream.alias("address", Address.class);
		//Class<?>[] classes = new Class[] { Person.class, Address.class };
		//xStream.allowTypes(classes);

		try {
			File xmlFile = new File("/Users/ilkaygunel/Desktop/person1.xml");
			Person person = (Person) xStream.fromXML(xmlFile);
			System.out.println(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
