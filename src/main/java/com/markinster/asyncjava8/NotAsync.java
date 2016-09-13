package com.markinster.asyncjava8;

import com.markinster.asyncjava8.service.FakeApi;
import com.sun.jmx.snmp.Timestamp;

public class NotAsync {
	
	private static FakeApi api;

	public static void main(String[] args) {
		api = new FakeApi();
		
		long ti = new Timestamp().getDateTime();			 

		System.out.println(api.service1().toString());
		System.out.println(api.service2().toString());
		System.out.println(api.service3().toString());
		
		long tf = new Timestamp().getDateTime();
		
		System.out.println(tf - ti+"ms");

	}

}
