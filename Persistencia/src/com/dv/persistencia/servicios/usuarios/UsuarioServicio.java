package com.dv.persistencia.servicios.usuarios;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dv.persistencia.datos.UsuarioDatos;
import com.dv.persistencia.entidades.Usuario;

@WebService
public class UsuarioServicio {
	
	@WebMethod
	public Usuario crearUsuario(String Nombre, String nombreCompleto, String Pass)
	{
		Usuario us = new Usuario();
		us.setNombre(Nombre);
		us.setContraseña(Pass);
		us.setNombreCompleto(nombreCompleto);
		return UsuarioDatos.crearUsuario(us);
	}
	
	@WebMethod	
	public Usuario obtenerUsuario(String Nombre, String Pass)
	{
		return null;
	}
	
	@WebMethod	
	public List<Usuario> obtenerListaUsuarios()
	{
		return UsuarioDatos.obtenerUsuarios();
	}
	
	@WebMethod	
	public boolean eliminarUsuario(Usuario us)
	{
		return false;
	}
	
	@WebMethod	
	public Usuario modificarUsuario(Usuario us)
	{
		return null;
	}
}
