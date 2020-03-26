package edu.eci.arsw.coronavirus.services;

import java.io.IOException;

public interface ServiceCoronavirus {
	String getAllCases( ) throws IOException;
	String getByCountry(String country) throws IOException;
	String getCasesCountry(String country) throws IOException;

}
