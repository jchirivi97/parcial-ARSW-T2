var covid19 = (function(){
	
	
	var infAllCountrys = function(){
		apiCovid19.allCountrys(mostrarCountrys);
	
	}
	
	var mostrarCountrys = function(datos){
		
		
		var datos = JSON.parse(datos);
		datos = datos.data.covid19Stats;
		
		
		if (datos != null){
			var objetos = datos.map(function(valor){
				
				return {  country: valor.country,infected: valor.confirmed,
					deaths: valor.deaths,cured: valor.recovered}				
				
			});
			
			$("table tbody").empty();
			objetos.map(function(pais){
				var temp = pais.country
				while
				
				
			});
		}
		
	}
	
	var cantdidadMuertos = function(objetos,pais){
		var muertos = 0;
		var infectados=0;
		var curados=0;
		objetos.map(function(ob){
			if(ob.country == pais){
				muertos += ob.deaths;
				infectados += ob.infected;
				curados += ob.cured;
			}
		});
		return 
	}
	var cantidadInfectaso
	
	
	
	/*----------------------------------------------------*/
	return {
		
		allCountrys : infAllCountrys
		
	}
	
	
	
	
	
})();