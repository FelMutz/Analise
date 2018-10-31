package br.com.Analise.controller;

 

import javax.ws.rs.Consumes;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Response;

import br.com.Analise.http.Analise;
import br.com.Analise.repository.AnaliseRepository;


@Path("service")
public class ServiceController {

  final AnaliseRepository analiseRepository = new AnaliseRepository();
  	
  /** * 
   * Metodo para gravar a analise
   * */
  @POST 
  @Consumes("application/json; charset=UTF-8")
  @Produces("application/json; charset=UTF-8")
  @Path("/analise")
  public Response login(Analise analise){
	
	  analiseRepository.Salvar(analise);
	  
	  
	  return Response.status(200).entity(analiseRepository.AnaliseRisco(analise)).build();
	  
  }
  
}