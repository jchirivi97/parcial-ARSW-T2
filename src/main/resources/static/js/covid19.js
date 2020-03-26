var covid19 = (function(){
	
	
	var infAllCountrys = function(){
		apiCovid19.allCountrys(mostrarCountrys);
	
	}
	
	var mostrarCountrys = function(datos){
		
		
		var datosok = JSON.parse(datos);
		
		alert(datos);
		
		if (datos != null){
			var objetos = datosok.map(function(datos){
				
				return {  country: datos.country,infected: datos.confirmed,
					deaths: datos.deaths,cured: datos.recovered}				
				
			});
			alert(" datos trnasforms " + objetos);
		}
		
	}
	
	
	/*----------------------------------------------------*/
	return {
		
		allCountrys : infAllCountrys
		
	}
	
	
	
	
	
})();