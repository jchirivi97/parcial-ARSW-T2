var apiCovid19 =(function(){
	return {
		
		allCountrys: function(callback){
			
			jQuery.ajax({
				url: "/coronavirus/allCases",
				success: function(casostotal){
					callback(casostotal)
				},function(XMLHttpRequest, textStatus, errorThrown) { 
                    alert("No hay informacion suficiente"); 
                }
				
			})
			
			
		}
		
	}
	
	
})();