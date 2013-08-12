package com.dv.persistencia.datos;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.dv.persistencia.datos.pmf.PMF;
import com.dv.persistencia.entidades.Notas;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class NotasDatos implements ClonDatos<Notas> {
	public NotasDatos() {

	}
	

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String nota;

	@Persistent
	private String autor;

	@Persistent
	private Date fecha;

	public static Notas crearNotas(Notas nt) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(new NotasDatos(nt));
			return nt;
		} finally {
			pm.close();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Notas> obtenerNotas() {
		List<NotasDatos> listadatos = null;
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		try {
			listadatos= (List<NotasDatos>) pm.newQuery(
					"select from " + NotasDatos.class.getName()).execute();
		} finally {
			pm.close();
		}
		List<Notas> res = new ArrayList<Notas>();
		for (NotasDatos nota : listadatos) {
			res.add(nota.obtenerEntidad());
		}
		return res;
	}
	
	public Notas obtenerEntidad(){
		Notas nota = new Notas();
		nota.setAutor(this.autor);
		nota.setFecha(this.fecha);
		nota.setNota(this.nota);	
		return nota;
	}
	public NotasDatos(Notas nota){
		this.autor = nota.getAutor();
		this.fecha = nota.getFecha();
		this.nota = nota.getNota();
	}
}
