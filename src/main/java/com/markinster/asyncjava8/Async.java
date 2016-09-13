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

		ExecutorService ex = Executors.newFixedThreadPool(3);

		Future<List<String>> serviceFuture1 = ex.submit(() -> {
			List<String> list = api.service1();
			return list;
		});

		Future<List<String>> serviceFuture2 = ex.submit(() -> {
			List<String> list = api.service2();
			return list;
		});

		Future<List<String>> serviceFuture3 = ex.submit(() -> {
			List<String> list = api.service3();
			return list;
		});

		
		try {
			
			sendToView(serviceFuture1.get());
			sendToView(serviceFuture2.get());
			sendToView(serviceFuture3.get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		long tf = new Timestamp().getDateTime();

		System.out.println(tf - ti+"ms");
		ex.shutdown();
	}

	
	
	private static void sendToView(List<String> list) {
		
		System.out.println(list.toString());
	}
	
	

}
