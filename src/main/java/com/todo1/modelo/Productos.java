package com.todo1.modelo;

public class Productos {
	private int id;
	private String camisas;
	private String vasos;
	private String comics;
	private String jueguetes;
	private String accesorios;
	
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productos(int id, String camisas, String vasos, String comics, String jueguetes, String accesorios) {
		super();
		this.id = id;
		this.camisas = camisas;
		this.vasos = vasos;
		this.comics = comics;
		this.jueguetes = jueguetes;
		this.accesorios = accesorios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCamisas() {
		return camisas;
	}

	public void setCamisas(String camisas) {
		this.camisas = camisas;
	}

	public String getVasos() {
		return vasos;
	}

	public void setVasos(String vasos) {
		this.vasos = vasos;
	}

	public String getComics() {
		return comics;
	}

	public void setComics(String comics) {
		this.comics = comics;
	}

	public String getJueguetes() {
		return jueguetes;
	}

	public void setJueguetes(String jueguetes) {
		this.jueguetes = jueguetes;
	}

	public String getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}
	 

}
