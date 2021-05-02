/**
 * 
 */

 function alertPage(dt){

	if(dt.length > 7){
		var word = "date";		
	}
	else{
		var word = "time";
	}
	alert('This is the '+ word + ' template');
};