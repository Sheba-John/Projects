package com.java.listClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.linkedList.ContactsLog;


public class LinkedList {
	public static void main (String[] args) {
		ContactsLog log1 = new ContactsLog("Sheba","8224849403","Sheba.97sdl@gmail.com","Sheba29","Sheba2995");
		ContactsLog log2 = new ContactsLog("Grace","2992892999","Grace002@gmail.com","Grace800","Grace566");
		ContactsLog log3 = new ContactsLog("Joy","9087654324","joy@gmail.com","joy77","joy4555");
		ContactsLog log4 = new ContactsLog("Aniket","6778889890","Aniket@gmail.com","Aniket456","Aniket256");
		ContactsLog log5 = new ContactsLog("sanket","5678908765","sanket_john@gmail.com","sanket123","sanket456");
		ContactsLog log6 = new ContactsLog("vanushree","1234567890","vanu@gmail.com","vanu789","vanu566");

		LinkedList<ContactsLog> linkedList = new LinkedList<>();
		linkedList.add(log1);
		linkedList.add(log2);
		linkedList.add(log3);
		linkedList.add(log4);
		linkedList.add(log5);
		linkedList.add(log6);
		Iterator<ContactsLog> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			ContactsLog theLog = iterator.next();
			System.out.println("the Log : "+theLog);
		}
		System.out.println("-----------------");
		for (ContactsLog phoneLog : linkedList) {
			System.out.println("the Log : "+phoneLog);
		}

		 
	}

}
