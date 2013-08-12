package com.dv.persistencia.entidades;

import java.util.Date;

import com.google.appengine.api.datastore.Key;


public class Notas{
	
	

	protected String nota;
	

	protected String autor;
	

	protected Date fecha;

	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
