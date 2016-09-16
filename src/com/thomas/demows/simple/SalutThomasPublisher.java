package com.thomas.demows.simple;

import javax.xml.ws.Endpoint;

public class SalutThomasPublisher {
	
	public static final String URI = "http://localhost:8888/salut";
	
	public static void main (String[] args){
		//Crée une instance de l'implémentation
		SalutThomasWS inst = new SalutThomasWS();
		
		//Rend dispo l'instance
		Endpoint endpoint = Endpoint.publish(URI, inst);
		
		//Teste la disponibilité de l'endpoint
		boolean status =endpoint.isPublished();
		System.out.println("WebService dispo ? "+status);
	}

}
