package com.markinster.asyncjava8;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.markinster.asyncjava8.service.FakeApi;
import com.sun.jmx.snmp.Timestamp;

public class Async {
	
	private static FakeApi api;

	public static void main(String[] args) {
		api = new FakeApi();
		 long ti = new Timestamp().getDateTime();
		
		
		ExecutorService ex = Executors.newFixedThreadPool(3); //10 Threds fixas
		
		Future<List<String>> servico1 = ex.submit(() -> {
			List<String> retorno = api.service1();
			return retorno;
		});
		
		Future<List<String>> servico2 = ex.submit(() -> {
			List<String> retorno = api.service2();
			return retorno;
		});		
		
		Future<List<String>> servico3 = ex.submit(() -> {
			List<String> retorno = api.service3();
			return retorno;
		});
		
		try {
			System.out.println(servico1.get().toString());
			System.out.println(servico2.get().toString());
			System.out.println(servico3.get().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		long tf = new Timestamp().getDateTime();
		
		System.out.println(tf - ti);
		ex.shutdown();
	}

}
