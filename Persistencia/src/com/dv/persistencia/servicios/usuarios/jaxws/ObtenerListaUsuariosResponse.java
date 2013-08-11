
package com.dv.persistencia.servicios.usuarios.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerListaUsuariosResponse", namespace = "http://usuarios.servicios.persistencia.dv.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaUsuariosResponse", namespace = "http://usuarios.servicios.persistencia.dv.com/")
public class ObtenerListaUsuariosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.dv.persistencia.entidades.Usuario> _return;

    /**
     * 
     * @return
     *     returns List<Usuario>
     */
    public List<com.dv.persistencia.entidades.Usuario> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.dv.persistencia.entidades.Usuario> _return) {
        this._return = _return;
    }

}
