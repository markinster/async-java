package com.markinster.asyncjava8;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.markinster.asyncjava8.service.FakeApi;
import com.sun.jmx.snmp.Timestamp;

public class AsyncJava8 {

	private static FakeApi api;

	public static void main(String[] args) {
		
		
		api = new FakeApi();
		long ti = new Timestamp().getDateTime();

		ExecutorService ex = Executors.newFixedThreadPool(3);

		CompletableFuture<List<String>> serviceFuture1 = CompletableFuture.supplyAsync(() -> {
			List<String> list = api.service1();
			return list;
		}, ex);

		CompletableFuture<List<String>> serviceFuture2 = CompletableFuture.supplyAsync(() -> {
			List<String> list = api.service2();
			return list;
		}, ex);

		CompletableFuture<List<String>> serviceFuture3 = CompletableFuture.supplyAsync(() -> {
			List<String> list = api.service3();
			return list;
		}, ex);
		
		
		CompletableFuture<Void> all = CompletableFuture.allOf(serviceFuture1, serviceFuture2, serviceFuture3);
		try {
			all.get(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
			return;
		} 
		
		try {
			System.out.println("########");	
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
