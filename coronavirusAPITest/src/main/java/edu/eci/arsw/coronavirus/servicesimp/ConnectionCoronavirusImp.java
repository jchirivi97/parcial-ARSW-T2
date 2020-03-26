package edu.eci.arsw.coronavirus.servicesimp;

import java.io.IOException;

import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.ConnectionCoronavirus;

@Service("ConnectionCoronavirus")
public class ConnectionCoronavirusImp implements ConnectionCoronavirus {

	@Override
	public String getAllCases() throws IOException {
		String USER_AGENT = "Mozilla/5.0";
		String GET_URL =  "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats";
		URL url = new URL(GET)
		return null;
	}

	@Override
	public String getByCountry(String country) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaseByCountry(String country) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
