package com.markinster.similares.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FakeApi {
	
	private String[][] coresSimilares = new String[5][3];
	private List<String> coresBasicas;
	
	public static final int AZUL = 0;
	public static final int VERDE = 1;
	public static final int AMARELO = 2;
	public static final int VERMELHO = 3;

	
	public FakeApi() {
		coresBasicas = new ArrayList<String>();
		coresBasicas.add("azul"); //0
		coresBasicas.add("verde");//1
		coresBasicas.add("amarelo");//2
		coresBasicas.add("vermelho");//3
		coresBasicas.add("preto");//4
		
		coresSimilares[AZUL][0] = "cyan";
		coresSimilares[AZUL][1] = "azul claro";
		coresSimilares[AZUL][2] = "azul escuro";
		
		
		coresSimilares[VERDE][0] = "verde claro";
		coresSimilares[VERDE][1] = "verde limão";
		coresSimilares[VERDE][2] = "verde escuro";
		
		
		coresSimilares[AMARELO][0] = "bege";
		coresSimilares[AMARELO][1] = "marron";
		coresSimilares[AMARELO][2] = "laranja";
		
		
		coresSimilares[VERMELHO][0] = "bege";
		coresSimilares[VERMELHO][1] = "marron";
		coresSimilares[VERMELHO][2] = "laranja";
	}
	
	public List<String> getCoresBasicas() {
		return Collections.unmodifiableList(coresBasicas);
	}
	
	public List<String> getCoresSimilares(String cor) {
		return getCoresSimilares(coresBasicas.indexOf(cor));
	}

	public List<String> getCoresSimilares(int cor) {
		
		List<String> retorno = new ArrayList<String>();
		for( String corSimilar : coresSimilares[cor]) {
			retorno.add(corSimilar);
		}
		
		return retorno;
	}
}
