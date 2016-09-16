package com.thomas.demows.simple;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface SalutThomas {
	@WebResult(partName = "response")
	public String ditBonjour(@WebParam String prenom);

}
