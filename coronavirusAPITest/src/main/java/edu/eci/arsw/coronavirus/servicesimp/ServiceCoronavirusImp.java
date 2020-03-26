package edu.eci.arsw.coronavirus.servicesimp;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.ConnectionCoronavirus;
import edu.eci.arsw.coronavirus.services.ServiceCoronavirus;

@Service("ServiceCoronavirus")
public class ServiceCoronavirusImp implements ServiceCoronavirus  {

	@Autowired
	ConnectionCoronavirus con;
	
	@Override
	public String getAllCases() throws IOException {
		
		return con.getAllCases() ;
	}

	@Override
	public String getByCountry(String country) throws IOException {
		return con.getByCountry(country);
	}

	@Override
	public String getCasesCountry(String country) throws IOException {
		return con.getCaseByCountry(country);
	}

}
