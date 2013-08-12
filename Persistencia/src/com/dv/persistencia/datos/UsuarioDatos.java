package com.dv.persistencia.datos;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.dv.persistencia.datos.pmf.PMF;
import com.dv.persistencia.entidades.Usuario;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class UsuarioDatos implements ClonDatos<Usuario>{

	public UsuarioDatos() {

	}

	public UsuarioDatos(Usuario us) {
		contraseña = us.getContraseña();
		nombre = us.getNombre();
		nombreCompleto = us.getNombreCompleto();
		
	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	protected Key key;

	@Persistent
	protected String nombre;

	@Persistent
	protected String nombreCompleto;

	@Persistent
	protected String contraseña;

	public static Usuario crearUsuario(Usuario us) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(new UsuarioDatos(us));
			return us;
		} finally {
			pm.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Usuario> obtenerUsuarios() {
		List<UsuarioDatos> listadatos = null;
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		try {
			listadatos= (List<UsuarioDatos>) pm.newQuery(
					"select from " + UsuarioDatos.class.getName()).execute();
		} finally {
			pm.close();
		}
		List<Usuario> res = new ArrayList<Usuario>();
		for (UsuarioDatos usuario : listadatos) {
			res.add(usuario.obtenerEntidad());
		}
		return res;
	}

	@Override
	public Usuario obtenerEntidad() {
		Usuario us = new Usuario();
		us.setContraseña(contraseña);
		us.setNombre(nombre);
		us.setNombreCompleto(nombreCompleto);
		
		return us;
	}
}
