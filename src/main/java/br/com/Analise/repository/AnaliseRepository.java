package br.com.Analise.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.Analise.http.Analise;
import br.com.Analise.repository.entity.AnaliseEntity;



public class AnaliseRepository {
	
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public AnaliseRepository(){
		
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
		
	}

	
	public void Salvar(Analise analise){
		
		AnaliseEntity analiseEntity = new AnaliseEntity();
		
		analiseEntity.setLimiteCredito(analise.getLimiteCredito());
		analiseEntity.setNomeCliente(analise.getNomeCliente());
		analiseEntity.setRisco(analise.getRisco());
		
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(analiseEntity);
		this.entityManager.getTransaction().commit();
	}
	
	public Analise AnaliseRisco(Analise analise) {
		
		switch(analise.getRisco()) {
			case "A":{
				analise.setRisco("");
				break;
			}
			case "B":{
				analise.setRisco("Taxa 10%");
				break;
			}
			case "C":{
				analise.setRisco("Taxa 20%");
				break;
			}
		}
		
		return analise;
	}
}
