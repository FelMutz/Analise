function analisar() {	

	var nomeCliente = document.getElementById("nomeCliente").value;
	var limiteCredito = document.getElementById("limiteCredito").value;
	var risco = document.getElementById("risco").value;
	
	
	let data = {"limiteCredito":limiteCredito,"nomeCliente":nomeCliente,"risco":risco};
	
    
    let jsontosend = JSON.stringify(data);
    
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/Analise/rest/service/analise",
        data: jsontosend,
        dataType: "json",
        contentType: 'application/json; charset=utf-8',
    }).then(function(analise, response, jqXHR) {
        if(jqXHR.status == 204) {
            alert("erro");
        } else {
        	document.getElementById("nomeClienteResult").innerHTML = "Cliente: "+analise.nomeCliente;
        	document.getElementById("limiteCreditoResult").innerHTML =" Limite de Credito: "+analise.limiteCredito;
            document.getElementById("riscoResult").innerHTML =analise.risco;
        }
    }).fail(function(e){
        console.log(e);
        hide_overlay();
    });
}