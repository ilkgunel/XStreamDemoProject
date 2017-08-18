package com.ilkaygunel.mainclasses;

import com.ilkaygunel.pojo.Address;
import com.ilkaygunel.pojo.Person;
import com.thoughtworks.xstream.XStream;

public class SinglePersonToXML {
	public static void main(String[] args) {
		Address address = new Address();
		address.setDistrict("Şişli");
		address.setCity("İstanbul");
		
		Person person = new Person();
		person.setName("İlkay");
		person.setSurname("Günel");
		person.setAddress(address);
		
		XStream xStream = new XStream();
		xStream.alias("person", Person.class);
		xStream.alias("address", Address.class);
		String XMLResult = xStream.toXML(person);
		
		System.out.println(XMLResult);
	}
}
