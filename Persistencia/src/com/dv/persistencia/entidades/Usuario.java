package com.dv.persistencia.entidades;

import com.google.appengine.api.datastore.Key;

public class Usuario{
	
	//Campos
    
	
	protected String nombre;
	
	protected String nombreCompleto;
	
	protected String contrase�a;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	
}
