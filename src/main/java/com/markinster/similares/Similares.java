package com.markinster.similares;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.markinster.similares.service.FakeApi;

public class Similares {

	public static void main(String[] args) {
		FakeApi api = new FakeApi();

		List<String> basicas = new ArrayList<>();
		for (String cor : api.getCoresBasicas()) {
			if (cor.toLowerCase().contains("amarelo"))
				basicas.add(cor);
		}

		List<String> coresSimilares = basicas.stream()
				.map(i -> api.getCoresSimilares(i))
				.filter(l -> l != null)
				.flatMap(j -> j.stream()).collect(Collectors.toList());

		System.out.println(coresSimilares.toString());

	}
}
