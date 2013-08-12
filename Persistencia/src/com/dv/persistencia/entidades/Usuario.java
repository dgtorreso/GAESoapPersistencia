package com.dv.persistencia.entidades;

import com.google.appengine.api.datastore.Key;

public class Usuario{
	
	//Campos
    
	
	protected String nombre;
	
	protected String nombreCompleto;
	
	protected String contraseña;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	
}
