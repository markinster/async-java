package com.markinster.asyncjava8.service;

import java.util.ArrayList;
import java.util.List;

public class FakeApi {
	
	
	public List<String> service1() {
		System.out.println("servico1 iniciou");	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Marcos");
		list.add("Vinicius");
		list.add("Soares");
		list.add("Rua");
		list.add("Presidente");
		list.add("Keneddy");
		list.add("Edil");
		list.add("System");
		
		String x = "";
		for(int i = 0; i < 500; i++)
			for(int j = 0; j < 100; j++)
					x = x + ".";

		System.out.println("servico1 terminou");
		return list;
	}
	
	public List<String> service2() {
		System.out.println("servico2 iniciou");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("ed");
		list.add("we");
		list.add("rr");
		
		String x = "";
		for(int i = 0; i < 500; i++)
			for(int j = 0; j < 100; j++)
					x = x + ".";

		System.out.println("servico2 terminou");
		return list;
	}
	
	public List<String> service3() {
		System.out.println("servico3 iniciou");
		ArrayList<String> list = new ArrayList<String>();
		list.add("432gfsd");
		list.add("sfdg43");
		list.add("fsd");
		list.add("423");
		list.add("fsd");
		list.add("423");
		list.add("rwe");
		list.add("rew");
		
		String x = "";
		for(int i = 0; i < 500; i++)
			for(int j = 0; j < 100; j++)
					x = x + ".";
		
		System.out.println("servico3 terminou");
		return list;
	}

}
