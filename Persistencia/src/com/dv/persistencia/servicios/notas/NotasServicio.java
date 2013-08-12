package com.dv.persistencia.servicios.notas;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dv.persistencia.datos.NotasDatos;
import com.dv.persistencia.entidades.Notas;

@WebService
public class NotasServicio {
	
	@WebMethod
	public Notas crearNotas(Notas nt){
		return NotasDatos.crearNotas(nt);
	}
	
	@WebMethod
	public List<Notas> obtenerNotas(){
		return NotasDatos.obtenerNotas();
	}
}
