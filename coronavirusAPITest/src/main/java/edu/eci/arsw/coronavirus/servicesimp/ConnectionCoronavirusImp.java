package edu.eci.arsw.coronavirus.servicesimp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.ConnectionCoronavirus;

@Service("ConnectionCoronavirus")
public class ConnectionCoronavirusImp implements ConnectionCoronavirus {

	@Override
	public String getAllCases() throws IOException {
		String user = "Mozilla/5.0";
		String getUrl =  "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats";
		URL url = new URL(getUrl);
		
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");
		conexion.setRequestProperty("x-rapidapi-host",  "covid-19-coronavirus-statistics.p.rapidapi.com");
		conexion.setRequestProperty("x-rapidapi-key", "8de415383amsh00a0362cf475a3fp1406c8jsnd8bb52da6313");
		
		int rep = conexion.getResponseCode();
		
		if (rep == HttpURLConnection.HTTP_OK) {
			BufferedReader input = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String line;
			StringBuffer resp = new StringBuffer();
			while((line = input.readLine()) != null) {
				resp.append(line);
			}
			input.close();
			
			return resp.toString();
		}
		else {
			return "La respuesta no es suficiente";	
		}	
		
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
