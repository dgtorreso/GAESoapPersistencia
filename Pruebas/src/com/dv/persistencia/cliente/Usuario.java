package com.dv.persistencia.cliente;

import java.util.List;

import com.dv.persistencia.cliente.auto.UsuarioServicio;
import com.dv.persistencia.cliente.auto.UsuarioServicioService;

public class Usuario {
	public static void main(String[] args){
		UsuarioServicioService serv = new UsuarioServicioService();
		UsuarioServicio puerto = serv.getUsuarioServicioPort();
		//puerto.crearUsuario("dgto", "david gustavo", "123456");
		puerto.crearUsuario("salamandra", "ernesto mejias", "4665");
		puerto.crearUsuario("colorado", "pelado perez", "44882");
		puerto.crearUsuario("asuma", "laluna cala", "435456");
		
		List<com.dv.persistencia.cliente.auto.Usuario> res = puerto.obtenerListaUsuarios();
		
		for (com.dv.persistencia.cliente.auto.Usuario usuario : res) {
			System.out.println(usuario.getNombreCompleto());
		}
		
		System.out.println("terminó");
		
	}
}
