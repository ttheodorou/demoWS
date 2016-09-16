package com.thomas.demows.simple;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "com.thomas.demows.simple.SalutThomas")
@HandlerChain(file = "LogMessageHandler.xml")
public class SalutThomasWS implements SalutThomas {


	public String ditBonjour(String prenom) {
		return "Salut " + prenom + " , met toi à l'aise!";
	}

}
