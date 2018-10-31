package br.com.Analise.http;



public class Analise {
	private int id;
	private String nomeCliente;
	private double limiteCredito;
	private String risco;
	
	
	
	public Analise() {
		
	}



	public Analise(int id, String nomeCliente, double limiteCredito, String risco) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.limiteCredito = limiteCredito;
		this.risco = risco;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public double getLimiteCredito() {
		return limiteCredito;
	}



	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}



	public String getRisco() {
		return risco;
	}


	public void setRisco(String risco) {
		this.risco = risco;
	}

	
	
}
