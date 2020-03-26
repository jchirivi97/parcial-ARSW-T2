var covid19 = (function() {

	var infAllCountrys = function() {
		apiCovid19.allCountrys(mostrarCountrys);

	}

	var existeElemento = function(arreglo, elemento) {

		for (var i = 0; i < arreglo.length; i++) {
			if (arreglo[i] === elemento) {
				return true;
			} else {
				return false;
			}
		}
	}

	var mostrarCountrys = function(datos) {

		var datos = JSON.parse(datos);
		datos = datos.data.covid19Stats;
		paises = [];
		muertes = [];
		infectados = [];
		curados = [];
		if (datos != null) {
			var objetos = datos.map(function(valor) {

				return {
					country : valor.country,
					infected : valor.confirmed,
					deaths : valor.deaths,
					cured : valor.recovered
				}

			});

			objetos.map(function(pais) {
				
				
				if (existeElemento(paises, pais.country)) {
					
					var pos = paises.indexOf(pais.country);
					muertes[pos] = muertes[pos] + pais.deaths;
					infectados[pos] = infectados[pos] + pais.infected;
					curados[pos] = curados[pos] + pais.cured;
				} else {
					
					paises.push(pais.country);
					muertes.push(pais.infected);
					infectados.push(pais.deaths);
					curados.push(pais.cured);
				}

			});
			$("#table tbody").empty();
			for (var i = 0; i < paises.length; i++) {
				
				var columna = '<tr scope="row"><td>' + paises[i] + '</td><td>' + muertes[i]
						+ '</td><td>' + infectados[i] + '</td><td>'
						+ curados[i] + '</td></tr>';
				$("#table tbody").append(columna);
			}

		}

	}

	/*----------------------------------------------------*/
	return {

		allCountrys : infAllCountrys

	}

})();