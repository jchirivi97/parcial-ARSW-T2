package edu.eci.arsw.coronavirus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.coronavirus.services.ServiceCoronavirus;

@RestController
@RequestMapping("/coronavirus")
public class CoronavirusController {

	@Autowired
	ServiceCoronavirus sercon;

	@RequestMapping(path = "/allCases", method = RequestMethod.GET)
	public ResponseEntity<?> getCaseAll() {

		try {

			return new ResponseEntity<>(sercon.getAllCases(), HttpStatus.ACCEPTED);

		} catch (Exception e) {
			return new ResponseEntity<>("Error no muesta informacion", HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path="/{country}",method= RequestMethod.GET)
	public ResponseEntity<?> getcountry(@PathVariable(name="country") String country ){
		try {
			return new ResponseEntity<>(sercon.getByCountry(country),HttpStatus.ACCEPTED);
		}
		catch(Exception e){
			return new ResponseEntity<>("Error no muestra informacion",HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path="/cases/{country}",method = RequestMethod.GET)
	public ResponseEntity<?> getCasesCountry(@PathVariable(name="country") String country){
		try {
			return new ResponseEntity<>(sercon.getCasesCountry(country),HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			return new ResponseEntity<>("Error no muestra informacion",HttpStatus.NOT_FOUND);
		}
	}

}
