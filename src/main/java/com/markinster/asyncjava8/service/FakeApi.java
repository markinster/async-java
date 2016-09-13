package com.markinster.asyncjava8.service;

import java.util.ArrayList;
import java.util.List;

import com.sun.jmx.snmp.Timestamp;

public class FakeApi {
	
	public List<String> service1() {
		System.out.println("[ service 1 ] Started");	
		
		sleep(1500);		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("São Paulo");
		list.add("Rio de Janeiro");
		list.add("Belo Horizonte");
		list.add("Brasilia");
		list.add("Florianopolis");
		list.add("Campinas");
		list.add("Fortaleza");
		list.add("Maceio");
		
		System.out.println("[ service 1 ] Finished");
		return list;
	}
	
	public List<String> service2() {
		System.out.println("[ service 2 ] Started");
		
		sleep(1500);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Minas Gerais");
		list.add("Rio de Janeiro");
		list.add("São Paulo");
		list.add("Goiás");
		list.add("Fortaleza");
		list.add("Santa Catarina");
		list.add("Alagoas");
		list.add("Ceará");		
		

		System.out.println("[ service 2 ] Finished");
		return list;
	}
	
	public List<String> service3() {
		System.out.println("[ service 3 ] Started");
		
		sleep(2000);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sudeste");
		list.add("Centro-Oeste");
		list.add("Nordeste");
		list.add("Norte");
		list.add("Sul");	
	
		
		System.out.println("[ service 3 ] Finished");	
		return list;
	}
	
	private void sleep(long time) {
		long ti = new Timestamp().getDateTime();
		long sl = 0l;
		
		while (sl  < time) {
			long tf = new Timestamp().getDateTime();
			sl = tf - ti;
		}
	}

}
