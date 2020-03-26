package edu.escuelaing.arsw.coronavirus.services;

import java.io.IOException;

public interface ConnectionCoronavirus {

	
	String getAllCases() throws IOException;
	String getByCountry(String country)  throws IOException;
	String getCaseByCountry(String country) throws  IOException;
}
