package com.markinster.asyncjava8.service;

import java.util.ArrayList;
import java.util.List;

public class FakeApi {
	
	private int temp1 = 500;
	private int temp2 = 200;
	
	public List<String> service1() {
		System.out.println("[ service 1 ] Started");	
		ArrayList<String> list = new ArrayList<String>();
		list.add("São Paulo");
		list.add("Rio de Janeiro");
		list.add("Belo Horizonte");
		list.add("Brasilia");
		list.add("Florianopolis");
		list.add("Campinas");
		list.add("Fortaleza");
		list.add("Maceio");
		
		String x = "";
		for(int i = 0; i < temp1; i++)
			for(int j = 0; j < temp2; j++)
					x = x + ".";

		System.out.println("[ service 1 ] Finished");
		return list;
	}
	
	public List<String> service2() {
		System.out.println("[ service 2 ] Started");	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Minas Gerais");
		list.add("Rio de Janeiro");
		list.add("São Paulo");
		list.add("Goiás");
		list.add("Fortaleza");
		list.add("Santa Catarina");
		list.add("Alagoas");
		list.add("Ceará");
		
		String x = "";
		for(int i = 0; i < temp1; i++)
			for(int j = 0; j < temp2; j++)
					x = x + ".";

		System.out.println("[ service 2 ] Finished");
		return list;
	}
	
	public List<String> service3() {
		System.out.println("[ service 3 ] Started");	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sudeste");
		list.add("Centro-Oeste");
		list.add("Nordeste");
		list.add("Norte");
		list.add("Sul");
		
		String x = "";
		for(int i = 0; i < temp1; i++)
			for(int j = 0; j < temp2; j++)
					x = x + ".";
		
		System.out.println("[ service 3 ] Finished");	
		return list;
	}

}
