package com.dv.persistencia.datos;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

import com.dv.persistencia.datos.pmf.PMF;
import com.dv.persistencia.entidades.Usuario;


public class UsuarioDatos {
	
	public static Usuario crearUsuario(Usuario us){
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
            pm.makePersistent(us);
            return us;
        } finally {
            pm.close();
        }		
        
	}
	@SuppressWarnings("unchecked")
	public static List<Usuario> obtenerUsuarios(){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		try {
			return (List<Usuario>)pm.newQuery("select from " + Usuario.class.getName()).execute();
        } finally {
            pm.close();
        }		
	}
}
